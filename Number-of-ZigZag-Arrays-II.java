1class Solution {
2
3    int mod = 1000000007;
4
5    public int zigZagArrays(int n, int l, int r) {
6
7        int k = r - l + 1;
8
9        long[] dp = new long[k];
10
11        for (int i = 0; i < k; i++) {
12            dp[i] = i;
13        }
14
15        long[][] n_dp = new long[k][k];
16
17        for (int i = 1; i < k; i++) {
18
19            for (int j = k - i; j < k; j++) {
20
21                n_dp[i][j] = 1;
22            }
23        }
24
25        long[][] power_dp = matpow(n_dp, (long) n - 2, k);
26
27        long ans = 0;
28
29        for (int i = 0; i < k; i++) {
30
31            for (int j = 0; j < k; j++) {
32
33                ans = (ans + power_dp[i][j] * dp[j]) % mod;
34            }
35        }
36
37        return (int) (2 * ans % mod);
38    }
39
40    long[][] matmul(long[][] dp, long[][] n_dp, int k) {
41
42        long[][] power_dp = new long[k][k];
43
44        for (int i = 0; i < k; i++) {
45
46            for (int j = 0; j < k; j++) {
47
48                if (dp[i][j] == 0) {
49                    continue;
50                }
51
52                for (int x = 0; x < k; x++) {
53
54                    if (n_dp[j][x] == 0) {
55                        continue;
56                    }
57
58                    power_dp[i][x] =
59                            (power_dp[i][x]
60                            + dp[i][j] * n_dp[j][x]) % mod;
61                }
62            }
63        }
64
65        return power_dp;
66    }
67
68    long[][] matpow(long[][] dp, long n, int k) {
69
70        long[][] ans = new long[k][k];
71
72        for (int i = 0; i < k; i++) {
73            ans[i][i] = 1;
74        }
75
76        while (n > 0) {
77
78            if ((n & 1) == 1) {
79
80                ans = matmul(ans, dp, k);
81            }
82
83            dp = matmul(dp, dp, k);
84
85            n >>= 1;
86        }
87
88        return ans;
89    }
90}