package com.java.leetcode.project.addtwonumbers;

import org.junit.Assert;
import org.junit.Test;

/**
 * 构建测试链表
 *
 * @author yihur
 */
public class TestAListNode {


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


    }

}
