/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labest005linkedqueuedemo;


public class LinearNode<E> {
    
    private LinearNode<E> next;   
    private E element;           

    public LinearNode() {        
        next = null;
        element = null;
    }
    
    public LinearNode(E elem)     
    {
        next=null;
        element= elem;
    }


    
    public LinearNode<E> getNext() {  
        return next;
    }

    public void setNext(LinearNode<E> node) {
        next = node;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E elem) {
        element = elem;
        
    }
}
