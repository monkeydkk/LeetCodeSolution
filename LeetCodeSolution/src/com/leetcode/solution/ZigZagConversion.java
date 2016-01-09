package com.leetcode.solution;

import java.util.Arrays;

public class ZigZagConversion {
	public static  String zigZagConversion(String s, int numRows){
        int len = s.length();
        if (len == 0 || numRows <= 1) return s;      
        String[] ans = new String[numRows];
        Arrays.fill(ans, "");
        int row = 0, delta = 1;
        for (int i = 0; i < len; i++) {
            ans[row] += s.charAt(i);
            row += delta;
            //如果row＋1超过了numRows行数，减2跳转到倒数第二行并向上减行
            if (row >= numRows) {
                row = numRows-2;
                delta = -1;
            }
            //如果row<0，使row＝1，跳转到第二行并开始向下增行
            if (row < 0) {
                row = 1;
                delta = 1;
            }
        }
        
        String result = "";
        for (int i = 0; i < numRows; i++) {
            result += ans[i];
        }
        return result;
	}

}
