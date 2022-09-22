// SOLO con imágenes de 640X480 en formato de 24 bits 
// (esto significa que por cada pixel tienen 3 bytes)
import java.io.*;
//

public class BMPImageHandler {
    public static void main(String[] args) throws Exception {
       if (args.length == 0) {
            System.out.println("Por favor, ingrese un argumento o -help para ayuda.");
        } else {
            switch (args[0]) {
            case "-basics":
                System.out.println("Procesando RGB...");
                BmpHandlerCore hc = new BmpHandlerCore(args[1]);
                System.out.println(hc.getImageName());
                break;
            case "-rotate":
                System.out.println("Rotando la imagen...");
                break;
            case "-resize":
                System.out.println("Resizing la imagen...");
                break;
            case "-all":
                System.out.println("Procesando RBG, rotanto y ajustando la imagen...");
                break;
            case "-help":
                System.out.println("Desplegando ayuda...\n");

                File file = new File("help.txt");
                BufferedReader br = new BufferedReader(new FileReader(file));
                String help;
                while ((help = br.readLine()) != null) {
                    System.out.println(help);
                }
                break;    
            default: 
                System.out.println("Opcion no valida!");
            }
        } 
    }
}
