1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        if(obstacleGrid[0][0]==1){
4            return 0;
5        }
6       
7        int n=obstacleGrid.length;
8        int m=obstacleGrid[0].length;
9        if(obstacleGrid[n-1][m-1]==1){
10            return 0;
11        }
12        int[][] dp=new int[n][m];
13        dp[0][0]=1;
14        for(int i=1;i<n;i++){
15            if( obstacleGrid[i][0]==1){
16
17                dp[i][0]=0;
18                continue;
19            }
20            dp[i][0]=dp[i-1][0];
21        }
22        for(int i=1;i<m;i++){
23            if( obstacleGrid[0][i]==1){
24
25                dp[0][i]=0;
26                continue;
27            }
28
29            dp[0][i]=dp[0][i-1];
30        }
31
32        for(int i=1;i<n;i++){
33            for(int j=1;j<m;j++){
34                if(obstacleGrid[i][j]!=1){
35                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
36                }
37                else{
38                    dp[i][j]=0;
39                }
40            }
41        }
42
43
44
45
46        return dp[n-1][m-1];
47        
48    }
49}