package com.dataStructure;

import java.util.Stack;

public class ParenthesesExpression {
    public static char[][] Tokens = {{'{', '}'}, {'[', ']'}, {'(', ')'}};

    public static boolean isOpened(char c){
        for (int i = 0; i < Tokens.length; i++){
            char[] arr = Tokens[i];
            if (arr[0] == c){
                return true;
            }
        }
        return false;
    }

    public static boolean isClosed(char opened, char closed){
        for (int i = 0; i < Tokens.length; i++){
            char[] arr = Tokens[i];
            if (arr[0] == opened && arr[1] == closed){
                return true;
            }
        }
        return false;
    }

    public static boolean isBalanced(String str){
        Stack<Character> stack = new Stack<Character>();

        for(char c : str.toCharArray()){
            if (isOpened(c)){
                stack.push(c);
            } else {
                char temp = stack.pop();
                if (stack.isEmpty() || isClosed(stack.pop(), c)){
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }
}
