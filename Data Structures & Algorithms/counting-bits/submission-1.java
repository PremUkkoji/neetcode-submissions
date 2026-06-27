class Solution {
    public int[] countBits(int n) {
        int dp[] = new int[n+1];
        dp[0] = 0;
        int offset = 1;
        for(int i=1;i<=n;i++) {
            if(i == 2 * offset) offset = i;
            dp[i] = 1 + dp[i - offset];
        }
        return dp;
    }
}
