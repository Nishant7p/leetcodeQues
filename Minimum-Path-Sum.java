1class Solution {
2    public int minPathSum(int[][] grid) {
3        int[][] dp=new int[grid.length][grid[0].length];
4        dp[0][0]=grid[0][0];
5        for(int i=1;i<grid.length;i++){
6            dp[i][0]=grid[i][0]+dp[i-1][0];
7        }
8         for(int i=1;i<grid[0].length;i++){
9            dp[0][i]=grid[0][i]+dp[0][i-1];
10        }
11        for(int i=1;i<grid.length;i++){
12            for(int j=1;j<grid[0].length;j++){
13                dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
14            }
15        }
16
17
18        return dp[grid.length-1][grid[0].length-1];
19        
20    }
21}