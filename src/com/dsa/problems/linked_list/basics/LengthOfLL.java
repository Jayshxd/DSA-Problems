package com.dsa.problems.linked_list.basics;

public class LengthOfLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.next =b;
        b.next =c;
        c.next =null;
        lengthR(a);
    }
    public static void lengthI(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head=head.next;
        }
        System.out.println(count);

    }
    public static void lengthR(Node head)
    {
        int count = 0;
        if(head==null) return;
        lengthR(head.next);
        System.out.println(++count);
    }
}
