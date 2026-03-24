1class Solution {
2    public int lcs(String s1, String s2,int i,int j,int[][] dp){
3        if(i<0||j<0){
4            return 0;
5        }
6        if(dp[i][j]!=-1){
7            return dp[i][j];
8        }
9        if(s1.charAt(i)==s2.charAt(j)){
10            return dp[i][j]=1+lcs(s1,s2,i-1,j-1,dp);
11        }
12        else{
13            return dp[i][j]=Math.max(lcs(s1,s2,i-1,j,dp),lcs(s1,s2,i,j-1,dp));
14        }
15    }
16
17
18
19    public int minDistance(String s1, String s2) {
20        int n=s1.length();
21        int m=s2.length();
22        int[][] dp=new int[n][m];
23        for(int i=0;i<n;i++){
24            for(int j=0;j<m;j++){
25                dp[i][j]=-1;
26            }
27        }
28       return n+m-2*lcs(s1,s2,n-1,m-1,dp);
29
30        
31    }
32}