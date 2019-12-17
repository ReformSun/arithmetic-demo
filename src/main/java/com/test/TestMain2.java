package com.test;

public class TestMain2 {
    public static void main(String[] args) {
//        testMethod1();
//        testMethod2();
        testMethod3();
    }

    public static void testMethod1() {
        System.out.println(0x0200 & 0x200);
        System.out.println(0x699 & 0x200);
        System.out.println(Integer.toBinaryString(0x200));
        System.out.println(Integer.toBinaryString(0x499));

        System.out.println(0x8000);

        System.out.println(Integer.toBinaryString(33));
    }


    /**
     * 1
     * 10
     * 100
     * 1000
     * 10000
     * 100000
     * 1000000
     * 10000000
     * 100000000
     * 1000000000
     * 10000000000
     * 100000000000
     * 1000000000000
     * 10000000000000
     * 100000000000000
     * 1000000000000000
     * 100000000000000000
     * 字节码中访问标示
     */
    public static void testMethod2(){
        System.out.println(Integer.toBinaryString(0x0001));
        System.out.println(Integer.toBinaryString(0x0002));
        System.out.println(Integer.toBinaryString(0x0004));
        System.out.println(Integer.toBinaryString(0x0008));
        System.out.println(Integer.toBinaryString(0x0010));
        System.out.println(Integer.toBinaryString(0x0020));
        System.out.println(Integer.toBinaryString(0x0040));
        System.out.println(Integer.toBinaryString(0x0080));
        System.out.println(Integer.toBinaryString(0x0100));
        System.out.println(Integer.toBinaryString(0x0200));
        System.out.println(Integer.toBinaryString(0x0400));
        System.out.println(Integer.toBinaryString(0x0800));
        System.out.println(Integer.toBinaryString(0x1000));
        System.out.println(Integer.toBinaryString(0x2000));
        System.out.println(Integer.toBinaryString(0x4000));
        System.out.println(Integer.toBinaryString(0x8000));
        System.out.println(Integer.toBinaryString(0x20000));
    }

    public static void testMethod3(){
        System.out.println(33 & 0x0001);
    }
}
