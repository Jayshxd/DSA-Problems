package com.dsa.problems.linked_list;

public class PalindromeLinkedList {

      public class ListNode {
         int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public boolean isPalindrome(ListNode head) {
            if(head==null)return false;
            if(head.next==null) return true;
            ListNode s = head;
            ListNode f = head;
            while(f.next!=null && f.next.next!=null){
                s=s.next;
                f=f.next.next;
            }
            ListNode nh = r(s.next);
            ListNode t1 = head;
            ListNode t2 = nh;
            while(t2!=null){
                if(t1.val!=t2.val){
                    return false;
                }
                t1=t1.next;
                t2=t2.next;
            }
            return true;
        }
        public ListNode r(ListNode head){
            ListNode back = null;
            ListNode curr = head;
            while(curr!=null){
                ListNode front = curr.next;
                curr.next = back;
                back = curr;
                curr = front;
            }
            return back;
        }
    }
}
