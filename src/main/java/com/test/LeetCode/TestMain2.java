package com.test.LeetCode;

import edu.princeton.cs.algs4.Stopwatch;

import java.util.*;

public class TestMain2 {

    public static void main(String[] args) {

        testMethod1();


    }

    /**
     * 三种算法的耗时
     * 1000 0.01 0.006 0.0
     * 100000 0.099 0.03  0.009
     */
    public static void testMethod1() {
        Stopwatch stopwatch = new Stopwatch();
        for (int i = 0; i < 100000 ; i++) {
//            lengthOfLongestSubstring("abcabcbb");
            lengthOfLongestSubstring2("abcabcbb");
//            lengthOfLongestSubstring3("abcabcbb");
        }
        System.out.println(stopwatch.elapsedTime());
    }

    /**
     * Given a string, find the length of the longest substring without repeating characters.
     * 分析：一个字符串没有重复字符的最长子串的长度
     *
     *
     */
    public static int lengthOfLongestSubstring(String s) {
//        Stopwatch stopwatch = new Stopwatch();
        char[] chars = s.toCharArray();
        int maxLength = 0;
        List<Character> list= new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (list.contains(chars[i])){
                maxLength = Math.max(maxLength,list.size());
                int index = list.indexOf(chars[i]);
                if(index == list.size() - 1)list.clear();
                else list = list.subList(index + 1,list.size());
            }
            list.add(chars[i]);
        }
        if (list.size() != 0){
            maxLength = Math.max(list.size(),maxLength);
        }
//        System.out.println(stopwatch.elapsedTime());
        return maxLength;
    }

    public static int lengthOfLongestSubstring2(String s) {
//        Stopwatch stopwatch = new Stopwatch();
        int maxLength = 0;
        int coveredPoint = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 1; i < s.length() + 1; i++) {
            Character character = s.charAt(i - 1);
            if (map.containsKey(character)){
                int index = map.get(character);
                coveredPoint = Math.max(index,coveredPoint);
            }
            map.put(character,i);
            maxLength = Math.max(maxLength,i - coveredPoint);
        }
//        System.out.println(stopwatch.elapsedTime());
        return maxLength;
    }

    public static int lengthOfLongestSubstring3(String s) {
//        Stopwatch stopwatch = new Stopwatch();
        int max = 0;
        int left = 0;
        int right = 0;
        for (; right < s.length(); ++right) {
            char rightC = s.charAt(right);
            for (int index = left; index < right; ++index) {
                if (s.charAt(index) == rightC) {
                    max = (right - left) > max ? (right - left) : max;
                    left = index + 1;
                    break;
                }
            }
        }
        max = (right - left) > max ? (right - left) : max;
//        System.out.println(stopwatch.elapsedTime());
        return max;
    }


}
