package com.java.leetcode.project.LongestPalindromicSubstring;

import java.util.ArrayList;
import java.util.List;

/**
 * 问题: 最长回文子串,给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 1,先将字符串转换成集合
 *
 * @author Administrator
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (("").equals(s.trim())) {
            return "";
        }

        int length = s.length();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            stringList.add(s.substring(i, i + 1));
        }
        for (String s1 : stringList) {

        }


        return "";
    }
}
