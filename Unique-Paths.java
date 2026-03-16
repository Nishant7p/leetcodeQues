1class Solution {
2    public int paths(int row,int col,int m,int n,int[][] dp){
3        if(row>=m||col>=n){
4            return 0;
5        }
6        if(row==m-1&&col==n-1){
7            return 1;
8        }
9        if(dp[row][col]!=-1){
10            return dp[row][col];
11        }
12        return dp[row][col]=paths(row+1,col,m,n,dp)+paths(row,col+1,m,n,dp);
13
14    }
15    public int uniquePaths(int m, int n) {
16        int[][] dp=new int[m][n];
17       for(int i=0;i<m;i++){
18            Arrays.fill(dp[i], -1);
19        }
20        int ans=paths(0,0,m,n,dp);
21
22        return ans;
23        
24    }
25}