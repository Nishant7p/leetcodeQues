1class Solution {
2    public int getMinDistance(int[] nums, int target, int start) {
3        int min=Integer.MAX_VALUE;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]==target){
6
7                min=Math.min(min,Math.abs(i-start));
8            }
9        }
10        return min;
11        
12    }
13}