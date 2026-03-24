1class Solution {
2 
3    public int helper(String s1, String s2,int i1,int i2, int[][] dp){
4        if(i1<0||i2<0){
5            return 0;
6        }
7        if(dp[i1][i2]!=-1){
8            return dp[i1][i2];
9        }
10        if(s1.charAt(i1)==s2.charAt(i2)){
11            i1=i1-1;
12            i2=i2-1;
13            return dp[i1+1][i2+1]= 1+helper(s1,s2,i1,i2,dp);
14        }
15        else{
16            return dp[i1][i2]=Math.max(helper(s1,s2,i1-1,i2,dp),helper(s1,s2,i1,i2-1,dp));
17        }
18    }
19    public int longestCommonSubsequence(String s1, String s2) {
20        int m=s1.length();
21        int n=s2.length();
22        int[][] dp=new int[m+1][n+1];
23        for(int i=0;i<m;i++){
24            for(int j=0;j<n;j++){
25                dp[i][j]=-1;
26            }
27        }
28
29        return helper(s1,s2,m-1,n-1,dp);
30
31        
32    }
33
34    public int longestPalindromeSubseq(String s) {
35        StringBuilder sb=new StringBuilder();
36        for(int i=s.length()-1;i>=0;i--){
37            sb.append(s.charAt(i));
38        }
39        return longestCommonSubsequence(s,sb.toString());
40
41        
42    }
43}