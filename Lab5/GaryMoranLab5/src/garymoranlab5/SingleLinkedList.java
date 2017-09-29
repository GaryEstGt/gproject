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
public class SingleLinkedList {
    //Node
         private static class Node{
        private String propiedad;
        private Node next;
        public Node(String e, Node n){
            this.propiedad=e;
            this.next=n;
        }
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
    //Termina Node
    private Node head=null;
    private Node tail=null;
    private int size=0;
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public String first(){
        if(isEmpty()){
            return null;
        }
        else{
            return head.getPropiedad();
        }
    }
    public String tail(){
        if(isEmpty()){
            return null;
        }
        else{
            return tail.getPropiedad();
        }
    }
    public void addFirst(String e){
        Node newest=new Node(e,head);
        head=newest;
        if(size==0){
            tail=head;
        }
        else{
          size++;
        }
    }
    public void addLast(String e){
        Node newest=new Node(e,tail);
        if(isEmpty()){
            head=newest;
        }
        else{
            tail.setNext(newest);
            tail=newest;
            size++;
        }  
        
    }
    public String removeFirst(){
        if(isEmpty()){
            return null;
        }
        else{
            String res=head.getPropiedad();
            head=head.getNext();
            size--;
            if(size==0){
                tail=null;
            }
            return res;
        }
    }
    
}
