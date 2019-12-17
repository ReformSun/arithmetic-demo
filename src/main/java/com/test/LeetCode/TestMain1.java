package com.test.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TestMain1 {
    // 简化路径
    public static void testMethod1(String path) {

    }

    /**
     * 两数之和 暴力法
     * 时间复杂度 O(n^2)
     * 空间复杂度 O(1)
      */
    public int[] twoSum1(int[] nums, int target) {
        int[] ta = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    ta[0] = i;
                    ta[1] = j;
                    break;
                }
            }
        }
        return ta;
    }

    /**
     *
     *  时间复杂度 O(n)
     *  空间复杂度 O(n)
     */
    public int[] twoSum1_1(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.values().contains(target - nums[i])){
                return new int[]{i,map.get(target - nums[i])};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = null;
        ListNode nextNode = null;
        boolean isCarryIn = false;
        if (l1 != null && l2 != null){
            Integer sum = l1.val + l2.val;
            if (sum < 10){
                listNode = new ListNode(sum);
            }else {
                listNode = new ListNode(sum % 10);
                if (l1.next == null && l2.next == null){
                    listNode.next = new ListNode(1);
                    return listNode;
                }
                isCarryIn = true;
            }
            nextNode = listNode;
        }else if (l1 != null){
            return l1;
        }else if (l2 != null){
            return l2;
        }else {
            return null;
        }

        while ( (l1 != null && l1.next != null) || (l2 != null && l2.next != null)){
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            ListNode listN;
            if (l1 != null || l2 != null){
                Integer l1Val = l1 != null ? l1.val : 0;
                Integer l2Val = l2 != null ? l2.val : 0;
                Integer sum = l1Val + l2Val;
                if (isCarryIn){
                    sum += 1;
                }
                if (sum < 10){
                    listN = new ListNode(sum);
                    isCarryIn = false;
                }else {
                    listN = new ListNode(sum % 10);
                    if ((l1 != null && l1.next != null) || (l2 != null && l2.next != null)){
                        isCarryIn = true;
                    }else {
                        nextNode.next = listN;
                        listN.next = new ListNode(1);
                        return listNode;
                    }
                }
                nextNode.next = listN;
                nextNode = listN;
            }else {
                break;
            }
        }
        return listNode;
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        boolean isCarryIn = false;
        ListNode listNode = new ListNode(0);
        ListNode nextNode = listNode;
        while (l1 != null || l2 != null){
            Integer l1Val = l1 != null ? l1.val : 0;
            Integer l2Val = l2 != null ? l2.val : 0;

            Integer sum = isCarryIn ? l1Val + l2Val + 1 : l1Val + l2Val;
            if (sum < 10){ nextNode.next = new ListNode(sum);isCarryIn = false;}
            if (sum >9 ){nextNode.next = new ListNode(sum%10);isCarryIn = true;}
            nextNode = nextNode.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        if (isCarryIn){
            nextNode.next = new ListNode(1);
        }

        return listNode.next;
    }

    public ListNode addTwoNumbers3(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode nextNode = listNode;
        int flag = 0;
        while (l1 != null || l2 != null || flag != 0){
            if (l1 != null){
                flag += l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                flag += l2.val;
                l2 = l2.next;
            }

            nextNode.next = new ListNode(flag % 10);
            nextNode = nextNode.next;
            flag/=10;
        }
        return listNode.next;
    }





    public static void main(String[] args) {
        TestMain1 testMain1 = new TestMain1();
        ListNode listNode = new ListNode(9);
        listNode.next = new ListNode(9);
        ListNode listNode2 = testMain1.addTwoNumbers(new ListNode(1),listNode);
        System.out.println(listNode2);
    }
}
