package com.dataStructure;

public class Queue {
    private static class Node{
        private int data;
        private Node next;
        private Node (int data){
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        return false;
    }
    public int peek(){
        return head.data;
    }
    public void add(int data){
        Node newNode = new Node(data);

        if (tail != null){
            Node prevTail = tail;
            prevTail.next = newNode;
        }
        tail = newNode;

        if (head == null){
            head = newNode;
        }

    }
    public int remove(){
        if(head == null){
            return -1;
        }

        int data = head.data;
        head = head.next;
        return data;

    }
}
