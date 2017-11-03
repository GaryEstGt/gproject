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
public abstract class Employee {
        public String name;//Deafult
        private int hireYear;
        protected String country;
        
        public void setHireYear(int hy){
            hireYear=hy;
        }
        public int getHireYear(){
            return hireYear;
        }
        public abstract double monthlyPay();
        public abstract double annualPay();
        
}
