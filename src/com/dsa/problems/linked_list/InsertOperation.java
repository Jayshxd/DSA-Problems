package com.dsa.problems.linked_list;

public class InsertOperation {
    Node head;
    int size;

    public InsertOperation() {
        this.head = null;
        this.size = 0;
    }

    public void atHead(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;size++;
    }
    public void atTail(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;size++;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;size++;
    }
    public void atPos(int data, int pos){
        if(pos>size+1 || pos<0){
            System.out.println("kya kar rha hai ?????");
        }
        if(pos==1){
            atHead(data);
            return;
        }
        if(pos==size+1){
            atTail(data);
        }
        Node newNode = new Node(data);
        int count = 1;
        Node temp = head;
        while(count<pos-1){
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;size++;
    }

    public static void main(String[] args) {
        InsertOperation obj = new InsertOperation();
        obj.atHead(1);
        Node.display(obj.head);
        obj.atTail(100);
        Node.display(obj.head);
        obj.atTail(1000);
        System.out.println(obj.size);
        obj.atPos(0,1);
        System.out.println(obj.size);
        Node.display(obj.head);
        System.out.println(obj.size);
    }

}
