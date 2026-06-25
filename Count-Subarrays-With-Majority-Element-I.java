1class Solution {
2    public int countMajoritySubarrays(int[] nums, int target) {
3        int n=nums.length;
4        int ans=0;
5        for(int i=0;i<n;i++){
6            int c=0;
7            for(int j=i;j<n;j++){
8                if(target==nums[j]){
9                    c++;
10                }
11                else{
12                    c--;
13                }
14                if(c>0){
15                    ans++;
16                }
17
18            }
19            
20        }
21        return ans;
22        
23    }
24}