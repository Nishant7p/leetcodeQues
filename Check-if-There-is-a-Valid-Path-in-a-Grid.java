1class Solution {
2    public boolean dfs(int r, int c,int[][] arr, int[][] vis){
3        int[][][] dir={
4            {},
5            {{0,-1},{0,1}},
6            {{-1,0},{1,0}},
7            {{0,-1},{1,0}},
8            {{0,1},{1,0}},
9            {{0,-1},{-1,0}},
10            {{0,1},{-1,0}}
11        };
12
13        vis[r][c]=1;
14
15        if(r==arr.length-1 && c==arr[0].length-1){
16            return true;
17        }
18
19        for(int[] d:dir[arr[r][c]]){
20            int i=d[0]+r;
21            int j=d[1]+c;
22
23            if(i>=0&&j>=0&&i<arr.length&&j<arr[0].length&&vis[i][j]==0){
24                for(int[] back:dir[arr[i][j]]){
25                    if(i+back[0]==r && j+back[1]==c){
26                        if(dfs(i,j,arr,vis)) return true;
27                    }
28                }
29            }
30        }
31        return false;
32    }
33
34    public boolean hasValidPath(int[][] grid) {
35        int m=grid.length;
36        int n=grid[0].length;
37        int[][] vis=new int[m][n];
38        return dfs(0,0,grid,vis);
39    }
40}