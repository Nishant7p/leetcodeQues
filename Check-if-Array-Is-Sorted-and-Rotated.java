1class Solution {
2    public boolean check(int[] nums) {
3        int c = 0;
4
5        for(int i = 0; i < nums.length; i++){
6            if(nums[i] > nums[(i + 1) % nums.length]){
7                c++;
8            }
9        }
10
11        return c <= 1;
12    }
13}