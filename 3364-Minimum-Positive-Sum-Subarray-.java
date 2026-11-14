class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans=Integer.MAX_VALUE;
        int n=nums.size();

        for(int i=0;i<n;i++){
            int curr=0;

            for(int j=i;j<n;j++){
                curr+=nums.get(j);
                if(j-i+1>=l&&j-i+1<=r&&curr>0){
                    ans=Math.min(curr,ans);

                }

            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }








        return ans;

        
    }
}