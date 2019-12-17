package com.test.stack1_3;

import java.util.Stack;

/**
 * foreach 和 while语句一样
 */
public class TestMain1 {
    public static void main(String[] args) {
        Stack<String> stacks = new Stack<>();
        Object[] objects = new String[1];
        objects[0] = 10;
        stacks.push("a");
        stacks.push("b");
        for (String a : stacks){
            System.out.println(a);
        }
    }
}
