package com.test;

import edu.princeton.cs.algs4.StdOut;

public class TestMain1 {
    public static void main(String[] args) {
//        testMethod1_1();
//        testMethod1_2();
//        testMethod1_1_6();
        testMethod1_7();
//        testMethod1_8();
    }

    public static void testMethod1_1() {
        System.out.println((0 + 15)/2);
        System.out.println(2.0e-6*100000000.1);
        System.out.println(true && false || true && true);
    }

    public static void testMethod1_2() {
        System.out.println((1 + 2.236)/2);
    }

    public static void testMethod1_1_6() {
        int f = 0;
        int g = 1;
        for (int i = 0; i < 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }

    public static void testMethod1_7() {
        double t = 9.0;
        System.out.println(Math.abs(-8.0));
        System.out.println(Math.abs(t - 9.0/t));
        System.out.println(Math.abs(t - 9.0/t) > .001);
        System.out.println(.001);
    }

    public static void testMethod1_8() {
        // ‘b’ 代表一个基本数据类型的char java打印会把char类型先转成String类型在打印
        System.out.println('b');
        // 两个char的基本数据类通过加好连接时，会把他们对应的asc吗，进行相加，asc吗是int类型
        System.out.println('b' + 'c');
        // 两个char的基本数据类通过加好连接时，会把他们对应的asc吗，进行相加，asc吗是int类型 int类型可以
        System.out.println((char)('a' + 4));
    }
}
