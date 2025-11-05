package com.dsa.problems.linked_list;

public class DoublyLL {
    Node head;
    Node tail;
    int size;
    public DoublyLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public static class Node{
        Node prev,next;
        int data;

        public Node(int data) {
            this.prev = null;
            this.next = null;
            this.data = data;
        }



    }




    public void atHead(int data){
        Node temp = new Node(data);
        if(head==null){
        head = temp;
        tail = temp;
        size++;
            System.out.println("List was empty and insertion done size is : "+size);
            return;
        }
        temp.next = head;
        head.prev = temp;
        head = temp;
        size++;
        System.out.println("insertion done size is : "+size);
        return;
    }
    public void atTail(int data){
        Node newNode = new Node(data);
        if(tail==null || head==null){
            head = newNode;
            tail = newNode;
            size++;
            System.out.println("List was empty and insertion done size is : "+size);
            return;
        }
        // Non-empty list ka O(1) logic (Bina loop)
        newNode.prev = tail; // 1. Naye node ko purane tail se jodo
        tail.next = newNode; // 2. Purane tail ko naye node se jodo
        tail = newNode;      // 3. Tail pointer ko update karo

        size++;
        System.out.println("insertion done size is : " + size);
    }
    public void atPos(int data, int pos){
        if(pos>size+1 || pos<1){
            System.out.println("Position out of bounds");
            return;
        }
        if(pos==1){
            atHead(data);
        }else if(pos==size+1){
            atTail(data);
        }else {
            Node newNode = new Node(data);
            Node temp = head;
            int count = 1;
            while (count < pos - 1) {
                temp = temp.next;
                count++;
            }
            Node curr = temp.next;
            newNode.next = curr;
            curr.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
            size++;
            System.out.println("insertion done size is : " + size);

        }

    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }



    public void delHead(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head = null;
            tail = null;
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        size--;
        System.out.println("delete done size is : "+size);
        return;
    }
    public void delTail(){
        if(tail==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head = null;
            tail = null;
        }
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
        temp.next = null;
        size--;
        System.out.println("delete done size is : "+size);
        return;
    }
    public void delete(int pos){
        if(pos>size || pos<1){
            System.out.println("Position out of bounds");
            return;
        }
        if(pos==1){
            delHead();
            return;
        }
        if(pos==size){
            delTail();
            return;
        }
        Node temp = head;
        int count = 1;
        while(count<pos-1){
            temp = temp.next;
            count++;
        }
        Node toDelete = temp.next;
        Node toJoin = toDelete.next;
        temp.next = toJoin;
        toJoin.prev = temp;
        toDelete.next=null;
        toDelete.prev=null;
        size--;
        System.out.println("delete done size is : "+size);
        return;
    }

    public static void main(String[] args) {
        DoublyLL obj = new DoublyLL();
        obj.atHead(100);
        obj.display();

        obj.atTail(500);
        obj.display();

        obj.atPos(200,2);
        obj.display();

        obj.atPos(200,4);
        obj.display();
        System.out.println("******************************");
        obj.delHead();
        obj.display();

        obj.delete(2);
        obj.display();


    }

}
