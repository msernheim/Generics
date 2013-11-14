/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlistgenerics;

/**
 *
 * @author Sernheim
 * @param <T>
 */
public class Node<T> {
    private T element;
    private Node<T> next;

    public Node(T element, Node<T> next){
        this.element = element;
        this.next = next;
    }   
    public T getElement(){
        if(this != null){
            return this.element; 
        }
        else {
            return null;
        }
    }
    public Node<T> getNext(){
    return this.next;
    }
}

