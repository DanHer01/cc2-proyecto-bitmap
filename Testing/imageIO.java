import java.io.*;

public class imageIO {
    /*
    File file = new File("/path/to/outputFile.bmp"));
    ImageIO.write(bufferedImage, "BMP", file);
    BufferedImage image = ImageIO.read(bmpFileOrInputStreamOrURL);
    InputStream is = new BufferedInputStream(new FileInputStream("source.bmp"));
    */
    
    public static void main(String[] args) throws IOException { 
        
        System.out.println("Existe el archivo? " + Boolean.toString(new File("Testing\\tokyoRetro.bmp").exists()));
        try {
            InputStream fis = new FileInputStream("Testing\\tokyoRetro.bmp");
            System.out.println("Los bytes del archivo son: " + fis.available());
                for (int i=0; i<54; i++) {
                    byte b = (byte)fis.read();
                    //Byte to bits
                    String s2 = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
                    System.out.println(s2);
                    if (i==14) {
                        result = s2;
                        int foo = Integer.parseInt(result, 2);
                        System.out.println(foo); 
                    }
                    if (i==18) {
                        System.out.println(b); 
                    }
                    if (i==22) {
                        System.out.println(b); 
                    }
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
    }   
}
