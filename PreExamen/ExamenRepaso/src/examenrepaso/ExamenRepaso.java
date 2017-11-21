/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrepaso;

import Serie1.CodigoCesar;

/**
 *
 * @author garya
 */
public class ExamenRepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CodigoCesar codi=new CodigoCesar();
        System.out.println(codi.cifrarCesar("Hola", 3));
        System.out.println("------------------------------");
         System.out.println(codi.cifrarCesae("Hola", "ABCDEFGHIJKLMNO", 2));
    }
    
}
