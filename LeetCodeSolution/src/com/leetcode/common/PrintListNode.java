package com.leetcode.common;

public class PrintListNode {
	public static void printListNode(ListNode listnode){
		while(listnode!=null)
		{
			System.out.print(listnode.val);
			listnode=listnode.next;
			if(listnode!=null)
				System.out.print("->");
		}
	}
}
