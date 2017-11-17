/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.url.edu.Gary;

import java.io.IOException;

/**
 *
 * @author t203
 */
public class Main {
           
     public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FileLoader file=new FileLoader();
                String nombre="";
        System.out.println("Ingrese nombre del archivo");
        String ruta="C:\\Users\\t203\\Desktop\\"+nombre+".txt";
        String texto=file.loadFileWithJava8(ruta);
        texto+="Gary Moran 1062917";
        file.writeUsingFileWriter(texto, ruta);
        DemoGraphviz DemoGraficar=new DemoGraphviz();
        DemoGraficar.createDemoGraph();
    }  

}
