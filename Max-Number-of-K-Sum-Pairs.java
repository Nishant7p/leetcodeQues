1class Solution {
2    
3    public int maxOperations(int[] nums, int k) {
4        Arrays.sort(nums);
5        int ans=0;
6        int l=0;
7       
8        int n=nums.length;
9         int r=n-1;
10        while(l<r){
11            int sum=nums[l]+nums[r];
12            if(sum==k){
13                ans++;
14                l++;
15                r--;
16            }
17            else if(sum<k){
18                l++;
19            }
20            else{
21                r--;
22
23            }
24        }
25        return ans;
26        
27    }
28}