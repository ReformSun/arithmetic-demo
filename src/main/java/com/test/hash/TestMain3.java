package com.test.hash;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMain3 {
    public static void main(String[] args) {
//        testMethod3();
//        testMethod4();
        testMethod5();
    }

    /**
     * 数组的优缺点测试
     * 寻址容易
     * 插入和删除困难
     *
     */
    public static void testMethod1() {
        String[] strings = new String[100];
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aa");
        arrayList.add("aa");
        arrayList.add("aa");
        arrayList.add("aa");
        arrayList.add(2,"bb");
        arrayList.remove(3);
    }

    /**
     * 链表的优缺点
     * 寻址困难
     * 插入和删除容易
     */
    public static void testMethod2() {

    }

    /**
     * 学习System.arraycopy（）方法
     * 拷贝一个数组，从源数组 并制定位置，到目标数组 并制定位置 和被拷贝的长度
     */
    public static void testMethod3() {
        String[] strings = {"aa","bb","ccc","eeee"};
        String[] strings1 = new String[strings.length];
        // 从0位置包含0位置
        System.arraycopy(strings,0,strings1,0,strings.length);
        for (int s = 0; s < strings1.length; s++) {
            System.out.println(strings1[s]);
        }
        System.out.println("下一个测试");
        strings1 = new String[8];
        System.arraycopy(strings,0,strings1,3,2);
        for (int s = 0; s < strings1.length; s++) {
            System.out.println(strings1[s]);
        }
        System.out.println("下一个测试");
        strings1 = new String[8];
        System.arraycopy(strings,1,strings1,3,3);
        for (int s = 0; s < strings1.length; s++) {
            System.out.println(strings1[s]);
        }
    }

    /**
     * 数组插入操作分析
     * 通过分析数组的实现可以发现
     * 数组的插入 经历了很多的复制操作，如果数据量持续增大的话，插入效率会非常的低
     */
    public static void testMethod4() {
        String[] strings = {"aa","bb","ccc","eeee"};
        int index = 2;
        String s = "cccccc";
        // 如果我们想做插入操作 想在下标为2的位置插入数据“ccc”
        // Java 数组会首先检查插入数据后，数据长度时候超出数组的长度，如果超出
        // 增加的方式为int newCapacity = oldCapacity + (oldCapacity >> 1);
        int oldCapacity = 4;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        // 然后调用Arrays.copyOf(elementData, newCapacity);生成一个新的数组
        strings = Arrays.copyOf(strings,newCapacity);
        System.out.println("新的数组的长度：" + strings.length);
        // 插入数据 System.arraycopy(elementData, index, elementData, index + 1,size - index);
        // 把index位置的数组即以后的数据向后退一位
        int size = strings.length;
        System.arraycopy(strings,index,strings,index + 1,size - index);
        strings[index] = s;
        System.out.println("增加后数组的数据");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    /**
     * 分析数组的删除
     * 数组的删除也经历了拷贝的操作，但是和插入相比，少了很多这方面的操作
     * 但是随着数据量的上升，效率也会非常的低
     */
    public static void testMethod5() {
        String[] strings = {"aa","bb","ccc","eeee"};
        // 删除索引2位置的数据
        int index = 2;
        System.arraycopy(strings,index + 1,strings,index,strings.length - index-1);
        strings[strings.length - 1] = null;
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    /**
     * 链表的删除和插入
     */
    public static void testMethod6() {

    }

}
