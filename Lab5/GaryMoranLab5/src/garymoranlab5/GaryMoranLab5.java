/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garymoranlab5;

/**
 *
 * @author t203
 */
public class GaryMoranLab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String a = "Che";
        System.out.println("Hello World " + a + "!");
        Node al =new Node();
        al.setPropiedad("Gua");
        Node bl=new Node();
        bl.setPropiedad("Mex");
        al.setNext(bl);
         Node cl=new Node();
         cl.setPropiedad("USA");
         al.getNext().setNext(cl);
         Node dl=new Node();
         dl.setPropiedad("Esp");
         al.getNext().getNext().setNext(dl);
         System.out.println(al.getPropiedad());
         System.out.println(al.getNext().getPropiedad());
         System.out.println(al.getNext().getNext().getPropiedad());
          System.out.println(al.getNext().getNext().getNext().getPropiedad());*/
          //listaenlazada
          SingleLinkedList lista=new SingleLinkedList();
          lista.addFirst("GUA");
          lista.addLast("Mex");
          lista.addLast("Usa");
          lista.addLast("Esp");
          lista.addLast("Fra");
          lista.addLast("Ita");
          lista.addLast("Rus");
          lista.addLast("Japon");
          System.out.println(lista.first());
          System.out.println(lista.tail());
          String valor=lista.removeFirst();
          while(valor != null){
              System.out.println(valor);
              valor=lista.removeFirst();
          }
    }
     private static class Node{
        private String propiedad;
        private Node next;
        
        private Node getNext(){
            return next;
        }
        private void setNext(Node next){
            this.next=next;
        }
        private String getPropiedad(){
            return propiedad;
        }
        private void setPropiedad(String pro){
            this.propiedad=pro;
        }
    }
    
}
