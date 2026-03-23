1class Solution {
2    public int maxProductPath(int[][] grid) {
3        int n = grid.length;
4        int m = grid[0].length;
5
6        long[][] dp = new long[n][m];
7        long[][] dp2 = new long[n][m];
8
9        dp[0][0] = grid[0][0];
10        dp2[0][0] = grid[0][0];
11
12        for (int i = 1; i < n; i++) {
13            dp[i][0] = grid[i][0] * dp[i - 1][0];
14            dp2[i][0] = grid[i][0] * dp2[i - 1][0];
15        }
16
17        for (int i = 1; i < m; i++) {
18            dp[0][i] = grid[0][i] * dp[0][i - 1];
19            dp2[0][i] = grid[0][i] * dp2[0][i - 1];
20        }
21
22        for (int i = 1; i < n; i++) {
23            for (int j = 1; j < m; j++) {
24                long curr = grid[i][j];
25
26                long c1 = dp[i - 1][j] * curr;
27                long c2 = dp2[i - 1][j] * curr;
28                long c3 = dp[i][j - 1] * curr;
29                long c4 = dp2[i][j - 1] * curr;
30
31                dp[i][j] = Math.max(Math.max(c1, c2), Math.max(c3, c4));
32                dp2[i][j] = Math.min(Math.min(c1, c2), Math.min(c3, c4));
33            }
34        }
35
36        if (dp[n - 1][m - 1] < 0) {
37            return -1;
38        }
39
40        return (int)(dp[n - 1][m - 1] % 1000000007);
41    }
42}