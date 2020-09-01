package com.dlut.hzj.Leetcode.LeetCode.TT_486;

public class PredictTheWinner_Hzj_486 {
    public static void main(String[] args) {
        int[] nums;
        nums = new int[]{1,5,233,1};
        Solution test = new Solution();
        System.out.println(test.PredictTheWinner(nums));
    }
}

class Solution{
    public boolean PredictTheWinner(int[] nums) {
        int lenth = nums.length;
        if (lenth%2 == 0){
            return true;
        }
        int[][] dp = new int[lenth][lenth];
        for(int i=0; i<lenth; i++){
            dp[i][i] = nums[i];
        }
        for(int i=lenth-2; i>=0; i--){
            for(int j=i+1; j<lenth; j++){
                dp[i][j] = Math.max(nums[i] -dp[i+1][j], nums[j] - dp[i][j-1]);
            }
        }
        return dp[0][lenth-1]>=0;

//        return total(nums, 0, nums.length-1, 1)>0;
    }

    public int total(int[] nums, int left, int right, int choose){
        if(left == right){
            return nums[left]*choose;
        }
        int tmp = nums[left]*choose + total(nums, left+1, right, -choose);
        int tmp1 = nums[right]*choose + total(nums, left, right-1, -choose);
        return Math.max(tmp*choose, tmp1*choose)*choose;
    }

}
