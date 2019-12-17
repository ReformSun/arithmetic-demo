package com.test;

import edu.princeton.cs.algs4.StdIn;

public class Main {
    public static void main(String[] args) {
        testMethod1();
    }

    public static void testMethod1() {
        while (!StdIn.isEmpty()){
            String s = StdIn.readString();
            System.out.println(s);
        }
        System.out.println("end");
    }
}
