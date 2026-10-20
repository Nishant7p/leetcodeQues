class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        List<Boolean> ans=new ArrayList();
        for(int i=0;i<l.length;i++){
            int left=l[i];
            int right=r[i];
             int[] arr=new int[right-left+1];
            for(int j=left;j<=right;j++){
                arr[j-left]=nums[j];

               
                
            }
            Arrays.sort(arr);
            int d=arr[1]-arr[0];
            int c=0;
            for(int j=1;j<arr.length;j++){
                if(d!=arr[j]-arr[j-1]){
                    c=1;
                    break;


                }
                

            }
            if(c==1){
                ans.add(false);
            }else{
                ans.add(true);
            }

        }





        return ans;
    }
}