package com.java.leetcode.project.LongestPalindromicSubstring;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class LongestPalindromicSubstringTest {


    private LongestPalindromicSubstring longestPalindromicSubstring;

    @Before
    public void initLongestPalindromicSubstring() {
        longestPalindromicSubstring = new LongestPalindromicSubstring();
    }

    @Test
    public void test_input_null_sting() {
        String string = "";
        String s = longestPalindromicSubstring.longestPalindrome(string);
        Assertions.assertEquals("", s);
    }

    @Test
    public void test_input_palindromic_sting() {
        String string = "babad";
        String s = longestPalindromicSubstring.longestPalindrome(string);
        Assertions.assertEquals("aba", s);
    }
}
