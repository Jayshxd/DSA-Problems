package com.dsa.problems.linked_list;

public class MiddleoftheLinkedList {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
         ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode middleNode(ListNode head) {
            int count = 1;
            ListNode temp = head;
            while(temp.next!=null){
                temp=temp.next;
                count++;
            }
            ListNode temp2 = head;
            int c = 1;
            while(c!=((count/2)+1) && temp2.next!=null){
                temp2=temp2.next;
                c++;
            }
            return temp2;

        }
    }
}
