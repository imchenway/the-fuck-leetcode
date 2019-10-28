package com.leetcode.algorithms;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Program: leetCode
 * @Description: 两数相加
 * @Author: David Chan
 * @createTime 2019-10-18 10:23
 * @Version: 1.0.0
 */
public class solve002 {
    /*
    两数相加：
        给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
        如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
        您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
    示例：
        输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
        输出：7 -> 0 -> 8
        原因：342 + 465 = 807
    * */
    
    // Definition for singly-linked list.
    private static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int x) {
            val = x;
        }
    }
    
    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*
        * 解：
        *   1、两int相加
        *   2、从最后一位存入listNode
        *   3、遍历输出
        * 复杂度：
        *   时间复杂度：
        *   空间复杂度：
        * */
        return null;
    }
    
    public static void main(String[] args) {
        // ListNode resultListNode = addTwoNumbers(new ListNode(1), new ListNode(2));
        // int resultVal = resultListNode.val;
        int resultVal = 123;
        String resultString = String.valueOf(resultVal);
        ArrayList resultList = new ArrayList<>();
        for (int i = 0; i < resultString.length(); i++) {
            resultList.add(resultString.charAt(i));
        }
        StringBuffer soutString = new StringBuffer();
        int resultStringLength = resultList.size() - 1;
        for (int i = 0; i <= resultStringLength; i++) {
            if (i == 0) {
                soutString.append("(" + resultList.get(i));
                continue;
            }
            if (i == resultStringLength) {
                soutString.append(" -> " + resultList.get(i) + ")");
                System.out.println(soutString);
                return;
            }
            soutString.append(" -> " + resultList.get(i));
        }
    }
}
