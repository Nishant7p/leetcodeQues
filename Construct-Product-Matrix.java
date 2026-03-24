1class Solution {
2    public int[][] constructProductMatrix(int[][] grid) {
3
4        int n = grid.length;
5        int m = grid[0].length;
6
7        int[][] left = new int[n][m];
8        int[][] ans = new int[n][m];
9
10        long temp = 1;
11
12        for (int i = 0; i < n; i++) {
13            for (int j = 0; j < m; j++) {
14                left[i][j] = (int) temp;
15                temp = (temp * grid[i][j]) % 12345;
16            }
17        }
18
19        temp = 1;
20
21        for (int i = n - 1; i >= 0; i--) {
22            for (int j = m - 1; j >= 0; j--) {
23                ans[i][j] = (int) temp;
24                temp = (temp * grid[i][j]) % 12345;
25            }
26        }
27
28        for (int i = 0; i < n; i++) {
29            for (int j = 0; j < m; j++) {
30                ans[i][j] = (int)((1L * ans[i][j] * left[i][j]) % 12345);
31            }
32        }
33
34        return ans;
35    }
36}