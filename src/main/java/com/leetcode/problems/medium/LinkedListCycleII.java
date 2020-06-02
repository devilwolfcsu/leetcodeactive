package com.leetcode.problems.medium;

import com.leetcode.problems.ListNode;

/**
 * 142. 环形链表 II Linked List Cycle II
 *
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * 说明：不允许修改给定的链表。
 *
 * [示例1]
 * 输入：head = [3,2,0,-4], pos = 1
 * 输出：tail connects to node index 1
 * 解释：链表中有一个环，其尾部连接到第二个节点。
 *
 *
 * Created by zeyuan on 2020/6/2.
 */
public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode commonNode = getCommonNode(head);
        if(commonNode == null){
            return null;
        }
        // 找到环的交点
        // 将commonNode 当作Y形链表的尾部
        ListNode rightHead = commonNode.next;
        ListNode tmp = rightHead;
        int rightLenght = 0;
        while(tmp!=commonNode){
            tmp = tmp.next;
            rightLenght++;
        }
        int leftLenght =0;
        tmp = head;
        while(tmp!=commonNode){
            tmp = tmp.next;
            leftLenght++;
        }
        ListNode leftIndex = head;
        ListNode rightIndex = rightHead;
        if(leftLenght>rightLenght){
            int firstLenght = leftLenght-rightLenght;
            while(firstLenght>0){
                leftIndex = leftIndex.next;
                firstLenght--;
            }
        }
        if(rightLenght>leftLenght){
            int firstLenght = rightLenght-leftLenght;
            while(firstLenght>0){
                rightIndex = rightIndex.next;
                firstLenght--;
            }
        }

        while(rightIndex!=leftIndex){
            rightIndex = rightIndex.next;
            leftIndex = leftIndex.next;
        }
        return leftIndex;
    }

    /** 如果成环则返回换上的一个节点 否则返回空 */
    private ListNode getCommonNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null&&fast.next!=null){
            if(slow ==fast){
                return fast;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return null;
    }
}
