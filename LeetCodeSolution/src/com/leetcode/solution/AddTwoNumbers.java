package com.leetcode.solution;

import com.leetcode.common.ListNode;

public class AddTwoNumbers {
	   public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			ListNode result = new ListNode(0);
			ListNode currentNode = result;
			ListNode pre =  null;
			int carry = 0;
	        while(l1 != null && l2 != null){
	        	currentNode.val = (l1.val + l2.val + carry) % 10;
	        	carry =  (l1.val + l2.val + carry) / 10;
	        	pre = currentNode;
	        	currentNode = new ListNode(0);
	        	pre.next = currentNode;
	        	l1 = l1.next;
	        	l2 = l2.next;
	        }
	        currentNode = addWithCarry(l1, l2, carry);
	        pre.next = currentNode;
	        return result;       
	    }
		public static ListNode addWithCarry(ListNode l1, ListNode l2, int carry){
			if (l1 == null && l2 == null) {
				if (carry != 0) {
					ListNode cur = new ListNode(0);
					cur.val = carry;
					return cur;
				}
				return null;
			}
			if (l1 == null) {
				return addWithCarry(l2, l1, carry);
			}
			ListNode result = new ListNode(0);
			ListNode cur = result;
			ListNode pre =  null;
			while (l1 != null) {
				cur.val = (l1.val + carry) % 10;
	        	carry =  (l1.val + carry) / 10;
	        	pre = cur;
	        	cur = new ListNode(carry);
	        	pre.next = cur;
	        	l1 = l1.next;
			}
			if (pre.next.val == 0) {
				pre.next = null;
			}
			return result;
		}
}
