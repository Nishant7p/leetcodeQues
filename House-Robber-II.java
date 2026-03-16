1class Solution {
2    public int rob(int[] nums) {
3        int n=nums.length;
4        if(n == 1) return nums[0];
5        if(n == 2) return Math.max(nums[0], nums[1]);
6        
7        int[] dp=new int[nums.length];
8        int[] dp2=new int[nums.length];
9        dp[0]=nums[0];
10        dp[1]=Math.max(dp[0],nums[1]);
11        for(int i=2;i<nums.length-1;i++){
12            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
13
14
15
16        }
17        dp2[1]=nums[1];
18        dp2[2]=Math.max(dp2[1],nums[2]);
19
20        for(int i=3;i<nums.length;i++){
21            dp2[i]=Math.max(dp2[i-1],dp2[i-2]+nums[i]);
22
23
24
25        }
26       return Math.max(dp[nums.length-2],dp2[nums.length-1]);
27
28
29
30
31        
32    }
33}