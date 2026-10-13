class Solution {
    public long maxAlternatingSum(int[] nums) {
        
        long sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]=nums[i]*-1;
            }
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i<nums.length/2){
                sum=sum-nums[i]*nums[i];
            }
            else{
                sum=sum+nums[i]*nums[i];
            }
        }



        return sum;
        
        
    }
}