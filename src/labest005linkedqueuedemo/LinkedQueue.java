/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labest005linkedqueuedemo;
import java.util.EmptyStackException;

public class LinkedQueue<T> implements QueueADT<T> {
    
    private LinearNode<T> front;
    private LinearNode<T> rear;
    private int c;

    public LinkedQueue(){
        c = 0;
        front = rear = null;
        }
    
    public void enqueue (T element){
        
       LinearNode<T> node = new LinearNode<T>(element);
       
        if (isEmpty( ))
            front = node;
        else
            rear.setNext (node);
            
        rear = node;
        c++;
    }
     
    public T dequeue ( ) throws EmptyStackException{
        if (isEmpty( ))
        throw new EmptyStackException();
        
        T result = front.getElement( );
        front = front.getNext( ); 
        c--;    
        
         if (isEmpty( ))   
            rear = null;  
         c--;    
      
         
         return result;
}   

    public T first() throws EmptyStackException{
    if (isEmpty())
      throw new EmptyStackException(); 

    return front.getElement();
  }


    public boolean isEmpty(){
        return (c==0);
        }


    public int size(){
        return c;
        }
    
    public String toString()
  {
    String r = "";
    LinearNode current = front;

    while (current != null)
    {
      r = "\n"+r + (current.getElement()) + "\n";
      current = current.getNext();
    }

    return r;
  }
    
}
