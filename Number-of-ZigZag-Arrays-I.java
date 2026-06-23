1class Solution {
2    public int zigZagArrays(int n, int l, int r) {
3        int k=r-l+1;
4        int mod=1000000007;
5        int[][] dp=new int[k+1][2];
6        for(int i=1;i<=k;i++){
7            dp[i][0]=k-i;
8            dp[i][1]=i-1;
9        }
10        for(int i=3;i<=n;i++){
11            int[][] n_dp=new int[k+1][2];
12            long sum0=0;
13            for(int j=1;j<=k;j++){
14                n_dp[j][1]=(int) sum0;
15                sum0=(sum0+dp[j][0])%mod;
16            }
17            long sum1=0;
18            for(int j=k;j>=1;j--){
19                n_dp[j][0]=(int) sum1;
20                sum1=(sum1+dp[j][1])%mod;
21            }
22            dp=n_dp;
23
24        }
25        long ans=0;
26        for(int i=1;i<=k;i++){
27            ans=(ans+dp[i][0])%mod;
28            ans=(ans+dp[i][1])%mod;
29        }
30
31
32        return (int) ans;
33    }
34}