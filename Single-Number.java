1class Solution {
2    public int singleNumber(int[] nums) {
3        int ans=0;
4        for(int i:nums){
5            ans=ans^i;
6        }
7
8
9
10        return ans;
11       
12    }
13}