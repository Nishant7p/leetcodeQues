1class Solution {
2   
3 
4    public int helper(String s1, String s2,int i1,int i2, int[][] dp){
5        if(i1<0||i2<0){
6            return 0;
7        }
8        if(dp[i1][i2]!=-1){
9            return dp[i1][i2];
10        }
11        if(s1.charAt(i1)==s2.charAt(i2)){
12            i1=i1-1;
13            i2=i2-1;
14            return dp[i1+1][i2+1]= 1+helper(s1,s2,i1,i2,dp);
15        }
16        else{
17            return dp[i1][i2]=Math.max(helper(s1,s2,i1-1,i2,dp),helper(s1,s2,i1,i2-1,dp));
18        }
19    }
20    public int longestCommonSubsequence(String s1, String s2) {
21        int m=s1.length();
22        int n=s2.length();
23        int[][] dp=new int[m+1][n+1];
24        for(int i=0;i<m;i++){
25            for(int j=0;j<n;j++){
26                dp[i][j]=-1;
27            }
28        }
29
30        return helper(s1,s2,m-1,n-1,dp);
31
32        
33    }
34
35    public int longestPalindromeSubseq(String s) {
36        StringBuilder sb=new StringBuilder();
37        for(int i=s.length()-1;i>=0;i--){
38            sb.append(s.charAt(i));
39        }
40        return longestCommonSubsequence(s,sb.toString());
41
42        
43    }
44
45    public int minInsertions(String s) {
46        return s.length()-longestPalindromeSubseq(s);
47        
48    }
49}