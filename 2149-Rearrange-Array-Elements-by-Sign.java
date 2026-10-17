class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];

        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int j=0;
        int k=0;

        for(int i:nums){
            if(i<0){
                neg[k]=i;
                k++;
            }
            else{
                pos[j]=i;
                j++;
            }
        }
        j=0;
        k=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans[i]=pos[j];
                j++;
            }
            else{
                ans[i]=neg[k];
                k++;
            }

        }










        return ans;
        
    }
}