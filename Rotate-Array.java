1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n = nums.length;
4        k = k % n;
5        Reverse(nums, 0, n - 1);
6        Reverse(nums, 0, k - 1);
7        Reverse(nums, k, n - 1);
8    }
9    void Reverse(int[] nums, int s, int e) {
10        while (e > s) {
11            int temp = nums[s];
12            nums[s] = nums[e];
13            nums[e] = temp;
14            s++;
15            e--;
16        }
17    }
18}