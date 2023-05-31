package ALexico;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Integrantes: 
JUAN JOSÉ AGUILAR GONZÁLEZ 20201020063​

JUAN ESTEBAN TORRES ACOSTA 20192020052​

SANTIAGO JOSE GARCIA TORO 20201020170​

BRIAN STEVEN DEVIA GAITAN  20181020119​

*/

public class AnalizadorLexico {
    public static void main(String[] args) throws Exception {
        String ruta1= "../analizadorSemantico/src/ALexico/Lexer.flex";
        String ruta2= "../analizadorSemantico/src/ALexico/LexerCup.flex";
        String[] rutaS = {"-parser","Sintax","../analizadorSemantico/src/ALexico/Sintax.cup"};
        
        generar(ruta1, ruta2, rutaS);
    }
    public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception {
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        
        
        Path rutaSym = Paths.get("../analizadorSemantico/src/ALexico/sym.java");
        if(Files.exists(rutaSym)){
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("../analizadorSemantico/sym.java"),
                Paths.get("../analizadorSemantico/src/ALexico/sym.java")
        );
        
        Path rutaSin = Paths.get("../analizadorSemantico/src/ALexico/Sintax.java");
        if(Files.exists(rutaSin)){
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("../analizadorSemantico/Sintax.java"),
                Paths.get("../analizadorSemantico/src/ALexico/Sintax.java")
        );
    }
}