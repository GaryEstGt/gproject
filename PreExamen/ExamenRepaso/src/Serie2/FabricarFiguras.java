/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serie2;

import java.util.Scanner;

/**
 *
 * @author garya
 */
public class FabricarFiguras {
    Cuadrilatero cuadri=new Cuadrilatero();
    Hexagono hexa=new Hexagono();
    Pentagono penta=new Pentagono();
    Octagono octa=new Octagono();
    Triangulo tri=new Triangulo();
    double ancho;
    double altura;
    
    public void FabricarFigura(String fig,double ancho,double altura){
        if(fig=="Cuadrilatero"){
            cuadri.setAltura(altura);
            cuadri.setAncho(ancho);
            System.out.println("area"+cuadri.area()+" perimetro"+cuadri.perimetro());            
        }
        else if(fig=="Triangulo"){
            tri.setAltura(altura);
            tri.setAncho(ancho);
            Scanner reader = new Scanner(System. in);
            System.out.println("ingrese lado 1");
            double l1=reader.nextDouble();
             System.out.println("ingrese lado 2");
            double l2=reader.nextDouble();
             System.out.println("ingrese lado 1");
            double l3=reader.nextDouble();
            tri.setLado1(l1);
            tri.setLado2(l2);
            tri.setLado3(l2);
            System.out.println("area"+tri.area()+" perimetro"+tri.perimetro()); 
        }
        else if(fig=="Pentagono"){
            penta.setApotema(altura);
            penta.setAncho(ancho);
            System.out.println("area"+penta.area()+" perimetro"+penta.perimetro()); 
        }
        else if(fig=="Octagono"){
             octa.setAltura(altura);
            octa.setAncho(ancho);
            System.out.println("area"+octa.area()+" perimetro"+octa.perimetro()); 
        }
        else if(fig=="Hexagono"){
             hexa.setAltura(altura);
            hexa.setAncho(ancho);
            System.out.println("area"+hexa.area()+" perimetro"+hexa.perimetro()); 
        }
    }
}
