package com.dsa.problems.linked_list;

import com.dsa.problems.linked_list.basics.Display;

public class InsertionAtSpecificPosition {
    public static class Node {
        public int data;
        public Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        public Node(){
            this.data = 0;
            this.next = null;
        }
    }
    public static void insetAtPos(int pos,Node head,int data){
        display(head);
        Node newNode = new Node(data);
        Node temp =head;
        int c = 1;
        while(c<pos-1 && temp.next!=null){
            temp=temp.next;
            c++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        display(head);
    }
    public static void display(Node head) {
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node a  = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        head.next = a;
        a.next = b;
        b.next = c;
        insetAtPos(3,head,999);
    }
}
