1class Solution {
2     public int[] twoSum(int[] nums, int target) {
3        int[] ans=new int[2];
4        HashMap<Integer,Integer> map=new HashMap<>();
5        for(int i=0;i<nums.length;i++){
6            if(map.containsKey(target-nums[i])){
7                ans[0]=map.get(target-nums[i]);
8                ans[1]=i;
9
10            }
11            map.put(nums[i],i);
12        }
13        return ans;
14       
15    }
16}