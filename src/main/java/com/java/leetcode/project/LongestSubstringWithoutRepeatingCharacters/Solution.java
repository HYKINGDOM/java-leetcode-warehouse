package com.java.leetcode.project.LongestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 连接 https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 *
 * @author Administrator
 */
public class Solution {


    /**
     * 1,将字符串分解成list
     * 2,使用两层for循环,分别从list中按顺序取字符,
     * 3,取出来的字符放到set中,
     * 4,将set的长度和按list顺序次数进行比对,如果小,则说明有重复,进行下一次循环,如果没没有则继续
     * 5,知道找到第一个匹配的字符串为止
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (("").equals(s)) {
            return 0;
        }
        if (s.trim().length() == 1) {
            return 1;
        }
        int sLength = s.length();
        List<String> list = new ArrayList<>();
        for (int j = 0; j < sLength; j++) {
            list.add(s.substring(j, j + 1));
        }
        int maxInt = 0;
        List<String> stringList = new ArrayList<>();
        a:
        for (int j = 0; j < sLength; j++) {
            for (int i = j; i < sLength; i++) {
                String s1 = list.get(i);
                if (stringList.contains(s1)) {
                    int size = stringList.size();
                    maxInt = Math.max(maxInt, size);
                    stringList.clear();
                    continue a;
                } else {
                    stringList.add(s1);
                    int size2 = stringList.size();
                    if (size2 == i || size2 == sLength - j) {
                        maxInt = Math.max(maxInt, size2);
                    }
                }
            }
            stringList.clear();
        }
        return maxInt;
    }

}
