class Solution {
    public int minMoves2(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        int mid=nums[nums.length/2];

        for(int i:nums){
            ans=ans+Math.abs(mid-i);
        }





        return ans;
        
    }
}