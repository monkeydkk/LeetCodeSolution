package com.leetcode.test;

import java.sql.Connection;
import java.sql.ResultSet;

import com.leetcode.common.ListNode;
import com.leetcode.common.PrintArray;
import com.leetcode.common.PrintListNode;
import com.leetcode.solution.ZigZagConversion;

public class Test {

	public static void main(String[] args){ 
		/**
		 * No.5 ZigZag Conversion
		 */
			String input="PAYPALISHIRING";
			String output;
			System.out.println("input:");
			System.out.println(input);
			System.out.println("output:");
			output=ZigZagConversion.zigZagConversion(input,3);
			System.out.print(output);
		/**
		 * No.4 Median of Two Sorted Arrays
		 */
//			int[] nums1=new int[]{1,2};
//			int[] nums2=new int[]{1,2};
//			double result=MedianofTwoSortedArrays.findMedianSortedArrays(nums1,nums2);
//			System.out.print("nums1:{");
//			PrintArray.printArray(nums1);
//			System.out.println("}    ");
//			System.out.print("nums2:{");
//			PrintArray.printArray(nums2);
//			System.out.println("}");
//			System.out.print("the median of the two sorted arrays is:��"+result+"��");
		/**
		 * No.3 Longest Substring Without Repeating Characters
		*/
//		String input="abbc";
//		int max=LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
//		System.out.print("For "+input+" the longest substring length is "+max);
		
		/**
		 * No.2 Add Two Numbers     4ms
		 */
//		ListNode l1 = new ListNode(3);
//		l1.next=new ListNode(5);
//		ListNode l2 =new ListNode(5);
//		l2.next=new ListNode(7);
//		ListNode result=AddTwoNumbers.addTwoNumbers(l1,l2);
//		PrintListNode.printListNode(l1);
//		System.out.print(" + ");
//		PrintListNode.printListNode(l2);
//		System.out.println("   Result:");
//		PrintListNode.printListNode(result);
		/**
		 * No.1 Add Two Sum     10ms
		 */
//		int[] input={1,3,5,-1,10};
//		int target=0;
//		int[] result=TwoSum.twoSum(input,target);
//		System.out.print("input:{");
//		for(int i=0;i<input.length;i++){
//			System.out.print(input[i]);
//			if(i+1!=input.length)
//				System.out.print(",");
//		}
//		System.out.println("},target="+target);
//		System.out.print("output��index1="+result[0]);
//		System.out.print(",index2="+result[1]);
	}
}
