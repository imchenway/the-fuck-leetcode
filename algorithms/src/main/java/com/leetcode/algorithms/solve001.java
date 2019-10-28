package com.leetcode.algorithms;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Program: leetCode
 * @Description: twoSum 两数之和
 * @Author: David Chan
 * @createTime 2019-10-15 19:56
 * @Version: 1.0.0
 */
public class solve001 {
    /*
    两数之和：
        给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
        你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
    示例:
        给定 nums = [2, 7, 11, 15], target = 9
        因为 nums[0] + nums[1] = 2 + 7 = 9
        所以返回 [0, 1]
    * */
    
    private static int[] twoSum(int[] nums, int target) {
        /*
        * 解法：
        *   1、用数组中的每个索引依次与其他索引计算；
        *   2、结果如果符合target的要求并且索引不为同一索引，则返回。
        * 复杂度
        *   时间复杂度：O(n*n)
        *   空间复杂度：O(1)
        * */
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        throw  new IllegalArgumentException("IllegalArgumentException");
    }
    
    private static int[] twoSumHashMap(int[] nums , int target) {
        /*
        * 解法：
        *   1、遍历nums获取一个key为nums值，value为nums索引的Map
        *   2、再次遍历nums，如果target减去nums[i]等于Map的某个Key，则返回该key对应的value（索引）
        * 复杂度：
        *   时间复杂度：O(n)
        *   空间复杂度：O(n)
        * 问题：
        *   1、containsKey() hash冲突后时间复杂度可能提升为o(n*n)?
        *       数字的hashCode为它本身,不可能存在hash碰撞
        * */
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int resultInt = target - nums[i];
            if (hashMap.containsKey(resultInt) && hashMap.get(resultInt) != i) {
                return new int[]{i, hashMap.get(resultInt)};
            }
        }
        throw  new IllegalArgumentException("IllegalArgumentException");
    }
    
    private static int[] twoSumOneHashMap(int[] nums, int target) {
        /*
         * 解法：
         *   1、遍历获取nums中每个数字
         *   2、如果target减去nums[i]等于Map的某个Key，则return [该key对应的value, i]；
         *   3、否则将该数字存入Map，继续遍历
         * 复杂度：
         *   时间复杂度：O(n)
         *   空间复杂度：O(n)
         * */
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (hashMap.containsKey(result)) {
                return new int[]{hashMap.get(result), i};
            }
            hashMap.put(nums[i], i);
        }
        throw  new IllegalArgumentException("IllegalArgumentException");
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 11};
        int[] twoSum = twoSum(nums, 10);
        System.out.println("twoSum: " + Arrays.toString(twoSum));
        int[] twoSumHashMap = twoSumHashMap(nums, 10);
        System.out.println("twoSumHashMap: " + Arrays.toString(twoSumHashMap));
        int[] twoSumOneHashMap = twoSumOneHashMap(nums, 10);
        System.out.println("twoSumOneHashMap: " + Arrays.toString(twoSumOneHashMap));
    }
}
