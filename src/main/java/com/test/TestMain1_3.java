package com.test;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

public class TestMain1_3 {
    public static void main(String[] args) {
//        testMethod1();
        testMethod2();
    }

    /**
     * j ( ) s { ( end
     * j ( ) s { ( dd (  dls ) end
     * j ( ) s { ( dd ( ) dls ) end
     */
    public static void testMethod1() {
        Stack<String> stack = new Stack<>();
        while (!StdIn.isEmpty()){
            String s = StdIn.readString();
            if (s.equals("end")){
                break;
            }
            if (s.equals("(")) stack.push(s);
            else if (s.equals(")")){
                String value =  stack.pop();
                if (value != null){
                    if (value.equals(")"))StdOut.println("false");break;
                }else {
                    StdOut.println("false");break;
                }
            }
        }
        if (stack.isEmpty()){
            StdOut.println("true");
        }else {
            StdOut.println("false");
        }
    }

    /**
     * ( ) ( k ) end
     */
    public static void testMethod2() {
        Stack<String> stack = new Stack<>();
        while (!StdIn.isEmpty()){
            String s = StdIn.readString();
            if (s.equals("end")){
                break;
            }
            if (s.equals(")")){
                String value =  stack.pop();
                if (value != null){
                    if (!value.equals("("))StdOut.println("false"); break;
                }else {
                    StdOut.println("false"); break;
                }
            }else stack.push(s);
        }
        if (stack.isEmpty() || !stack.pop().equals("(")){
            StdOut.println("true");
        }else  {
            StdOut.println("false");
        }
    }
}
