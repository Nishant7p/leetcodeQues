1class Solution {
2    public int helper(String s1,String s2,int i,int j,int[][] dp){
3        if (i < 0) return j + 1;
4        if (j < 0) return i + 1;
5        if(s1.charAt(i)==s2.charAt(j)){
6            return helper(s1,s2,i-1,j-1,dp);
7        }
8        if(dp[i][j]!=-1){
9            return dp[i][j];
10
11        }
12        int del=1+helper(s1,s2,i-1,j,dp);
13        int rep=1+helper(s1,s2,i-1,j-1,dp);
14        int ins = 1 + helper(s1, s2, i, j - 1,dp);
15        return dp[i][j]=Math.min(del, Math.min(rep, ins));
16    }
17
18    public int minDistance(String word1, String word2) {
19        int n=word1.length();
20        int m=word2.length();
21        int[][] dp=new int[n][m];
22        for(int i=0;i<n;i++){
23            for(int j=0;j<m;j++){
24                dp[i][j]=-1;
25            }
26        }
27        
28        return helper(word1,word2,word1.length()-1,word2.length()-1,dp);
29        
30    }
31}
32