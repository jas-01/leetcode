class Solution {
    public int maxSubArray(int[] n) {
  int currSum = n[0];
        int maxSum = n[0];
        
        for (int i = 1; i < n.length; i++) {
            currSum = Math.max(n[i], currSum + n[i]); // extend or restart
            maxSum = Math.max(maxSum, currSum);
        }
        
        return maxSum;
    }
}