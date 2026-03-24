1class Solution {
2    public int helper(String s1, String s2,int i1,int i2, int[][] dp){
3        if(i1<0||i2<0){
4            return 0;
5        }
6        if(dp[i1][i2]!=-1){
7            return dp[i1][i2];
8        }
9        if(s1.charAt(i1)==s2.charAt(i2)){
10            i1=i1-1;
11            i2=i2-1;
12            return dp[i1+1][i2+1]= 1+helper(s1,s2,i1,i2,dp);
13        }
14        else{
15            return dp[i1][i2]=Math.max(helper(s1,s2,i1-1,i2,dp),helper(s1,s2,i1,i2-1,dp));
16        }
17    }
18    public int longestCommonSubsequence(String s1, String s2) {
19        int m=s1.length();
20        int n=s2.length();
21        int[][] dp=new int[m+1][n+1];
22        for(int i=0;i<m;i++){
23            for(int j=0;j<n;j++){
24                dp[i][j]=-1;
25            }
26        }
27
28        return helper(s1,s2,m-1,n-1,dp);
29
30        
31    }
32}