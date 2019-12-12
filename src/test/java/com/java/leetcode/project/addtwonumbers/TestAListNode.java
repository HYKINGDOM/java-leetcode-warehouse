package com.java.leetcode.project.addtwonumbers;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * 构建测试链表
 *
 * @author yihur
 */
@Slf4j
public class TestAListNode {


    ListNode listNode;

    @Before
    public void creat_list_node() {
        listNode = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;
    }


    @Test
    public void test_add_list_node() {
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        int num = listNode1.val + listNode2.val + listNode3.val;
        Assert.assertEquals(9, num);
        ListNode next2 = listNode1.next;
        int val = listNode1.val;
        Assert.assertEquals(2, val);
        ListNode next3 = next2.next;
        int val1 = next2.val;
        Assert.assertEquals(3, val1);
        int val3 = next3.val;
        Assert.assertEquals(4, val3);
    }

    @Test
    public void test_add_list_node_foreach() {
        int sum = 0;
        int i = 1;
        while (listNode != null && listNode.val != 0) {
            int val = listNode.val;
            sum = sum + val * i;
            i = i * 10;
            listNode = listNode.next;
        }
        Assert.assertEquals(432, sum);
    }

    @Test
    public void test_num_create_list_node() {
        int num = 432;
        ListNode listNode = null;
        while (num / 10 != 0) {
            listNode = new ListNode(num % 10);
            listNode.next = new ListNode(num % 10);
            num = num / 10;
        }
        int val = listNode.val;

        Assert.assertEquals(4, val);
    }


}
