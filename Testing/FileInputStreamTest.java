import java.io.*;
import java.util.Arrays;


public class FileInputStreamTest  {
    public static void main(String[] args) throws IOException {
        int[] listOfBytes = new int[54];
        InputStream fis = new FileInputStream("Testing\\tokyoRetro.bmp");  
        for (int i = 0; i < 54; i++) {
            listOfBytes[i] = fis.read(); 
        }
        System.out.println(Arrays.toString(listOfBytes));
        // Image FileSize in a String of bits
        String BitCount = Integer.toBinaryString(listOfBytes[29]) + Integer.toBinaryString(listOfBytes[30]);
        System.out.println(BitCount + " value in bits");
        //int foo = Integer.parseInt(BitCount, 2);
        //System.out.println(foo);
        
        

        //Display first to bytes as characters
        
        //Reading filesize
        File f = new File("Testing\\tokyoRetro.bmp");
        long fileSize = f.length();
        
        System.out.format("The size of the file: %d bytes", fileSize);
        
    }
}
