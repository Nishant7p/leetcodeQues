1class Solution {
2    public int minElement(int[] nums) {
3        int n=nums.length;
4        int min=Integer.MAX_VALUE;
5        for(int i=0;i<n;i++){
6            int t=nums[i];
7            int x=0;
8            while(t>0){
9                x=x+t%10;
10                t=t/10;
11            }
12            min=Math.min(x,min);
13
14        }
15        return min;
16
17        
18    }
19}