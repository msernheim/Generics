/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlistgenerics;

/**
 *
 * @author Sernheim
 */
public class LinkedList<T> {
    
    /**
     * @param args the command line arguments
     */
    Node<T> top;
    
    public LinkedList(Node<T> topNode){
    this.top = topNode;
    }
    public LinkedList(){
    this.top = null;
    }

    public void setTop(T element){
        Node<T> temp = top;
        this.top = new Node<>(element,temp);
               
    }
}
