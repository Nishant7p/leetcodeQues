1class Solution {
2    public int maxRotateFunction(int[] nums) {
3        if(nums==null||nums.length==0){
4            return 0;
5        }
6        int n=nums.length;
7        int[] dp=new int[n];
8
9        int sum=0;
10        int F_0=0;
11        for(int i=0;i<n;i++){
12            sum=sum+nums[i];
13            F_0=F_0+i*nums[i];
14        }
15        int max=F_0;
16        dp[0]=F_0;
17        for(int i=1;i<n;i++){
18            dp[i]=dp[i-1]+sum-nums.length*nums[nums.length-i];
19            max=Math.max(max,dp[i]);
20        }
21
22
23        return max;
24       
25        
26    }
27}