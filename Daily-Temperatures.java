1class Solution {
2    public int[] dailyTemperatures(int[] arr) {
3        int n = arr.length;
4        int[] ans = new int[n];
5        
6        Stack<int[]> s = new Stack<>();
7        
8        for (int i = n - 1; i >= 0; i--) {
9            
10            while (!s.isEmpty() && s.peek()[0] <= arr[i]) {
11                s.pop();
12            }
13            
14            if (s.isEmpty()) {
15                ans[i] = 0;
16            } else {
17                ans[i] = s.peek()[1] - i;
18            }
19            
20            s.push(new int[]{arr[i], i});
21        }
22        
23        return ans;
24    }
25}