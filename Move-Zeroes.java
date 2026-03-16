1class Solution {
2    public void moveZeroes(int[] nums) {
3        if(nums.length==1){
4            if(nums[0]>0){
5                return;
6            }
7        }
8        int l=0;
9        int r=0;
10        while(r<nums.length){
11            
12            while(r<nums.length&&nums[r]==0){
13                r++;
14            }
15            
16            if(r<nums.length){
17            int t=nums[l];
18            nums[l]=nums[r];
19            nums[r]=t;
20            l++;
21            r++;
22            }
23
24        }
25        
26    }
27}