class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int ans1=0;
        int ans2=0;
        int n=nums.length;
        if(n==1){
            return 1;
        }


        int i=0;
        while(i+1<n){
            int c=1;


            while(i+1<n&&nums[i]<nums[i+1]){
                c++;
                i++;


            }
            i++;
            ans1=Math.max(ans1,c);


        }
       i=0;
       while(i+1<n){
            int c=1;


            while(i+1<n&&nums[i]>nums[i+1]){
                c++;
                i++;


            }
            i++;
            ans2=Math.max(ans2,c);


        }










        return Math.max(ans1,ans2);
        
    }
}