package com.java.leetcode.project.medianoftwosortedarrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class MedianofTwoSortedArraysTest {

    private MedianofTwoSortedArrays medianofTwoSortedArrays;

    @Before
    public void initMedianofTwoSortedArrays() {
        medianofTwoSortedArrays = new MedianofTwoSortedArrays();
    }

    @Test
    public void test_input_odd_array() {
        int[] num1 = new int[]{1, 3};
        int[] num2 = new int[]{2};
        double medianSortedArrays = medianofTwoSortedArrays.findMedianSortedArrays(num1, num2);
        Assertions.assertEquals(2.0, medianSortedArrays);
    }

    @Test
    public void test_input_even_array() {
        int[] num1 = new int[]{1, 2};
        int[] num2 = new int[]{3, 4};
        double medianSortedArrays = medianofTwoSortedArrays.findMedianSortedArrays(num1, num2);
        Assertions.assertEquals(2.5, medianSortedArrays);
    }

    @Test
    public void test_input_negative_array(){
        int[] num1 = new int[]{3};
        int[] num2 = new int[]{-2, -1};
        double medianSortedArrays = medianofTwoSortedArrays.findMedianSortedArrays(num1, num2);
        Assertions.assertEquals(-1.0, medianSortedArrays);
    }

}
