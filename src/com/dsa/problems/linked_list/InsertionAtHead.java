package com.dsa.problems.linked_list;

public class InsertionAtHead {
    public static class Node{
        int data;
        Node next;
        Node(){
            this.data=0;
            this.next=null;
        }
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        insertAtHead(a,5);
    }
    public static void insertAtHead(Node head,int data){
        display(head);
        Node temp=new Node(data);
        temp.data=data;
        temp.next=head;
        head=temp;
        display(head);
    }

    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data+"-->");
            head=head.next;
        }
        System.out.print("null");
        System.out.println();
    }

}
