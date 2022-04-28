package w1d3;

import w1d2.Word;

public class TedsList<T>{
    /*
    lists are essentially sequential - they are an ordered list of elements that we can add, remove, and get indexes from
    queues are first in first out structures
    stacks are last in first out structures

    sets are collections of unique elements
    maps are collections of unique keys mapped to values
     */

    ListNode head;
    /*
    default constructor:
    public TedsList(){
        head = null;
    }

     */

    public void addToFront(T w){
        ListNode newNode = new ListNode(w);
        newNode.setNext(head);
        head = newNode;
        System.out.println("Added node "+ w + " to front");
    }

    public void removeFromFront(){
        if(head!=null) {
            head = head.getNext();
        }
    }

    public T getIndex(int n){
        ListNode current = head;
        for(int i = 0; i < n; i++){
            current = current.getNext();
        }
        return (T) current.getData();
    }

    public void removeIndex(int n){
        ListNode current = head;
        ListNode prev = null;
        for(int i = 0; i < n; i++){
            prev = current;
            current = current.getNext();
        }
        prev.setNext(current.getNext());
//        if nothing is pointing to an object in java anymore,
//        it is removed from memory automatically
//        this is called garbage collection in java

    }

    public String toString(){
        String out = "";
        ListNode current = head;
        while(current!= null){
            out = out + current.toString()+", ";
            current = current.getNext();
        }
        return out;
    }
}
