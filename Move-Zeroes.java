1class Solution {
2    public void moveZeroes(int[] nums) {
3        if(nums.length==1){
4            return;
5        }
6        int l=0;
7        int r=0;
8        int n=nums.length;
9        while(r<n){
10          
11                while(r<n&&nums[r]==0){
12                    r++;
13                }
14                if(r<n){
15                    int t=nums[l];
16                    nums[l]=nums[r];
17                    nums[r]=t;
18                    l++;
19                    r++;
20                    
21                }
22            
23            //l++;
24        }
25       
26       
27        
28    }
29}