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
public class LinkedListGenerics<T> {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Node<String> n1 = new Node<>("Hejsanhoppsan!",null);
        Node<String> n0 = new Node<>("Julgran", n1);
        LinkedList<String> list = new LinkedList<>(n0);
        list.setTop("Tjäna!");
        //list.setTop(135);
        System.out.println(list.top.getNext().getNext().getElement());
       
        LinkedList<Integer> intList = new LinkedList<>();
        System.out.println(intList.top);
        intList.setTop(12);
        System.out.println(intList.top.getElement());
        //intList.setTop("Tjäna!")
    
    } 
}
