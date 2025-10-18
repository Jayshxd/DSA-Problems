package com.dsa.problems.linked_list;

public class InsertionAtLast {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        insertAtLast(head,100);
    }
    public static void insertAtLast(Node head,int data){
        Node.display(head);
        Node temp =head;
        Node newNode = new Node(data);
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        Node.display(head);
    }


}
