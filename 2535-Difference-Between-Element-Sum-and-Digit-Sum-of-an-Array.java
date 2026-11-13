class Solution {
    public int differenceOfSum(int[] nums) {
        int ans=0;

        int n=nums.length;
        int sum=0;
        int d_sum=0;


        for(int i:nums){
            sum+=i;
            int t=i;
            int c_sum=0;

            while(t>0){
                int d=t%10;
                c_sum+=d;
                t=t/10;

            }

            d_sum+=c_sum;
        }







        ans=Math.abs(d_sum-sum);
        return ans;
        
    }
}