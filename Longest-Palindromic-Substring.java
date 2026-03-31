1class Solution {
2    public String longestPalindrome(String s) {
3        int n = s.length();
4        int[][] dp = new int[n][n];
5
6        int max = 1;
7        int k = 0;
8        int l = 0;
9
10        for(int i = n - 1; i >= 0; i--){
11            for(int j = i; j < n; j++){
12
13                if(i == j){
14                    dp[i][j] = 1;
15                }
16                else if(j - i == 1){
17                    if(s.charAt(i) == s.charAt(j)){
18                        dp[i][j] = 2;
19                    }
20                }
21                else{
22                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] > 0){
23                        dp[i][j] = dp[i+1][j-1] + 2;
24                    }
25                }
26
27                if(dp[i][j] > max){
28                    max = dp[i][j];
29                    k = i;
30                    l = j;
31                }
32            }
33        }
34
35        return s.substring(k, l + 1);
36    }
37}