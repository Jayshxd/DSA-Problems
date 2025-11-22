package com.dsa.problems.linked_list;

public class RotateList {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            ListNode t = head; int c = 1;
            if(head==null || k==0) return head;
            while(t.next!=null){
                t=t.next;
                c++;
            }
            if(k%c==0) return head;
            k = k%c;
            c = c - k;
            t.next  = head;
            t = head;
            while(c!=1){
                t=t.next;
                c--;
            }
            head = t.next;
            t.next = null;
            return head;
        }
    }
}
