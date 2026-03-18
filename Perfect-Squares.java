1class Solution {
2    public int numSquares(int n) {
3        int[] dp=new int[n+1];
4
5        dp[1]=1;
6        for(int i=2;i<=n;i++){
7            int sq=(int)Math.sqrt(i);
8            if(sq*sq==i){
9                dp[i]=1;
10            }
11            else{
12                int min=Integer.MAX_VALUE;
13
14
15                for(int j=1;j*j<=i;j++){
16                    int temp=dp[i-j*j];
17                    min=Math.min(min,temp);
18
19
20                }
21                dp[i]=min+1;
22
23
24
25            }
26            
27        }
28        return dp[n];
29        
30    }
31}