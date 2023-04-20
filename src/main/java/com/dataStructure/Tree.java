package com.dataStructure;

public class Tree {
    private class Node{
        int data;
        Node left, right;
        private Node(int data){
            this.data =data;
        }
    }

    Node top;

    private void addNode(Node node, int value){
        Node curNode = node;

        if (top == null){
            top = curNode;
        }

         if (value < curNode.data) {
            if (curNode.left == null) {
                curNode.left = new Node(value);
            } else {
                addNode(curNode.left, value);
            }
        }

        else if (curNode.data < value){
            if (curNode.right == null){
                curNode.right = new Node(value);
            } else {
                addNode(curNode.right, value);
            }
        }
    }

    private boolean findNode(Node node, int value){
        Node curNode = node;

        if (curNode.data == value){
            return true;
        } else if (curNode.data > value){
            if (curNode.left == null){
                return false;
            }
            curNode = curNode.left;
            return findNode(curNode, value);
        } else {
            if (curNode.right == null){
                return true;
            }

            curNode = curNode.right;
            return findNode(curNode, value);
        }
    }

    private void InorderTraversal(Node node){
        if (node.left != null){
            InorderTraversal(node.left);
        }
        System.out.println(node.data);
        if (node.right != null){
            InorderTraversal(node.right);
        }


    }
}
