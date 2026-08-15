class Solution {
    public int elevatorRequests(int n, int[] arr) {
        int ans=0;
        ans=ans+arr[0];
        for(int i=1;i<arr.length;i++){
            ans=ans+Math.abs(arr[i]-arr[i-1]);

        }
        return ans;


        
    }
}