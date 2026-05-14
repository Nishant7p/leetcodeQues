1class Solution {
2    public boolean isGood(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        int x=nums[n-1];
6        if(n-1!=x){
7            return false;
8        }
9        if(n-2>=0&&nums[n-2]!=x){
10            return false;
11        }
12        for(int i=0;i<n-1;i++){
13            if(nums[i]!=i+1){
14                return false;
15            }
16        }
17        return true;
18        
19    }
20}