import java.io.*;
import java.util.Arrays;


public class FileInputStreamTest  {  
    
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("Testing\\tokyoRetro.bmp"); 
        OutputStream fos = new FileOutputStream("Testing\\newImageTest.bmp");
        OutputStream redImage = new FileOutputStream("Testing\\RedImage.bmp");
        
        //Getting the length of FileInputStream to initialize array
        int lengthOriginal = fis.available();
        
        //This is where we save and modify the array
        int[] listOfBytes = new int[lengthOriginal];
        int[] redArray = new int[lengthOriginal];
        
        for (int i = 0; i < lengthOriginal; i++) {
            listOfBytes[i] = fis.read(); 
            fos.write(listOfBytes[i]);
        }
        //Print Array of pixels (Optional)
        //System.out.println(Arrays.toString(listOfBytes));
        
        //Test reading BM
        //char c = (char) (b & 0xFF);
        char c = (char) (listOfBytes[0]);
        char c2 = (char) (listOfBytes[1]);
        System.out.println(c +"\s"+ c2);
        
        //Second image
        for (int i = 0; i < 54; i++) {
            redArray[i] = listOfBytes[i]; 
            redImage.write(redArray[i]);
        }
        for (int i = 54; i < lengthOriginal; i=i+1) {
            redArray[i] = listOfBytes[i]; 
            redImage.write(redArray[i]);
        }
        System.out.println(Arrays.toString(redArray)); 

    }

    
}
