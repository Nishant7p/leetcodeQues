class Solution {
    int[] dp=new int[38];
    public int tribonacci(int n) {
        if(n==0){
            dp[n]=0;
             return dp[n];
        }
        if(n==1){
            dp[n]=1;
             return dp[n];
        }
        if(n==2){
            dp[n]=1;
             return dp[n];
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        return dp[n];
    }
}
