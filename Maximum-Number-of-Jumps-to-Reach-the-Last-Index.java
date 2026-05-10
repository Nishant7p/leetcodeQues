1class Solution {
2    public int maximumJumps(int[] nums, int target) {
3
4        int[] dp = new int[nums.length];
5
6        Arrays.fill(dp, -1);
7
8        dp[0] = 0;
9
10        for (int i = 0; i < nums.length; i++) {
11
12            if (i > 0 && dp[i] <= 0) {
13                continue;
14            }
15
16            for (int j = i + 1; j < nums.length; j++) {
17
18                if (Math.abs(nums[i] - nums[j]) <= Math.abs(target)) {
19
20                    dp[j] = Math.max(dp[j], dp[i] + 1);
21                }
22            }
23        }
24
25        return dp[nums.length - 1];
26    }
27}