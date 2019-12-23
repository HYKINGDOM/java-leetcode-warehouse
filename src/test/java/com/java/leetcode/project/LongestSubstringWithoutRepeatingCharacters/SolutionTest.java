package com.java.leetcode.project.LongestSubstringWithoutRepeatingCharacters;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.*;

@Slf4j
public class SolutionTest {


    /**
     * 1,将字符串分解成list
     * 2,使用两层for循环,分别从list中按顺序取字符,
     * 3,取出来的字符放到set中,
     * 4,将set的长度和按list顺序次数进行比对,如果小,则说明有重复,进行下一次循环,如果没没有则继续
     * 5,知道找到第一个匹配的字符串为止
     */
    @Test
    public void test_string_min_length() {
        String str = "abcabcbb";
        int length = str.length();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(str.substring(i, i + 1));
        }
        System.out.println(Arrays.toString(list.toArray()));
        List<String> stringSet = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        a:
        for (int j = 0; j < list.size(); j++) {
            b:
            for (int i = j; i < list.size(); i++) {
                String s1 = list.get(i);
                if (stringSet.contains(s1)) {
                    String toString = stringSet.toString();
                    int size = stringSet.size();
                    map.put(toString, size);
                    stringSet.clear();
                    continue b;
                } else {
                    stringSet.add(s1);
                }
            }
            stringSet.clear();
        }


        System.out.println(map.toString());
    }

    @Test
    public void test_for_continue() {
//a在此处运行结果为：i:0 i:0 i:0
        for (int j = 0; j < 3; j++) {
            a:
//a在此处，结果与无a标记一样
            for (int i = 0; i < 3; i++) {
                if (i == 1) {
                    continue a;
                }

                System.out.print("i:" + i);
            }
        }
    }
}
