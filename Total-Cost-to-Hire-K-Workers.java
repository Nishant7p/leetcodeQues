1class Solution {
2    public long totalCost(int[] arr, int k, int candidates) {
3        long ans = 0;
4        PriorityQueue<Integer> left = new PriorityQueue<>();
5        PriorityQueue<Integer> right = new PriorityQueue<>();
6
7        int n = arr.length;
8
9        // fix overlap while adding
10        int i = 0;
11        for (; i < candidates && i < n; i++) {
12            left.add(arr[i]);
13        }
14
15        int j = n - 1;
16        for (int count = 0; count < candidates && j >= i; count++) {
17            right.add(arr[j]);
18            j--;
19        }
20
21        int l = i;
22        int r = j;
23
24        while (k != 0) {
25
26            int l_v = left.isEmpty() ? Integer.MAX_VALUE : left.peek();
27            int r_v = right.isEmpty() ? Integer.MAX_VALUE : right.peek();
28
29            if (l_v <= r_v) {
30                ans = ans + l_v;
31                left.remove();
32
33                if (l <= r) {
34                    left.add(arr[l]);
35                    l++;
36                }
37            } else {
38                ans = ans + r_v;
39                right.remove();
40
41                if (r >= l) {
42                    right.add(arr[r]);
43                    r--;
44                }
45            }
46
47            k--;
48        }
49
50        return ans;
51    }
52}