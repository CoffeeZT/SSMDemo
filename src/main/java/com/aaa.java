package com;

public class aaa {
    public static void main(String[] args) {
        double a[]={34.5,37.5,35.6,38,36,37,38};
        int j=0;
        int sum=0;

        for (int i=0;i<a.length;i++){
            if (a[i]>36){
                System.out.println( "i=" + i);
                for (j=i;j<a.length;j++){
                    if (a[i]<a[j]){
                    sum = j - i;
                    System.out.println("距离"+sum+"天");
                    }
                }
            }
        }
        if (sum==0)System.out.println(0);

    }
}
