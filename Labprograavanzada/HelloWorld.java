package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {
        Shape a1,b1,c1;
        
        a1=new Rectangle(10,10);// toma forma de rectangulo - polimorfico
        b1=new Triangle(10,4);// toma forma de triangulo - polimorfico
        c1=new Rectangle(5,5);
        System.out.println(a1.toString());
        System.out.println(b1.toString());
        System.out.println(c1.toString());
        
        c1=b1;
        System.out.println(c1.toString());
    }
}
