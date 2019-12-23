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
        String str = "cx";
        int length = str.length();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(str.substring(i, i + 1));
        }
        System.out.println(Arrays.toString(list.toArray()));
        List<String> stringSet = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        List<Integer> stringArrayList = new ArrayList<>();
        a:
        for (int j = 0; j < list.size(); j++) {
            b:
            for (int i = j; i < list.size(); i++) {
                String s1 = list.get(i);
                if (stringSet.contains(s1)) {
                    String toString = stringSet.toString();
                    int size = stringSet.size();
                    map.put(toString, size);
                    stringArrayList.add(size);
                    stringSet.clear();
                    continue b;
                } else {
                    stringSet.add(s1);
                }
            }
            stringSet.clear();
        }

        Integer max = Collections.max(stringArrayList);
        System.out.println(max);
        System.out.println(map.toString());




    }

    public int test_for_continue(String s) {
        if (("").equals(s)) {
            return 0;
        }
        if ((" ").equals(s)) {
            return 1;
        }
        if (s.trim().length()==1){
            return 1;
        }
        int length = s.length();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(s.substring(i, i + 1));
        }
        System.out.println(Arrays.toString(list.toArray()));
        List<String> stringSet = new ArrayList<>();
        List<Integer> stringArrayList = new ArrayList<>();
        a:
        for (int j = 0; j < list.size(); j++) {
            b:
            for (int i = j; i < list.size(); i++) {
                String s1 = list.get(i);
                if (stringSet.contains(s1)) {
                    int size = stringSet.size();
                    stringArrayList.add(size);
                    stringSet.clear();
                    continue b;
                } else {
                    stringSet.add(s1);
                }
            }
            stringSet.clear();
        }
        if (stringArrayList.size()==0){
            return 1;
        }
        Integer max = Collections.max(stringArrayList);
        System.out.println(max);
        return max;
    }
}
