class Solution {
    public int maxProduct(int n) {
        int[] arr=new int[2];
        if(n==0){
            return 0;
        }
        int ans=0;
        int t=n;
        while(t>0){
            int d=t%10;
            t=t/10;


            if(d>arr[0]){
                int x=arr[0];
                arr[0]=d;
                arr[1]=x;
            }
            else if(d>arr[1]){
                arr[1]=d;
            }






        }








        ans=arr[0]*arr[1];
        return ans;
        
    }
}