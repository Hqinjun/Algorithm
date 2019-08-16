package com.qinjun.leetcode;

public class SolutionLeet21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode node1 = l1;
        ListNode node2 = l2;

        ListNode ret1=node;
        while (node1!=null&&node2!=null){
            if(node1.val>node2.val){
                node.next = node1;
                node = node.next;
                node1 = node1.next;
            }else {
                node.next = node2;
                node = node.next;
                node2 = node2.next;
            }

        }
        if(node1==null&&node2!=null)
        {
            node.next=node2;
        }

        if(node2==null&&node1!=null)
        {
            node.next=node1;
        }

        return ret1.next;
    }

    public static void main(String[] args) {

    }
}
