package com.dsa.problems.linked_list;

public class LL_BASICS {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.next = b;
        b.next = c;
        c.next = null;
        display(a);

    }
    public static void display(Node head){
        if(head == null) return;
        System.out.print("["+head.data+"]"+"->");
        display(head.next);
           }
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
}
