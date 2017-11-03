/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.nivelesacceso.usuarios;

/**
 *
 * @author t203
 */
public abstract class SalariedEmployee extends Employee{
    int annualSalary;
    public SalariedEmployee(){
        name="Gary";
        setHireYear(1990);
        country="Guatemala";
    }

    @Override
    public double monthlyPay() {
        return annualSalary/12;
    }

    @Override
    public abstract double annualPay();
     
}
