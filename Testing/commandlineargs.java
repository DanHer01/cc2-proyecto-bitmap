public class commandlineargs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, ingrese un argumento.");
        } else {
            switch (args[0]) {
            case "-basics":
                System.out.println("Procesando RGB...");
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
                System.out.println("Desplegando ayuda...");
                break;    
            default: 
                System.out.println("Opcion no valida!");
            }
        }
    }   
}
