package w1d3;

import w1d2.Word;

public class ListNode {

    private Word data;
    private ListNode next;

    public ListNode(Word data){
        this.data = data;
    }

    public Word getData() {
        return data;
    }

    public void setData(Word data) {
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
