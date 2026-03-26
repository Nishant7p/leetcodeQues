1class Solution {
2    public int longestSubarray(int[] nums) {
3        int l = 0;
4        int r = 0;
5        int max = 0;
6        int c = 0;
7
8        while (r < nums.length) {
9            
10           
11            while (r < nums.length && nums[r] == 1) {
12                r++;
13            }
14
15            int left_count = r - l;
16
17            
18            if (r < nums.length) {
19                r++;
20            }
21
22            int new_start = r;
23
24            
25            while (r < nums.length && nums[r] == 1) {
26                r++;
27            }
28
29            int right_count = r - new_start;
30
31            max = Math.max(max, left_count + right_count);
32
33            l = new_start;
34        }
35
36        
37        if (max == nums.length) {
38            return nums.length - 1;
39        }
40
41        return max;
42    }
43}