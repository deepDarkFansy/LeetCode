package com.dlut.hzj.Leetcode.LeetCode.TT_1009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComplementOfBase10Integer_Hzj_1009 {
    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.bitwiseComplement(10));
    }
}

class Solution {
//    public int bitwiseComplement(int N) {
//        if (N == 0){
//            return 1;
//        }
//        List<Integer> temp = new ArrayList<>();
//        int result = 0;
//        while (N>0){
//            temp.add(N%2);
//            N = N/2;
//        }
//        System.out.println(temp);
//        for(int i=temp.size()-1; i>=0; i--){
//            if (temp.get(i) == 0){
//                result = result*2 + 1;
//            }else {
//                result = result*2;
//            }
//        }
//        return result;
//    }

    public int bitwiseComplement(int N) {
        int x = N;
        int count = 1;
        while(x>>>1 > 0){
            count++;
            x = x>>>1;
        }

        int tmp = 1<<count;
        int res = N ^ (tmp -1);
        return res;

    }
}
