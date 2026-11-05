class Solution {
    public int maxCoins(int[] nums) {
        int n=nums.length;
        int ans=0;
        Arrays.sort(nums);
        int c=n/3;
        int i=n-2;
        int j=0;
        
        while(j<c){
        ans=ans+nums[i];
        i=i-2;
        j++;
        }


       // 1 2 3 4 5 6 7 8 9
       // 0 1 2 3 4 5 6 7 8



        return ans;
        
    }
}