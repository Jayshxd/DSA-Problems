package com.dsa.problems.linked_list;

public class SinglyLL {
    Node head;
    int size;

    // Node class (Maine add kar di hai)
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        public static void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public SinglyLL() {
        this.head = null;
        this.size = 0;
    }

    // --- INSERTION METHODS ---

    public void atHead(int data) {
        Node newNode = new Node(data);
        // Yeh if(head==null) waale check ki zaroorat nahi hai
        // Yeh logic empty list pe bhi kaam karta hai
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void atTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    public void atPos(int data, int pos) {
        // Validation theek ki (1 se size+1 tak hi insert kar sakte hain)
        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid Position! Cannot insert.");
            return;
        }
        if (pos == 1) {
            atHead(data);
            return; // Return zaroori hai
        }
        if (pos == size + 1) {
            atTail(data);
            return; // <-- YEH HAI MAIN FIX
        }

        // Ab middle insertion ka logic
        Node newNode = new Node(data);
        int count = 1; // Hum (pos-1) waale node pe rukna chahte hain
        Node temp = head;

        while (count < pos - 1) {
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++; // Size yahaan badhao
    }

    // --- DELETION METHOD ---

    public void deleteNode(int pos) {
        // Validation Fix: 1 se size tak hi delete kar sakte hain
        if (pos < 1 || pos > size) {
            System.out.println("Invalid Position! Cannot delete.");
            return;
        }

        // Empty list check (Good)
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        // Case 1: Delete Head (pos == 1)
        if (pos == 1) {
            Node temp = head;
            head = head.next;
            temp.next = null; // Optional: clean up
            size--;
            return; // Kaam khatam
        }

        // Case 2: Delete Tail (pos == size) ya Middle (pos < size)
        // Dono ke liye logic same hi hai!
        // Hum (pos-1) waale node (prev) tak jaayenge

        Node temp = head;
        Node prev = null;
        int count = 1;

        // Loop 'pos' tak chalao taaki 'temp' uss node pe ho jisse delete karna hai
        // aur 'prev' usse pehle waale node pe ho
        while (count < pos) {
            prev = temp;
            temp = temp.next;
            count++; // <-- YEH HAI DOOSRA MAIN FIX (Infinite Loop)
        }

        // Ab 'prev' (pos-1) waale node pe hai aur 'temp' (pos) waale node pe
        prev.next = temp.next; // Link tod do
        temp.next = null;      // Optional: clean up
        size--;
    }

    // --- MAIN METHOD (Tumhara code) ---

    public static void main(String[] args) {
        SinglyLL obj = new SinglyLL();
        obj.atHead(1);
        Node.display(obj.head); // 1 -> null

        obj.atTail(100);
        Node.display(obj.head); // 1 -> 100 -> null

        obj.atTail(1000); // List: 1 -> 100 -> 1000 (size=3)

        obj.atPos(0, 1); // atHead(0) call hoga
        Node.display(obj.head); // 0 -> 1 -> 100 -> 1000 -> null

        System.out.println("Size: " + obj.size); // Size: 4

        obj.deleteNode(1); // Deletes 0
        System.out.println("Size: " + obj.size); // Size: 3
        Node.display(obj.head); // 1 -> 100 -> 1000 -> null

        obj.deleteNode(2); // Deletes 100
        System.out.println("Size: " + obj.size); // Size: 2
        Node.display(obj.head); // 1 -> 1000 -> null
        obj.deleteNode(1);
        Node.display(obj.head);
        obj.deleteNode(1);
        Node.display(obj.head);
        
    }
}