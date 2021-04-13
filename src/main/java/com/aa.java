package com;

import java.util.Scanner;
import java.util.Stack;

public class aa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("结果为"+mach(string));
    }

    private static Boolean mach(String s) {
        Stack<Character> stack = new Stack();
        for (int i=0;i<s.length();i++){
            if ((s.charAt(i)=='(')||(s.charAt(i)=='[')||(s.charAt(i)=='{')){
                stack.push(s.charAt(i));
            }
            if ((s.charAt(i)==')')||(s.charAt(i)==']')||(s.charAt(i)=='}')){
                if (stack.empty())
                    return false;
                if ((stack.peek()=='(' && s.charAt(i)==')')
                        ||(stack.peek()=='{'&&s.charAt(i)=='}')
                        ||(stack.peek()=='['&&s.charAt(i)==']'));
                stack.pop();
            }
        }
        if (stack.empty())
            return true;
        else return false;

    }
}
