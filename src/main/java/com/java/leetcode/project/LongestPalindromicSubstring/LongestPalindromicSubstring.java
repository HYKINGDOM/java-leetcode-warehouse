package com.java.leetcode.project.LongestPalindromicSubstring;


/**
 * 问题: 最长回文子串,给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * <p>
 * 1,先将字符串转换成集合
 *
 * @author Administrator
 */
public class LongestPalindromicSubstring {
    public String longestPalindromic(String s) {
        String longStr = "";
        int length = s.length();
        a:
        for (int i = 0; i < length; i++) {
            String strListFirst = s.substring(i, i + 1);
            for (int j = 1; j < length; j++) {
                String strListTwo = s.substring(j, j + 1);
                if (strListFirst.equals(strListTwo) && i < j + 1) {
                    String substring = s.substring(i, j + 1);
                    if (isLongestPalindromicSubstring(substring)) {
                        if (longStr.length() < substring.length()) {
                            longStr = substring;
                        }
                    }
                }
            }
        }
        if ("".equals(longStr)) {
            if ("".equals(s.trim())) {
                return "";
            }
            return s.substring(0, 1);
        }
        return longStr;
    }

    /**
     * 根据传入的数据判断字符串是不是最长回文字符串
     *
     * @param substring
     */
    private boolean isLongestPalindromicSubstring(String substring) {
        int lengthStr = substring.length();
        if (lengthStr == 1) {
            return false;
        }
        int length = lengthStr / 2;
        boolean isFlag = true;
        if (lengthStr % 2 == 1) {
            isFlag = false;
        }
        for (int i = 1; i <= length; i++) {
            String substringFirst = substring.substring(length - i, length - i + 1);
            String substringTwo;
            if (isFlag) {
                substringTwo = substring.substring(length + i - 1, length + i);
            } else {
                substringTwo = substring.substring(length + i, length + i + 1);
            }
            if (!substringFirst.equals(substringTwo)) {
                return false;
            }
        }
        return true;
    }

}
