// Problem link - https://leetcode.com/problems/longest-increasing-subsequence/

// TC - O(N * N)
// SC - O(N)
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int max = 0;

        for(int i = 0; i < n; i++){
            for(int j = i - 1; j >= 0; j--){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(dp[i], max);
        }

        return max;
    }
}
