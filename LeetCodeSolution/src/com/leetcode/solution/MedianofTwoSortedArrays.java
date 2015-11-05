package com.leetcode.solution;

public class MedianofTwoSortedArrays {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int ai = 0,bi = 0,a,b,k,cursor = 0;
		double result = 0.0;
        a=nums1.length;
        b=nums2.length;
        k=(a+b)/2;
        double[] resultArray=new double[a+b];
        while(cursor<=k){
        	if(ai<a){
        		if(bi<b && nums1[ai]>nums2[bi]){
            		resultArray[cursor]=nums2[bi];
            		bi++;
            		cursor++;
            	}
            	else{
            		resultArray[cursor]=nums1[ai];
            		cursor++;
            		ai++;
            	}
        	}
        	else{
        		resultArray[cursor]=nums2[bi];
        	    bi++;
        	    cursor++;
        	}
        }
        if((a+b)%2==0 ){
        	result=(resultArray[k]+resultArray[k-1])/2;
         	return result;
        }
        if((a+b)%2==1 ){
        	result=resultArray[k];
            return result;
        }
        return result;
	}
}
