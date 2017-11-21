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
public class Cuadrilatero implements Poligono {

    private double altura;
    private double ancho;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    @Override
    public double area() {
       return ancho*altura;
    }

    @Override
    public double perimetro() {
        return 2*ancho+2*altura;
    }
    
}
