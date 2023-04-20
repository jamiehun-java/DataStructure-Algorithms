package com.dataStructure;

public class LinkedList {
    private class Node{
        int value;
        Node next;
        private Node(int value){
            this.value = value;
        }
    }

    private Node head;

    private void append(int value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
        } else {
            Node curNode = head;
            while(!(curNode.next == null)){
                curNode = curNode.next;
            }
            curNode.next = newNode;
        }
    }

    private void prepend(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        } else {
            Node prevHead = head;
            head = newNode;
            head.next = prevHead;
        }
    }

    private int deleteWithValue(int value){
        if(head == null){ return -1;}

        if(head.value == value){
            head.next= head;
            return head.value;
        }

        Node curNode = head;
        while(curNode.next != null){
            if (curNode.next.value == value){
                curNode.next= curNode.next.next;
                return curNode.next.value;
            }
            curNode = curNode.next;
        }
        return -1;
    }
}


