package org.eclipse.che.examples;

public class Triangle implements Shape{
    private double base;
    private double height;
      public Triangle(double bas, double he){
        this.base=bas;
        this.height=he;
    }
     public double getArea(){
        return (this.base*this.height)/2;
    }
    public String toString(){
        return "Triangle[ Base "+this.base+" height "+this.height+" area "+ this.getArea()+" ]";
    }
}
