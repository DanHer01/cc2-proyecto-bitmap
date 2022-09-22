/* Se encarga de generar las 4 imagenes
de la pt 1. RGB & Sepia. */

import java.util.regex.*;
import java.io.*;

public class BmpHandlerCore {
    //Campos
    String imageName;
    String PatternString = "\\w+\\.bmp$";
    
    Pattern p = Pattern.compile(PatternString);
    Matcher m = p.matcher(imageName);
    InputStream inputimage = new FileInputStream(imageName);

    //Constructor
    public BmpHandlerCore(String name) {
        imageName = name;
    }

    //Metodos
    public String getImageName() {
        return imageName;
    }
}
