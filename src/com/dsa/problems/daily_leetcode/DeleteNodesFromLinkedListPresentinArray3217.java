package com.dsa.problems.daily_leetcode;

import java.util.HashSet;
import java.util.Set;

public class DeleteNodesFromLinkedListPresentinArray3217 {

      public class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    class Solution {
        public ListNode modifiedList(int[] nums, ListNode head) {
            Set<Integer> set = new HashSet<>();
            for(int i : nums) set.add(i);

            ListNode prev = null;
            ListNode curr = head;

            while(curr!=null){

                if(set.contains(curr.val)){
                    if(prev==null){
                        head=head.next;
                    }else{
                        prev.next = curr.next;
                    }
                }else{
                    prev=curr;
                }

                curr = curr.next;
            }
            return head;
        }
    }


}
