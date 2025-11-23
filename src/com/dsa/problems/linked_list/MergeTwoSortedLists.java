package com.dsa.problems.linked_list;

public class MergeTwoSortedLists {


      public class ListNode {
          int val;
          ListNode next;
     ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode mergeTwoLists(ListNode a, ListNode b) {
            if(a==null && b==null) return null;
            if(a==null) return b;
            if(b==null) return a;

            ListNode t1 = a;
            ListNode t2 = b;
            ListNode dn = new ListNode(-1);
            ListNode temp = dn;
            while(t1!=null && t2!=null){
                if(t1.val<t2.val){
                    temp.next = t1;
                    temp = t1;
                    t1 = t1.next;
                }else{
                    temp.next=t2;
                    temp=t2;
                    t2=t2.next;
                }
            }
            if(t1!=null){
                temp.next = t1;
            }
            if(t2!=null){
                temp.next=t2;
            }
            return dn.next;
        }
    }
}
