package com.dlut.hzj.Leetcode.LeetCode.TT_841;

import java.util.ArrayList;
import java.util.List;

public class Dfs_KeyAndRooms_841 {
    private int num;
    private int[] flag;
    public static void main(String[] args) {
        List<Integer> t1 = new ArrayList<>();
        t1.add(1);
        List<Integer> t2 = new ArrayList<>();
        t2.add(2);
        List<Integer> t3 = new ArrayList<>();
        t3.add(3);
        List<Integer> t4 = new ArrayList<>();
        List<List<Integer>> tt = new ArrayList<>();
        tt.add(t1);
        tt.add(t2);
        tt.add(t3);
        tt.add(t4);
        Dfs_KeyAndRooms_841 test = new Dfs_KeyAndRooms_841();
        System.out.println(test.canVisitAllRooms(tt));
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        num=0;
        int n = rooms.size();
        flag = new int[n];
        dfs(rooms, 0);
        return num==n;
    }

    public void dfs(List<List<Integer>> rooms, int n){
        flag[n] = 1;
        num++;
        for(int key : rooms.get(n)){
            if(flag[key] != 1){
                dfs(rooms, key);
            }
        }
    }
}
