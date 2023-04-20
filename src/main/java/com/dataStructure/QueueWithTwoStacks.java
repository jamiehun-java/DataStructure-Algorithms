package com.dataStructure;

import java.util.Stack;

public class QueueWithTwoStacks {
    public static class MyQueue<T>{
        private Stack<T> stackNewestOnTop = new Stack<T>();
        private Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T item){
            stackNewestOnTop.push(item);
        }

        private void changeStack(){
            if(stackOldestOnTop.isEmpty()){
            while(!stackNewestOnTop.isEmpty()) {
                stackOldestOnTop.push(stackNewestOnTop.pop());
            }
            }
        }

        public T peek(){
            changeStack();
            return stackOldestOnTop.peek();
        }

        public T pop(){
            return stackOldestOnTop.pop();
        }
    }
}
