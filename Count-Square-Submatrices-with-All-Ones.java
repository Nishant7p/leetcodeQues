1class Solution {
2    public int countSquares(int[][] arr) {
3        int n=arr.length;
4        int m=arr[0].length;
5        int[][] dp=new int[n][m];
6        int ans=0;
7        for(int i=0;i<n;i++){
8            dp[i][0]=arr[i][0];
9            ans=ans+dp[i][0];
10        }
11         for(int i=1;i<m;i++){
12            dp[0][i]=arr[0][i];
13            ans=ans+dp[0][i];
14            
15        }
16
17
18        for(int i=1;i<n;i++){
19            for(int j=1;j<m;j++){
20                if(arr[i][j]==1){
21                int up=dp[i-1][j-1];
22                int top=dp[i-1][j];
23                int left=dp[i][j-1];
24                dp[i][j] = Math.min(up, Math.min(left, top)) + 1;
25                ans=ans+dp[i][j];
26                }
27
28            }
29        }
30       return ans;
31    }
32}