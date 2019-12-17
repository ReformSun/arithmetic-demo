package com.test.hash;

import java.util.HashMap;
import java.util.HashSet;

public class TestMain2 {
    public static void main(String[] args) {
//        testMethod1();
//        testMethod2();
//        testMethod3();
//        testMethod6();
        testMethod6_1();
    }

    /**
     * HashSet 的散列码设置
     */
    public static void testMethod4() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("aa");
    }


    /**
     * HashMap中有一个内部类 用于存储值 键 散列值
     * Node
     */
    public static void testMethod1() {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("bookss","a");
        System.out.println(hashMap);
        System.out.println("book".hashCode());

    }

    /**
     * 对于单一字符串的hash
     */
    public static void testMethod2() {
        int h = 0;
        String s = "book";
        char[] value = new char[s.length()];
        s.getChars(0,s.length(),value,0);
        if (h == 0 && value.length > 0) {
            char val[] = value;
            for (int i = 0; i < value.length; i++) {
                h = 31 * h + val[i];
            }
        }
        System.out.println(h);
    }

    /**
     * Java8 HashMap 的hash方法
     */
    public static void testMethod3() {
        String key = "book";
        int h = 0;
        System.out.println(key.hashCode() >>> 16);
        System.out.println(key.hashCode() ^ 46);
        System.out.println((int)'^');
        System.out.println((h = key.hashCode()) ^ (h >>> 16));
    }

    /**
     * Java7 的hash方法的实现
     * 20 二进制 0b10100
     * 12 二进制 0b1100
     * 0000 0000 1000 0000 0000 0000 0000 0001
     *
     */
    public static void testMethod5() {
        String k = "";
        int h = 0;
        if (0 != h && k instanceof String) {
//            return sun.misc.Hashing.stringHash32((String) k);
        }
        h ^= k.hashCode();
        h ^= (h >>> 20) ^ (h >>> 12);
        System.out.println(h ^ (h >>> 7) ^ (h >>> 4));
    }

    public static void testMethod6_1() {
        int h = 0b00000000111100000000000000000001;
        System.out.println(h >>> 20);
        System.out.println(Integer.toBinaryString(15));
        System.out.println(h >>> 12);
        System.out.println(Integer.toBinaryString(3840));
        System.out.println((h >>> 20) ^ (h >>> 12));
        System.out.println(Integer.toBinaryString(3855));

    }

    /**
     * Java7 的indexof
     * Java7中如果hash散列值为 0000 0000 1000 0000 0000 0000 0000 0001和0000 0000 1111 0000 0000 0000 0000 0001
     * 其实下面的操作相当于取模操作，但是如果高位不同低位相同会出现hash值的冲突
     * 怎么解决冲突那
     *
     */
    public static void testMethod6() {
        int h = 0b00000000100000000000000000000001;
        h = 0b00000000111100000000000000000001;
        int length = 10;// 1010
        System.out.println(h & (length-1));
    }
}
