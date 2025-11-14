package com.dsa.problems.linked_list;

public class SwapNodesinPairs {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    class Solution {
        public ListNode swapPairs(ListNode head) {
            if(head == null || head.next==null) return head;
            ListNode curr= head;
            ListNode back = null;

            while(curr!=null && curr.next!=null){
                ListNode front = curr.next;
                curr.next = front.next;
                front.next = curr;
                if(back!=null){
                    back.next = front;
                }else{
                    head = front;
                }
                back = curr;
                curr = curr.next;
            }
            return head;
        }
    }
}
