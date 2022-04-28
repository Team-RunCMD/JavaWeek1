package w1d3;

import w1d2.Word;

public class ListNode<T> {

    private T data;
    private ListNode next;


    public ListNode(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public String toString(){
        return data.toString();
    }
}
