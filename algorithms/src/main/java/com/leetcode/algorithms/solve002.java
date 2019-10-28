package com.leetcode.algorithms;


import jdk.internal.util.xml.impl.Input;

import java.util.ArrayList;

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
        return new ListNode(l1.val + l2.val);
    }
    
    private static String process(String input) {
        int index = input.indexOf("+");
        String prefix = input.substring(0, index);
        String suffix = input.substring(index);
        StringBuffer prefixFinnalString = new StringBuffer();
        StringBuffer suffixFinnalString = new StringBuffer();
        for (int i = 0; i < prefix.length(); i++) {
            String ch = String.valueOf(prefix.charAt(i));
            if (ch.matches("^[0-9]*$")) {
                prefixFinnalString.append(ch);
            }
        }
        for (int i = 0; i < suffix.length(); i++) {
            String ch = String.valueOf(suffix.charAt(i));
            if (ch.matches("^[0-9]*$")) {
                suffixFinnalString.append(ch);
            }
        }
        Integer prefixFinnal = Integer.valueOf(prefixFinnalString.toString());
        Integer suffixFinnal = Integer.valueOf(suffixFinnalString.toString());
        ListNode resultListNode = addTwoNumbers(new ListNode(prefixFinnal), new ListNode(suffixFinnal));
        int resultVal = resultListNode.val;
        String resultValStr = String.valueOf(resultVal);
        int length = resultValStr.length();
        StringBuffer resultStringBuf = new StringBuffer();
        for (int i = length - 1; i >= 0; i--) {
            String s = String.valueOf(resultValStr.charAt(i));
            resultStringBuf.append(s);
        }
        String resultString = String.valueOf(resultStringBuf);
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
                return soutString.toString();
            }
            soutString.append(" -> " + resultList.get(i));
        }
        return soutString.toString();
    }
    
    public static void main(String[] args) {
        String input = "(2 -> 4 -> 3) + (5 -> 6 -> 4)";
        String process = process(input);
        System.out.println(process);
    }
    
    
}
