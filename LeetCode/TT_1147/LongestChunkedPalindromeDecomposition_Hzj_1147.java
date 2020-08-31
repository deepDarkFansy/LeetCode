package com.dlut.hzj.Leetcode.LeetCode.TT_1147;

public class LongestChunkedPalindromeDecomposition_Hzj_1147 {
    public static void main(String[] args) {
        String text = "elvtoelvto";
        LongestChunkedPalindromeDecomposition_Hzj_1147 test =  new LongestChunkedPalindromeDecomposition_Hzj_1147();
        System.out.println(test.longestDecomposition(text));
    }
    int num;
    public int longestDecomposition(String text) {
        num=0;
        int size = text.length();
        dfs(text, 0, 1, size);
        return num;
    }

    public void dfs(String text, int start, int pos, int length){
        if(start+pos <= length/2){
            String str1 = text.substring(start, start+pos);
            String str2 = text.substring(length-pos-start, length-start);
            if(str1.equals(str2)){
                num+=2;
                dfs(text, start+pos, 1, length);
            }else{
                dfs(text, start, pos+1, length);
            }
        }else if((pos+start)*2-1 == length || pos>1){
            num++;
        }
    }
}
