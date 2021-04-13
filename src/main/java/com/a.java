package com;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Scanner;

public class a {
    public static int getFib2(int n){
        if(n < 0){
            return -1;
        }else if(n == 0){
            return 0;
        }else if (n == 1 || n == 2){
            return 1;
        }else{
            int c = 0, a = 1, b = 1;
            for(int i = 3; i <= n; i++){
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("结果为"+getFib2(scanner));
    }
}
