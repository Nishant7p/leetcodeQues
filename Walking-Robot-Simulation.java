1class Solution {
2    public int robotSim(int[] commands, int[][] obstacles) {
3        HashSet<String> obs = new HashSet<>();
4        for (int[] arr : obstacles) {
5            obs.add(arr[0] + "," + arr[1]);
6        }
7
8        char ch = 'N';
9        int max = 0;
10        int x = 0, y = 0;
11
12        for (int i = 0; i < commands.length; i++) {
13            int curr = commands[i];
14
15            if (curr == -1) {
16                if (ch == 'N') ch = 'E';
17                else if (ch == 'E') ch = 'S';
18                else if (ch == 'S') ch = 'W';
19                else ch = 'N';
20
21            } else if (curr == -2) {
22                if (ch == 'N') ch = 'W';
23                else if (ch == 'W') ch = 'S';
24                else if (ch == 'S') ch = 'E';
25                else ch = 'N';
26
27            } else {
28
29                if (ch == 'N') {
30                    for (int j = 0; j < curr; j++) {
31                        if (obs.contains(x + "," + (y + 1))) break;
32                        y++;
33                    }
34                } else if (ch == 'S') {
35                    for (int j = 0; j < curr; j++) {
36                        if (obs.contains(x + "," + (y - 1))) break;
37                        y--;
38                    }
39                } else if (ch == 'W') {
40                    for (int j = 0; j < curr; j++) {
41                        if (obs.contains((x - 1) + "," + y)) break;
42                        x--;
43                    }
44                } else if (ch == 'E') {
45                    for (int j = 0; j < curr; j++) {
46                        if (obs.contains((x + 1) + "," + y)) break;
47                        x++;
48                    }
49                }
50
51                max = Math.max(max, x * x + y * y);
52            }
53        }
54
55        return max;
56    }
57}