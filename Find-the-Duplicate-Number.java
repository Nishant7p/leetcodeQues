1class Solution {
2    public int findDuplicate(int[] nums) {
3        int n=nums.length;
4        int i=0;
5        while(i<n){
6            if(nums[i]==i+1){
7                i++;
8                
9            }
10            else{
11                if(nums[i]==nums[nums[i]-1]){
12                    return nums[i];
13                }
14                int t=nums[nums[i]-1];
15                nums[nums[i]-1]=nums[i];
16                nums[i]=t;
17            }
18           
19
20            
21
22
23        }
24        return nums[n-1];
25        
26
27        
28    }
29}