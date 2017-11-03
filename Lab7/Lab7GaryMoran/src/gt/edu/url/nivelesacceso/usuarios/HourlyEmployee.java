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
public abstract class HourlyEmployee extends Employee {
    protected int hoursPerWeek;
    protected double hourlyWage;
    @Override
    public double monthlyPay() {
        return 1000.00;
    }

    @Override
    public abstract double annualPay();
    
}
