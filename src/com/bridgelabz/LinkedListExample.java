package com.bridgelabz;

class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedListExample {
    public static void main(String[] args) {
        Node firstNode = new Node(56);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(70);
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        Node temp = firstNode;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
