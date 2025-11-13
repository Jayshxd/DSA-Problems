package com.dsa.problems.linked_list;

public class OddEvenLinkedList {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode oddEvenList(ListNode head) {
            if(head==null || head.next==null) return head;
            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenHead = even;
            while((odd!=null && odd.next!=null)||(even!=null && even.next!=null)){
                odd.next = even.next;
                if(odd.next!=null){
                    odd = odd.next;
                }
                even.next = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
            return head;
        }
    }
}
