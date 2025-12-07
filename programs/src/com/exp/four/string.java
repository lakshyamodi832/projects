package com.exp.four;

public class string {
    static void main() {
        String s1 = "Hello";

        System.out.println(s1.length());
        System.out.println(s1.indexOf("e"));
        System.out.println(s1.substring(1, 4));

        String s2 = " World";

        System.out.println(s1.equals(s2));

        String s3 = s1 + s2;
        String s4 = s1.concat(s2);

        System.out.println(s3);
        System.out.println(s4);
    }
}
