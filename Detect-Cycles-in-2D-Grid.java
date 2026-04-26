1class Solution {
2    public boolean dfs(int[][] vis,char[][] grid, int[][] dir,int r,int c,int[][] c_vis,int p_r,int p_c){
3        vis[r][c]=1;
4        c_vis[r][c]=1;
5
6        for(int[] d:dir){
7            int n_r=d[0]+r;
8            int n_c=d[1]+c;
9            if(n_r>=0&&n_c>=0&&n_r<grid.length&&n_c<grid[0].length){
10
11
12                if(n_r == p_r && n_c == p_c){
13
14                    continue;
15
16                }
17                if(grid[r][c] == grid[n_r][n_c] && vis[n_r][n_c] == 0){
18
19                    if(dfs(vis, grid, dir, n_r, n_c, c_vis, r, c)){
20
21                        return true;
22
23                    }
24
25                }
26                else if(grid[r][c]==grid[n_r][n_c]&&vis[n_r][n_c]==1&&c_vis[n_r][n_c]==1){
27                    return true;
28                }
29
30            }
31           
32        }
33         c_vis[r][c]=0;
34            return false;
35
36
37
38
39    }
40    public boolean containsCycle(char[][] grid) {
41        int m=grid.length;
42        int n=grid[0].length;
43        int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
44        int[][] vis=new int[m][n];
45        int[][] c_vis=new int[m][n];
46
47        for(int i=0;i<m;i++){
48            for(int j=0;j<n;j++){
49                if(vis[i][j]==0){
50                    boolean x=dfs(vis,grid,dir,i,j,c_vis,-1,-1);
51                    if(x){
52                        return true;
53                    }
54                }
55            }
56        }
57
58        return false;
59
60        
61    }
62}