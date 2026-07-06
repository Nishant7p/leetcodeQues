class Solution {
    public int removeCoveredIntervals(int[][] arr) {
        int n=arr.length;
        int ans=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(arr[j][0]<=arr[i][0]&&arr[i][1]<=arr[j][1]){
                        ans++;
                        break;
                    }
                }
            }
        }







        return n-ans;
        
    }
}