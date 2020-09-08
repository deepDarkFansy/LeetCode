package com.dlut.hzj.Leetcode.LeetCode.TT_51;

import java.util.ArrayList;
import java.util.List;

public class NQueens_Hzj_51 {
    public static void main(String[] args) {
        int n = 8;
        Solution test = new Solution();
        List<List<String>> result = test.solveNQueens(n);
        for (List<String> temp : result) {
            for (String aTemp : temp) {
                System.out.println(aTemp);
            }
            System.out.println("########################");
        }

    }
}

class Solution{
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solve = new ArrayList<>();
        if (n==1){
            return solve;
        }
        int[] temp = new int[n];
        for(int i=0; i<n; i++){
            temp[i] = -1;
        }
        List<int[]> res = new ArrayList<>();
        putChess(temp, res, 0, n);
        for(int[] ele: res){
            List<String> tt = new ArrayList<>();
            for(int index: ele){
                StringBuilder ttt = new StringBuilder();
                for(int ii=0; ii<n; ii++){
                    if (index == ii){
                        ttt.append("Q");
                    }else {
                        ttt.append(".");
                    }
                }
                tt.add(ttt.toString());
            }
            solve.add(tt);
        }
        return solve;
    }

    void putChess(int[] temp, List<int[]> res, int putNum, int totalNum){
        if(putNum == 0) {
            for (int i = 0; i < totalNum; i++) {
                temp[0] = i;
                putChess(temp, res, putNum + 1, totalNum);
                temp[0] = -1;
            }
        }else if (putNum < totalNum-1){
            for(int i = 0; i < totalNum; i++){
                int flag = 1;
                for(int j=0; j<putNum; j++){
                    if(!checkIt(putNum, i, j, temp[j])){
                        flag = 0;
                        break;
                    }
                }
                if(flag == 1){
                    temp[putNum] = i;

                    putChess(temp, res, putNum+1, totalNum);
                    temp[putNum] = -1;
                }
            }
        }else{

            for(int i = 0; i < totalNum; i++){
                int flag = 1;
                for(int j=0; j<putNum; j++){
                    if(!checkIt(putNum, i, j, temp[j])){
                        flag = 0;
                        break;
                    }
                }
                if(flag == 1){
                    temp[totalNum-1] = i;
                    int[] tt = new int [totalNum];
                    for (int in=0; in<totalNum; in++){
                        tt[in] = temp[in];
                    }
                    res.add(tt);
                }
            }
        }
    }

    boolean checkIt(int x1, int y1, int x2, int y2){
        if(y1 == y2 || x1 == x2) {
            return false;
        }
        return Math.abs(x1 - x2) != Math.abs(y1 - y2);
    }
}
