package com.dlut.hzj.Leetcode.LeetCode.TT_77;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Combinations_Hzj_77 {
    public static void main(String[] args) {
        Solution test =  new Solution();
        List<List<Integer>> res = test.combine(4,2);
        System.out.println("[");
        for(List<Integer> t:res){
            System.out.print("[");
            for(int tt:t){
                System.out.print(tt+"  ");
            }
            System.out.println("],");
        }
        System.out.println("]");
    }
}


class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayDeque<Integer> temp = new ArrayDeque<>();
        add_it(res, temp, 1, n, k);
        return res;
    }

    public void add_it(List<List<Integer>> res, ArrayDeque<Integer> temp, int index, int n_n, int k_n){
        if(temp.size() == k_n){
            res.add(new ArrayList<>(temp));
        } else{
            for(int i=index; i<=n_n-k_n+temp.size()+1; i++){
                temp.push(i);
                add_it(res, temp, i+1, n_n, k_n);
                temp.pop();
            }
        }
    }
}