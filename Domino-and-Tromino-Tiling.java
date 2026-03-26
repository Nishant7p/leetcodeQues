1class Solution {
2    public int numTilings(int n) {
3        if(n==0){
4            return 1;
5        }
6        if(n==1){
7            return 1;
8        }
9        if(n==2){
10            return 2;
11        }
12
13        int mod = 1000000007;
14        int[] dp = new int[n+1];
15
16        dp[0]=1;
17        dp[1]=1;
18        dp[2]=2;
19
20        for(int i=3;i<=n;i++){
21            long val = (2L * dp[i-1] + dp[i-3]) % mod;
22            dp[i] = (int)val;
23        }
24
25        return dp[n];
26    }
27}