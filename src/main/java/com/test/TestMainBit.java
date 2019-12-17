package com.test;

public class TestMainBit {
    public static void main(String[] args) {
//        testMethod1();
//        testMethod2();
//        testMethod3();
        testMethod4();
    }

    /**
     * 取模运算%和位运算的转换
     * X % 2 ^ N = X & (2^N - 1)
     */
    public static void testMethod4() {
        System.out.println(10 % 8);
        System.out.println(10 & 7);
    }

    public static void testMethod3() {
        System.out.println(Integer.toBinaryString(10));// 1010
        System.out.println(Integer.toBinaryString(10 >> 1)+ " 十进制：" + (10 >> 1));// 101    5
        System.out.println(Integer.toBinaryString(10 << 1) + " 十进制：" + (10 << 1));//10100    20
        System.out.println(Integer.toBinaryString(10 >>> 1) + " 十进制：" + (10 >>> 1));// 101    5
        System.out.println(Integer.toBinaryString(-1));// 11111111111111111111111111111111 为-1 的补码
        System.out.println(Integer.toBinaryString(12));// 1100 为12 的原码
        // 0b0000 0000 0000 0000 0000 0000 0000 0001
        // 0b1111 0000 0000 0000 0000 0000 0000 0001
        // 0b11111111111111111111111111111111 -1
        System.out.println(0b11110000000000000000000000000001);
//        System.out.println(Float.floatToRawIntBits(2.0F));
    }

    /**
     * Java进制的表示方式
     */
    public static void testMethod2() {
        // 二进制
        System.out.println(0b1100);// 12
        // 0 * 10^1
        System.out.println(0e2); // 0.0
        // 2 * 10^2
        System.out.println(2e2);// 200.0
        System.out.println(2 << 1);// 4
        System.out.println(10 << 1);// 20
        // 八进制
        System.out.println(011); // 9
        // 十进制
        System.out.println(222); // 222
        // 十六进制
        System.out.println(0x11C);// 284
    }

    public static void testMethod1() {
      // 无符号移位 >>>
        System.out.println(-1);
        System.out.println(1);
        System.out.println(0b1100);
        System.out.println(0b01100);
        System.out.println(-2 >>> 1);
        System.out.println(12 >>> 1);
    }
}
