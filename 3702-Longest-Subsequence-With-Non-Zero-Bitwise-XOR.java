class Solution {
    public int longestSubsequence(int[] nums) {
        int total=0;
        int ch=0;
        for(int x:nums){
            if(x>0){
                ch=1;
            }
            total=total^x;
        }
        if(ch==0){
            return 0;
        }
        if(total==0){
            return nums.length-1;
        }
        return nums.length;
        
    }
}