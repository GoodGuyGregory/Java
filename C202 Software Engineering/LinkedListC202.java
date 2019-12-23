/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistc202;

import java.util.Stack;

/**
 *
 * @author gawitt
 */
public class LinkedListC202 {
    
    private int size = 0;
    private class Node <E> {
        E element;
        Node <E> next;
     public Node(E e){
         element = e;
     }//constructor
        
    }//node
    
    private Node head;
    private Node temp;
    private Node tail;
    
    public LinkedListC202(){
        head = new Node(null);
        tail = new Node(null);
        size = 0;
    }//construtor
    //in single directional link lists never EVER loose the HEAD it controls the start position of the Link list.
    public <E> void add(E e){
        if(size == 0){
            head = new Node <>(e);
            System.out.println("Loaded first item..");
            size++;
        }//if        
        
        else{
            Node temp = new Node(e);
            Node current = head;
            while(current.next!=null){
                current = current.next; //moved the previous node down the line to add a new starting point ie. Head of the list. 
            }//while//at the end of the list. 
            current.next = temp;
            size++; //increased the size of the node
            
            }//else
        
        }//add at the end everytime.
    Stack <Object> s1 = new Stack <>(); // stack objects have a method included in them called pop and are stored in a LIFO way
    
    public <E> void reverseReverse(){
        System.out.println("Reverse Reverse");
        while(head!=null){
            s1.push(head.element);
            head = head.next;
            System.out.println("Reverse reverse");
        }//while
        while(!s1.empty()){
            System.out.print(s1.pop()+",");//last in first out order is implied in a stack 
            
        }//while
        System.out.println("Cha cha real Smoothe.");
        
    }//reverseReverse 
    
//3.//
    
    public <E> boolean contains(E O){
        boolean ans = false;
        //go through the list and return true if the generic object is in the link list.
        temp = new Node(null);
        temp = head;
        System.out.println("Looking for the object...");//echo
        while(temp.next != null){//while we arent finished looking ie we aren't at the end of the list yet. 
            System.out.println("Hold on....");
            if(temp.element.equals(O))
                return true;
            temp = temp.next;
            
        }//while
        System.out.println("Looks like it isn't on the list bud...");
        return ans;
    }//contains
    
    public <E> void display(){ //method to show the linkList
        temp = new Node(null);
        temp = head; // dont move the head just use a temp reference.
        System.out.println("[");// beginning of the display just a "bracket"
        while(temp.next!=null){
            System.out.print(temp.element + ","); //print not print ln to display the items on one line.
            temp = temp.next; // moving on down the list. until the temp reference element doesn reference null. 
        }//while
        System.out.println(temp.element + "]");
    }//display
    
    
        public static void main(String[] args) {
        
    }//main
    
    
}//class
