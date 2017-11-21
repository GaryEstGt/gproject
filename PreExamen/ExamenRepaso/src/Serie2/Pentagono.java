/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serie2;

/**
 *
 * @author garya
 */
public class Pentagono implements Poligono{
     private double apotema;
    private double ancho;

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double altura) {
        this.apotema= altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    @Override
    public double area() {
        return 5*((apotema*ancho)/2);
    }

    @Override
    public double perimetro() {
        return 5*ancho;
    }
    
}
