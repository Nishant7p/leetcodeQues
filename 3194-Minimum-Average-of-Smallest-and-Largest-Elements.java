class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        double ans=Double.MAX_VALUE;
        Arrays.sort(nums);
        int l=0;
        int r=n-1;
        int c=0;
        while(c<n/2){
            double x=(nums[l]+nums[r])/2.0;
            ans=Math.min(ans,x);
            l++;
            r--;
            c++;
        }
        return ans;

        
    }
}