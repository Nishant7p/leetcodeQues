class Solution {
    public int countDominantElements(int[] nums) {
        int n=nums.length;
        if(n==1){
            return 1;
        }
        
        int ans=0;
        if(nums[0]>=nums[1]){
            ans++;
        }

        for(int i=1;i<n-1;i++){
            int f=nums[i-1];
            int l=nums[i+1];
            int cur=nums[i];
            if((f+l)<=2*cur){
                ans++;
            }
        }
        if(nums[n-2]<=nums[n-1]){
            ans++;
        }
        return ans;
        
    }
}