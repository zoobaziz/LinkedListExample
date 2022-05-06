package com.bridgelabz;

import java.util.Scanner;

public class LinkedListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nSelect option. \n1. Add data at start. \n2. Add data at end. " +
                    "\n3. Add data in between of two nodes. \n4. Delete first node. " +
                    "\n5. Delete last node. ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    LinkedList.addDataAtStart();
                    break;
                case 2:
                    LinkedList.addDataAtEnd();
                    break;
                case 3:
                    LinkedList.addDataInMiddle();
                    break;
                case 4:
                    LinkedList.removeFirstElement();
                    break;
                case 5:
                    LinkedList.removeLastElement();
                    break;
                default:
                    System.out.println("Invalid number!");
                    break;
            }
        }while (choice <= 5);
    }
}
