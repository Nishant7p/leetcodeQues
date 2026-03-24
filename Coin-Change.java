1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int[][] dp=new int[amount+1][coins.length];
4        int m=Integer.MAX_VALUE-1;
5        for(int i=0;i<coins.length;i++){
6            dp[0][i]=0;
7        }
8        for(int i=0;i<amount+1;i++){
9           if(i%coins[0]==0){
10            dp[i][0]=i/coins[0];
11           }
12           else{
13            dp[i][0]=m;
14
15           }
16        }
17        for(int i=1;i<amount+1;i++){
18            for(int j=1;j<coins.length;j++){
19                if(i<coins[j]){
20                    dp[i][j]=dp[i][j-1];
21                }
22                else{
23                     dp[i][j]=Math.min(dp[i][j-1],1+dp[i-coins[j]][j]);
24
25                }
26            }
27        }
28        if(dp[amount][coins.length-1]==m){
29            return -1;
30        }
31        return dp[amount][coins.length-1];
32
33
34        
35    }
36}