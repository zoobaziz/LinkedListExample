package com.bridgelabz;

public class LinkedList {
    Operations ops = new Operations();
    
    LinkedList instance;
    
    public LinkedList getInstance(){
        if(instance == null){
            instance = new LinkedList();
        }
        return instance;
    }
    
    public static void addDataAtStart(){
        ops.getInstance().push(70);
        ops.getInstance().push(30);
        ops.getInstance().push(56);
        ops.getInstance().print();
    }
    public static void addDataAtEnd(){
        ops.getInstance().append(70);
        ops.getInstance().append(30);
        ops.getInstance().append(56);
        ops.getInstance().print();
    }
    public static void addDataInMiddle(){
        ops.getInstance().push(70);
        ops.getInstance().push(30);
        ops.getInstance().insertInMiddle(56);
        ops.getInstance().print();
    }
    public static void removeFirstElement(){
        ops.getInstance().removeFirstNode();
        ops.getInstance().print();
    }
    public static void removeLastElement(){
        ops.getInstance().removeLastNode();
        ops.getInstance().print();
    }
}
