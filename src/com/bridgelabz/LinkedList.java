package com.bridgelabz;

public class LinkedList {
    public static void addDataAtStart(){
        Operations op = new Operations();
        op.push(70);
        op.push(30);
        op.push(56);
        op.print();
    }
    public static void addDataAtEnd(){
        Operations op = new Operations();
        op.append(70);
        op.append(30);
        op.append(56);
        op.print();
    }
    public static void addDataInMiddle(){
        Operations op = new Operations();
        op.push(70);
        op.push(30);
        op.insertInMiddle(56);
        op.print();
    }
    public static void removeFirstElement(){
        Operations op = new Operations();
        op.removeFirstNode();
        op.print();
    }
    public static void removeLastElement(){
        Operations op = new Operations();
        op.removeLastNode();
        op.print();
    }
}
