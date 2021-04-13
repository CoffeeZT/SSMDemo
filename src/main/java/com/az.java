package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class az {
        public static void main(String[] args) {
            String str = "111111kakkkkkkkkkkwwwaacbbdAAA";
            String s = "";
            int count=0;
            Matcher m = Pattern.compile("(\\w)\\1*").matcher(str);
            while (m.find()) {
                s += m.group().subSequence(0, 1);
            }
            System.out.println(s);
        }

}
