class Solution {
    public int missingMultiple(int[] nums, int k) {
       int[] arr=new int[nums.length+1];
        for(int i:nums){
           if(i%k==0){
            if(i/k<=nums.length)
            arr[(i/k)-1]++;
           }
        }
        for(int i=0;i<nums.length;i++){
            if(arr[i]==0){
                return (i+1)*k;
            }
        }
       
       return (nums.length+1)*k;
        
    }
}