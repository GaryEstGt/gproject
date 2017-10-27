/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6garymoran;

/**
 *
 * @author t203
 */
public class Lab6GaryMoran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedPositionalList<String> lista1=new LinkedPositionalList();
        Position<String> P0,P1,P2,P3;
        P0=lista1.addFirst("g");
        P1=lista1.addAfter(P0,"f");
        P2=lista1.addAfter(P1,"b");
        P2=lista1.addAfter(P2,"c");
        P2=lista1.addAfter(P2,"d");
        P3=P2;
        lista1.addAfter(P3,"e");
        System.out.println("--------------------------Posiciones----------------------------");
        System.out.println("elemento "+ P1.getElement());
      
       lista1.getP2();
        lista1.getP3();
    }
    
}
