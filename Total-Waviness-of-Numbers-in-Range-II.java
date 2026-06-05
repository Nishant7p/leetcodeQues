1class Solution {
2    long[][][][][] dp;
3    long[][][][][] cnt;
4    boolean[][][][][] vis;
5    char[] arr;
6
7    public long totalWaviness(long num1, long num2) {
8        return count(num2) - count(num1 - 1);
9    }
10
11    public long count(long num1) {
12        if (num1 <= 0) {
13            return 0;
14        }
15
16        String s = String.valueOf(num1);
17        arr = s.toCharArray();
18
19        int n = arr.length;
20
21        dp = new long[n + 1][11][11][2][2];
22        cnt = new long[n + 1][11][11][2][2];
23        vis = new boolean[n + 1][11][11][2][2];
24
25        return f(0, 10, 10, 1, 0)[1];
26    }
27
28    public long[] f(int i, int x, int y, int tight, int started) {
29        if (i == arr.length) {
30            if (started == 1) {
31                return new long[]{1, 0};
32            }
33            return new long[]{0, 0};
34        }
35
36        if (vis[i][x][y][tight][started]) {
37            return new long[]{cnt[i][x][y][tight][started], dp[i][x][y][tight][started]};
38        }
39
40        int limit = 9;
41        if (tight == 1) {
42            limit = arr[i] - '0';
43        }
44
45        long ans = 0;
46        long total = 0;
47
48        for (int z = 0; z <= limit; z++) {
49            int new_tight = 0;
50            if (tight == 1 && z == limit) {
51                new_tight = 1;
52            }
53
54            if (started == 0 && z == 0) {
55                long[] res = f(i + 1, 10, 10, new_tight, 0);
56                total += res[0];
57                ans += res[1];
58            } else {
59                if (y == 10) {
60                    long[] res = f(i + 1, 10, z, new_tight, 1);
61                    total += res[0];
62                    ans += res[1];
63                } else {
64                    int add = 0;
65
66                    if (x != 10) {
67                        if ((y > x && y > z) || (y < x && y < z)) {
68                            add = 1;
69                        }
70                    }
71
72                    long[] res = f(i + 1, y, z, new_tight, 1);
73                    total += res[0];
74                    ans += res[1] + add * res[0];
75                }
76            }
77        }
78
79        vis[i][x][y][tight][started] = true;
80        cnt[i][x][y][tight][started] = total;
81        dp[i][x][y][tight][started] = ans;
82
83        return new long[]{total, ans};
84    }
85}