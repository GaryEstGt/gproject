package org.eclipse.che.examples;

public class Rectangle implements Shape {
    private double width;
    private double lenght;
    public Rectangle(double wid, double len){
        this.width=wid;
        this.lenght=len;
    }
    public double getArea(){
        return (this.width*this.lenght);
    }
    public String toString(){
        return "Rectangle[ width "+this.width+" lenght "+this.lenght+" area "+ this.getArea()+" ]";
    }
}
