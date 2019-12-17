package com.test.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TestMain4 {

    public static void main(String[] args) {
       testMethod2();
    }

    public static void testMethod1() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        removeNthFromEnd(listNode1,1);
    }

    public static void testMethod2() {
        System.out.println(longestPalindrome("abba"));
    }

    /**
     *  删除链表的倒数第N个节点
     * 给定一个链表: 1->2->3->4->5, 和 n = 2.当删除了倒数第二个节点后，链表变为 1->2->3->5.
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode listNode = new ListNode(0);
        listNode.next = head;
        int index = 0;
        Map<Integer,ListNode> map = new HashMap<>();
        while (listNode.next != null){
            listNode = listNode.next;
            map.put(index,listNode);
            index ++;
        }
        ListNode listNode1 = index - n - 1 >= 0 ? map.get(index - n - 1) : null;
        ListNode listNode2 = index - n + 1 >= 0 ? map.get(index - n + 1) : null;
        if (listNode1 != null){
            listNode1.next = listNode2;
            return head;
        }else {
            if (index - n - 1 == -1){
                return head.next;
            }else {
                return head;
            }
        }
    }

    /**
     * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
     * @param s
     * @return
     */
    public static int longestPalindrome(String s) {
        int maxlength = 0;
        boolean isAllE = true;
        boolean isAddRight = true;
        boolean isAddLeft = true;
        boolean isoddNumber = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            for (int right = i - 1,left = i + 1; right >=0 || left < s.length();) {
                if (left >= s.length()){
//                    if (isAllE){
//                        if (s.charAt(left) != ch){
//                            isAllE = false;
//                            maxlength = Math.max(maxlength,right < 0 ? left : left - right - 1);
//                            break;
//                        }
//                    }else {
//                        isAddRight = false;
//                        right = right < 0 ? right ++ : right;
//                        left = left >= s.length() ? left -- : left;
//                    }
                    maxlength = Math.max(maxlength,left - right);
                    break;
                }else if (right < 0){
                    if (isoddNumber){
                        maxlength = Math.max(maxlength,left - right - 1);
                        break;
                    }else{
                        isAddRight = false;
                        isAddLeft = true;
                        right ++;
                    }
                }




                char rightC = s.charAt(right);
                char leftC = s.charAt(left);


                if (right == i - 1 || right == i && left == i + 1){
                    if (rightC == leftC){
                        if (leftC == ch)isAllE = true;
                        else  isAllE = false;
                        isoddNumber = true;
                    }else if (leftC == ch){
                        isoddNumber = false;
                    }
                }else {

                }


                if (rightC == leftC){
                    if (isoddNumber)continue;
                    isAddRight = true;
                }else {
                    maxlength = Math.max(maxlength,left - right - 1);
                    break;
                }
                if (isAddLeft)left ++;
                if (isAddRight)right --;
            }
        }
        return maxlength;
    }

    /**
     * Validate if a given string can be interpreted as a decimal number
     */
    public static boolean isNumber(String s) {
        return false;
    }
}
