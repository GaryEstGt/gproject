/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serie3;

/**
 *
 * @author garya
 */
public class ManoCartas {
    DoubleLinkedList<SimuladorCartas> listaCartas=new DoubleLinkedList<>();
    public void AgregarCarta(int valor,String categoria){
        SimuladorCartas temp=new SimuladorCartas();
        temp.setCategoria(categoria);
        temp.setValor(valor);        
        listaCartas.addLast(temp);
    }
}
