package com.test;

/**
 * 按位与&的特征
 */
public class TestMainBit1 {
    public static void main(String[] args) {
//        testMethod1();
//        testMethod2();
//        testMethod3();
//        testMethod4();
//        testMethod5();
        testMethod6();
    }


    public static void testMethod6(){
        for (int i = 0; i < 5 ; i++) {
            int start = ((2 * 31) & 0x7FFFFFFF) % 3;
            System.out.println((start + i) % 3);
        }
    }

    public static void testMethod5(){
        int a = 31;
        System.out.println(Integer.toBinaryString(a * 3));
        System.out.println(((2 * 31) & 0x7FFFFFFF) % 3);
        int start = ((2 * 31) & 0x7FFFFFFF) % 3;
        System.out.println((start + 4) % 3);
        System.out.println(Integer.toBinaryString(0x7FFFFFFF));
    }

    public static void testMethod4(){
        // 32 + 4 + 2
        System.out.println(Integer.toBinaryString(38));
    }
    public static void testMethod1(){
        // 十进制
        int a = 10;
        // 1010
        // 1010
        // 1010
        System.out.println(Integer.toBinaryString(a));
        System.out.println(10 & 10);
        System.out.println(10 & 9);
        System.out.println(10 & 11);
    }

    public static void testMethod2(){
        int a = 8;// 1000  10000
        System.out.println(Integer.toBinaryString(a));
        System.out.println(0b10000);
        System.out.println(0b10100);
        System.out.println(0b10110);
        System.out.println(0b10111);
        System.out.println(a & 23);
    }

    /**
     * 为什么使用这样的数作为标识符
     * 这种数据任何两个数据相加，与其它数进行与操作都为0
     * 可以通过一个数据判断判断一个数据是否在这个数据里面。包含和不包含的关系
     * 10
     * 100
     * 1000
     * 10000
     * 100000
     * 1000000
     */
    public static void testMethod3(){
        System.out.println(Integer.toBinaryString(2));
        System.out.println(Integer.toBinaryString(4));
        System.out.println(Integer.toBinaryString(8));
        System.out.println(Integer.toBinaryString(16));
        System.out.println(Integer.toBinaryString(32));
        System.out.println(Integer.toBinaryString(64));
    }

}
