package com.dlut.hzj.Leetcode.LeetCode.TT_841;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class KeysAndRooms_Hzj_841 {
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
        System.out.println(canVisitAllRooms(tt));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> mySet = new HashSet<>(rooms.get(0));
        List<Integer> temp = new ArrayList<>(rooms.get(0));
        List<Integer> temp1 = new ArrayList<>();
        do {
            for (int i : temp) {
                List<Integer> mm = rooms.get(i);
                for (int key : mm) {
                    if (!mySet.contains(key)) {
                        mySet.add(key);
                        temp1.add(key);
                    }
                }
            }
            temp.clear();
            temp.addAll(temp1);
            temp1.clear();
        } while (!temp.isEmpty());
        mySet.add(0);
        System.out.println(mySet);
        System.out.println(rooms);
        return mySet.size() == rooms.size();
    }

}
