package com.bridgelabz;

public class LinkedListExample {
    static Node head;
    static Node tail;
    public static void addAtStart(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            Node temp = head;
            head = newNode;
            newNode.next = temp;
        }
    }
    public static void print(){
        if (head == null)
            System.out.println("Linked list is empty.");
        else{
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        addAtStart(70);
        addAtStart(30);
        addAtStart(56);
        print();
    }
}
