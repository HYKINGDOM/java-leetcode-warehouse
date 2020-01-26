package com.java.leetcode.project.LongestPalindromicSubstring;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * 最长回文字符串
 */
public class LongestPalindromicSubstringTest {


    private LongestPalindromicSubstring longestPalindromicSubstring;

    @Before
    public void initLongestPalindromicSubstring() {
        longestPalindromicSubstring = new LongestPalindromicSubstring();
    }

    @Test
    public void test_input_null_sting() {
        String string = "";
        String s = longestPalindromicSubstring.longestPalindromic(string);
        Assertions.assertEquals("", s);
    }

    @Test
    public void test_input_palindromic_sting() {
        String string = "babad";
        String s = longestPalindromicSubstring.longestPalindromic(string);
        Assertions.assertEquals("bab", s);
    }


    @Test
    public void test_input_palindromic_sting_02() {
        String string = "cbbd";
        String s = longestPalindromicSubstring.longestPalindromic(string);
        Assertions.assertEquals("bb", s);
    }

    @Test
    public void test_input_palindromic_sting_03() {
        String string = "a";
        String s = longestPalindromicSubstring.longestPalindromic(string);
        Assertions.assertEquals("a", s);
    }

    @Test
    public void test_input_palindromic_sting_04() {
        String string = "ac";
        String s = longestPalindromicSubstring.longestPalindromic(string);
        Assertions.assertEquals("a", s);
    }

    @Test
    public void test_input_palindromic_sting_05() {
        String string = "acdfghyu";
        String s = longestPalindromicSubstring.longestPalindromic(string);
        Assertions.assertEquals("a", s);
    }

    @Test
    public void test_input_palindromic_sting_06() {
        String string = "abcba";
        String s = longestPalindromicSubstring.longestPalindromic(string);
        Assertions.assertEquals("abcba", s);
    }

    @Test
    public void test_input_palindromic_sting_07() {
        String string = "abcda";
        String s = longestPalindromicSubstring.longestPalindromic(string);
        Assertions.assertEquals("a", s);
    }

    @Test
    public void test_input_palindromic_sting_08() {
        String string = "abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa";
        String s = longestPalindromicSubstring.longestPalindromic(string);
        Assertions.assertEquals("abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa", s);
    }



    @Test
    public void test_input_palindromic_sting_09() {
        String string = "ccc";
        String s = longestPalindromicSubstring.longestPalindromic(string);
        Assertions.assertEquals("ccc", s);
    }

    @Test
    public void test_input_palindromic_sting_10() {
        String string = "cbbd";
        String s = longestPalindromicSubstring.longestPalindromic(string);
        Assertions.assertEquals("bb", s);
    }
}
