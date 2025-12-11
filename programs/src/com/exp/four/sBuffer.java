package com.exp.four;

public class sBuffer {
    static void main() {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.append(" World"));
        System.out.println(sb.insert(0, "Hi, "));
        System.out.println(sb.reverse());
    }
}


