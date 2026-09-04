class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int ans=-1;
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                
            }
            arr1[i]=max;
            //System.out.println(arr1[i]);
            
        }
        int min=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            if(nums[i]<min){
                min=nums[i];
                
            }
            arr2[i]=min;
            System.out.println(arr1[i]);
            
        }
        
        for(int i=0;i<n;i++){
            if(arr1[i]-arr2[i]<=k){
                return i;
            }
            
        }
        
        




        return ans;
        
    }
}