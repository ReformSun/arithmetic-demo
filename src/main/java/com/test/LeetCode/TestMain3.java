package com.test.LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 你可以假设 nums1 和 nums2 不会同时为空。
 */
public class TestMain3 {

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays2(new int[]{1,2},new int[]{3,4}));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map = new HashMap<>();
        int index = 0;
        int j = 0;

        for (int i = 0; i < nums1.length; i++) {
            boolean isadd = false;
            int nums = nums1[i];
            for (;j < nums2.length; j++) {
                int num2 = nums2[j];
                if (num2 > nums){
                    if (!map.containsValue(nums)){
                        map.put(index,nums);
                        index ++;
                        isadd = true;
                    }
                    break;
                }else if (num2 < nums){
                    if (!map.containsValue(nums2)){
                        map.put(index,num2);
                        isadd = false;
                        index ++;
                    }

                }else {
                    if (!map.containsValue(nums)){
                        map.put(index,nums);
                        index ++;
                        isadd = true;
                    }
                    j ++;
                    break;
                }
            }
            if (!isadd){
                if (!map.containsValue(nums)){
                    map.put(index,nums);
                    index ++;
                    isadd = true;
                }
            }
        }
        if (j < nums2.length){
            for (; j < nums2.length; j++) {
                int num2 = nums2[j];
                if (!map.containsValue(num2)){
                    map.put(index,num2);
                    index ++;
                }

            }
        }

        int ind = index / 2;
        if (index % 2 == 0){
           return  (double) ( map.get(ind) + map.get(ind - 1) ) / 2;
        }else {
            return (double)map.get(ind);
        }
    }

    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map = new HashMap<>();
        int index = 0;
        int j = 0;

        for (int i = 0; i < nums1.length; i++) {
            boolean isadd = false;
            int nums = nums1[i];
            for (;j < nums2.length; j++) {
                int num2 = nums2[j];
                if (num2 > nums){
                    map.put(index,nums);
                    index ++;
                    isadd = true;
                    break;
                }else if (num2 < nums){
                    map.put(index,num2);
                    isadd = false;
                    index ++;

                }else {
                    map.put(index,num2);
                    index ++;
                    isadd = false;
                    j ++;
                    break;
                }
            }
            if (!isadd){
                map.put(index,nums);
                index ++;
                isadd = true;
            }
        }
        if (j < nums2.length){
            for (; j < nums2.length; j++) {
                int num2 = nums2[j];
                map.put(index,num2);
                index ++;
            }
        }

        int ind = index / 2;
        if (index % 2 == 0){
            return  (double) ( map.get(ind) + map.get(ind - 1) ) / 2;
        }else {
            return (double)map.get(ind);
        }
    }
}
