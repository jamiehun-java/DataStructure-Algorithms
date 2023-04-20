package com.dataStructure;

public class Stack {
    private static class Node {
        int data;
        Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    private boolean isEmpty(){
        return top == null;
    }
    private int peek(){
        if (top == null){
            return -1;
        }
        return top.data;
    }
    private void add(int value){
        Node node = new Node(value);

        if (top == null){
            top = node;
        } else {
            Node prevHead = top;
            top = node;
            node.next = prevHead;
        }
    }
    private int remove(){
        if (top == null){
            return -1;
        }
        Node prevHead = top;
        top = prevHead.next;
        return prevHead.data;

    }

}

