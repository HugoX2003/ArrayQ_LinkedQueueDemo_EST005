/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labest005linkedqueuedemo;

/**
 *
 * @author Márquez Diestra, Hugo
 */
public class LinkedQueueDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedQueue cola = new LinkedQueue();
        cola.enqueue("Maria");
        cola.enqueue("Gladys");
        cola.enqueue("Serena");
        cola.enqueue("Emiliana");
        cola.enqueue("Marianella");

        System.out.println("SIMULACION DE UNA COLA DE NOMBRES"+"\n");
        System.out.println("El nombre en el FRENTE de la cola es: " + cola.first()+"\n");
        System.out.println("Numero de nombres que han sido agregados(enqueue) a la cola es: "+cola.size()+"\n");
        System.out.println("Contenido de la COLA via toString: " + cola+"\n");
        System.out.println("Contenidos individualmente extraido (dequeue): "+cola.dequeue()+", "+cola.dequeue()+", "+cola.dequeue()+", "+cola.dequeue()+", "+cola.dequeue()+"\n");
        System.out.println("Ahora la Cola ahora esta vacia");

    }
}

