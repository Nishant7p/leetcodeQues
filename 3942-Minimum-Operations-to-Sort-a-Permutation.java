class Solution {
    public void rev(int[] nums){
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int t=nums[l];
            nums[l]=nums[r];
            nums[r]=t;
            l++;
            r--;
        }
    }
    public int sol(int[] nums){
        int n=nums.length;
        int p=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                p=i;
                break;
            }
            
        }
        for(int i=0;i<n;i++){
            if(nums[(p+i)%n]!=i){
                return (int)1e9;
                
            }
        }
        return p;
       
        
    }
     public int sol2(int[] nums){
        int n=nums.length;
        int p=0;
        for(int i=0;i<n;i++){
            if(nums[i]==n-1){
                p=i;
                break;
            }
            
        }
        for(int i=0;i<n;i++){
            if(nums[(p+i)%n]!=n-i-1){
                return (int)1e9;
                
            }
        }
        return p;
       
        
    }
    public int minOperations(int[] nums) {
        int[] arr1=nums.clone();
        int[] arr2=nums.clone();
        int[] arr3=nums.clone();
        int[] arr4=nums.clone();
        int n=sol(arr1);
        rev(arr2);
        int r=sol(arr2);


        if(r!=(int)1e9){
            r+=1;
            
        }
        int p=sol2(arr3);
        if(p!=(int)1e9){
            p+=1;
        }
        rev(arr4);
        int q=sol2(arr4);
        if(q!=(int)1e9){
            q+=2;
        }
        
        
        int ans=Math.min(Math.min(n,r),Math.min(p,q));
        if(ans==(int)1e9){
            return -1;
        }
        return ans;
        
        
    }
}