package com.leetcode.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
    
    
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }
        
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);
        
        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }
    
    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }
        
        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            ListNode l1 = stringToListNode(line);
            line = in.readLine();
            ListNode l2 = stringToListNode(line);
            
            ListNode ret = new solve002().addTwoNumbers(l1, l2);
            
            String out = listNodeToString(ret);
            
            System.out.print(out);
        }
    }
}
