package com.leetcode.common;

public class PrintArray {
	public static void printArray(int[] nums1){
		for(int i=0;i<nums1.length;i++)
		{
			System.out.print(nums1[i]);
			if((i+1)!=nums1.length)
				System.out.print(",");
		}
		
	}
}
