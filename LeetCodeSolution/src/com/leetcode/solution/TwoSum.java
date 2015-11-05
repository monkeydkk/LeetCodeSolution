package com.leetcode.solution;

import java.util.Hashtable;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
	    int[] result = {0,0};
	    for(int i=0;i<nums.length;i++){
	    	ht.put(nums[i],i);
        }
	    for(int i=0;i<nums.length;i++){
	    	int gap = target - nums[i];
            if(ht.get(gap)!=null && ht.get(gap)>i){
                result[0] = i + 1;
                result[1] = ht.get(gap) + 1;
            }
	    }
	    return result;
    }
}
