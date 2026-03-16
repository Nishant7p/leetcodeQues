1class Solution {
2    
3       
4    public int uniquePaths(int m, int n) {
5        int[][] dp=new int[m][n];
6       for(int i=0;i<m;i++){
7            Arrays.fill(dp[i], -1);
8        }
9       for(int i=0;i<m;i++){
10        dp[i][0]=1;
11       }
12       for(int i=0;i<n;i++){
13        dp[0][i]=1;
14       }
15
16
17       
18       for(int i=1;i<m;i++){
19        for(int j=1;j<n;j++){
20            dp[i][j]=dp[i][j-1]+dp[i-1][j];
21        }
22       }
23       return dp[m-1][n-1];
24        
25    }
26}