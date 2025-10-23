package com.dsa.problems.linked_list;

public class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    public Node(){
        this.data = 0;
        this.next = null;
    }

    public static void display(Node head){
            while(head!=null){
                System.out.print(head.data+" ");
                head=head.next;
            }
            System.out.println();
    }
}
