package com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class maopaopaixu {
    public static void main(String[] args) {
        int a[] = {1,23,4,5,5,6,8,7,11,0,54,88};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]){
                    int sum=0;
                    sum=a[j];
                    a[j]=a[j+1];
                    a[j+1]=sum;}
                }
            }
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);

        System.out.println("数组长度："+ a.length);

    }


}
