class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] ro1=new int[m];
        int[] co1=new int[n];
        int[] ro0=new int[m];
        int[] co0=new int[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    ro1[i]++;
                    co1[j]++;
                }
                else{
                    ro0[i]++;
                    co0[j]++;
                }
            }

        }
        int[][] ans=new int[m][n];


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=ro1[i]+co1[j]-ro0[i]-co0[j];
            }
        }




        return ans;
        
    }
}