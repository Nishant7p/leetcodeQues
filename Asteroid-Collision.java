1class Solution {
2    public int[] asteroidCollision(int[] arr) {
3        Stack<Integer> st = new Stack();
4        int l = 0;
5        int n = arr.length;
6
7        st.push(arr[0]);
8        l++;
9
10        while (l < n) {
11
12            int t2 = arr[l];
13            boolean used = false;
14
15            while (!st.isEmpty()) {
16                int t1 = st.peek();
17
18                if (!(t1 > 0 && t2 < 0)) {
19                    st.push(t2);
20                    used = true;
21                    break;
22                }
23                else {
24                    if (Math.abs(t1) == Math.abs(t2)) {
25                        st.pop();
26                        used = true;
27                        break;
28                    }
29                    else {
30                        if (Math.abs(t1) > Math.abs(t2)) {
31                            used = true;
32                            break;
33                        }
34                        else {
35                            st.pop();
36                            if (st.isEmpty()) {
37                                st.push(t2);
38                                used = true;
39                                break;
40                            }
41                            continue;
42                        }
43                    }
44                }
45            }
46
47            if (!used && st.isEmpty()) {
48                st.push(t2);
49            }
50
51            l++;
52        }
53
54        int[] ans = new int[st.size()];
55        int i = st.size() - 1;
56
57        while (!st.isEmpty()) {
58            ans[i--] = st.pop();
59        }
60
61        return ans;
62    }
63}