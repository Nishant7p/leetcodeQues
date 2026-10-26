class Solution {
    public long dfs(int[][] grid ,int r,int c){
        if(r<0||r>=grid.length||c<0||c>=grid[0].length||grid[r][c]<=0){
            return 0;
        }
        long sum=grid[r][c];
        grid[r][c]=0;

       
        
        long up=dfs(grid,r-1,c);
        long  down=dfs(grid,r+1,c);
        long left=dfs(grid,r,c-1);
        long  right=dfs(grid,r,c+1);
        sum=sum+left+right+up+down;

        return sum;


    }
    public int countIslands(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]>0){
                    long s=dfs(grid,i,j);
                    if(s%k==0){
                        ans++;
                    }
                }
            }
        }
        return ans;
        
        
    }
}