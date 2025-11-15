package com.dsa.problems.linked_list;

public class ReverseLinkedList {

    class Solution {
        public class ListNode {
            int val;
            DeletetheMiddleNodeofaLinkedList.ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, DeletetheMiddleNodeofaLinkedList.ListNode next) { this.val = val; this.next = next; }
        }
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
//            while(curr!=null){
//                ListNode nex = curr.next;
//                curr.next = prev;
//                prev = curr;
//                curr = nex;
//            }
            return prev;
        }
    }
}
