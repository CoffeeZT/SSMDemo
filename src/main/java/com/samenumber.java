package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class samenumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String str = scanner.nextLine();
        ArrayList<String> list1=new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println("结果为"+str);
        for (int i=0;i<list1.size();i++){
            if (list1.get(i)== list1.get(i+1)){
                int sum[]=new int[2];
                sum[0]=i;
            }
            System.out.println(0);
        }
    }

}
