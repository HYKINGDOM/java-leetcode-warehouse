package com.java.leetcode.project.medianoftwosortedarrays;

import java.util.*;

/**
 * 问题: 求两个有序数组的中位数,默认数组不可能为空
 * 1,首先两个数组分别都是从小到大排列的
 * 2,根据两个数组生成新的数组,在新的数组中求取中位数
 *
 * 执行结果：通过 显示详情
 * 执行用时 : 10 ms, 在所有 java 提交中击败了13.21%的用户
 * 内存消耗 : 46.8 MB, 在所有 java 提交中击败了95.33%的用户
 * @author Administrator
 */
public class MedianofTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double sortedNum = 0.0;
        List<Integer> integerList = new ArrayList<>();
        for (int value : nums1) {
            integerList.add(value);
        }
        for (int value : nums2) {
            integerList.add(value);
        }
        Collections.sort(integerList);
        int size = integerList.size();
        int isOddNum = size % 2;
        int i = size / 2;
        if (isOddNum == 0) {
            sortedNum = sortedNum + integerList.get(i - 1);
            sortedNum = sortedNum + integerList.get(i);
            sortedNum = (double) (sortedNum / 2);
        } else {
            sortedNum = sortedNum + integerList.get(i);
        }
        return sortedNum;
    }
}
