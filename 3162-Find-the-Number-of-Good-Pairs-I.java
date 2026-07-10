class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int c=0;
        int n=nums1.length;
        int m=nums2.length;

        for(int i=0;i<n;i++){
            int x=nums1[i];
            for(int j=0;j<m;j++){
                int y=nums2[j];
                int p=y*k;
                if(x%p==0){
                    c++;
                }
            }
        }






        return c;
        
    }
}