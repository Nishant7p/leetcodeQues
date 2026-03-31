1class Solution {
2    public int evalRPN(String[] arr) {
3        Stack<Integer> st = new Stack();
4        int i = 0;
5
6        while (i < arr.length) {
7            String s = arr[i];
8
9            if (s.equals("*")) {
10                int b = st.pop();
11                int a = st.pop();
12                st.push(a * b);
13            }
14            else if (s.equals("+")) {
15                int b = st.pop();
16                int a = st.pop();
17                st.push(a + b);
18            }
19            else if (s.equals("-")) {
20                int b = st.pop();
21                int a = st.pop();
22                st.push(a - b);
23            }
24            else if (s.equals("/")) {
25                int b = st.pop();
26                int a = st.pop();
27                st.push(a / b);
28            }
29            else {
30                st.push(Integer.parseInt(s));
31            }
32
33            i++;
34        }
35
36        return st.pop();
37    }
38}