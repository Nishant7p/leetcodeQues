1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int l=0;
4        int r=0;
5        int max_c=0;
6       
7        while(r<nums.length){
8
9            if(nums[r]==0){
10                l=r+1;
11            }
12            
13            max_c=Math.max(r-l+1,max_c);
14            r++;
15
16
17
18        }
19        return max_c;
20        
21    }
22}