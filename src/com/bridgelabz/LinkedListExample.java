package com.bridgelabz;

import java.util.Scanner;

class Operations{
    Node head;
    Node tail;
    public void addAtStart(int data){
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
    public void addAtEnd(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void addInBetween(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            Node temp = head;
            Node middle = head;
            /*  Find the middle node  */
            while (temp.next != null && temp.next.next != null)
            {
                temp = temp.next.next;
                middle = middle.next;
            }
            /*  add node  */
            newNode.next = middle.next;
            middle.next = newNode;
        }
    }
    public void print(){
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
}
public class LinkedListExample {
    public static void main(String[] args) {
        Operations op = new Operations();
        Scanner sc = new Scanner(System.in);
        System.out.println("Select option. \n1. Add data at start. \n2. Add data at end. " +
                "\n3. Add data in between of two nodes.");
        switch (sc.nextInt()){
            case 1:
                op.addAtStart(70);
                op.addAtStart(30);
                op.addAtStart(56);
                op.print();
                break;
            case 2:
                op.addAtEnd(70);
                op.addAtEnd(30);
                op.addAtEnd(56);
                op.print();
                break;
            case 3:
                op.addAtStart(70);
                op.addAtStart(30);
                op.addInBetween(56);
                op.print();
                break;
            default:
                System.out.println("Invalid number!");
                break;
        }

    }
}
