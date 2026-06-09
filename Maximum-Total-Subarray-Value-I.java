1class Solution {
2    public long maxTotalValue(int[] nums, int k) {
3        int n=nums.length;
4        long ans=0;
5        long max=Integer.MIN_VALUE;
6        long min=Integer.MAX_VALUE;
7        for(int i:nums){
8            max=Math.max(max,i);
9            min=Math.min(min,i);
10        }
11        ans=(max-min)*k;
12
13
14
15
16
17
18        return ans;
19        
20    }
21}