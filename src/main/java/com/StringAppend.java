package com;

import lombok.var;

public class StringAppend {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<100;i++){
            sb.append(",");
            sb.append(i);
        }
        String s = sb.toString();
        System.out.println(s);

        var sb2 = new StringBuilder();
        sb2.append("Mr ")
                .append("G")
                .append("!")
                .insert(0,"Hello,");
        System.out.println(sb2);
    }
}
