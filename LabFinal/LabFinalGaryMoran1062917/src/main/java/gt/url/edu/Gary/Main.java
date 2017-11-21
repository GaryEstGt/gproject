/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.url.edu.Gary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

/**
 *
 * @author t203
 */
public class Main {
           
     public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FileLoader file=new FileLoader();
                String nombre="";
                char[] datos;
         Reader f = null;
                Scanner reader = new Scanner(System. in);
        System.out.println("Ingrese nombre del archivo");
        nombre=reader.next();
        String ruta="C:\\Users\\garya\\Desktop\\"+nombre+".txt";
        String texto=file.loadFileWithJava8(ruta);
        datos=new char[texto.length()];
         for (int i = 0; i < texto.length(); i++) {
             datos[i]=texto.charAt(i);
         }
        texto+="Gary Moran 1062917";
        file.writeUsingFileWriter(texto, ruta);
        DemoGraphviz DemoGraficar=new DemoGraphviz();
        DemoGraficar.createDemoGraph(datos);
        DemoGraficar.GuardarGrafo();
        
    }  

}
