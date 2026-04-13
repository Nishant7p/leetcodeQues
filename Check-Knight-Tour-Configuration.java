1class Solution {
2    public boolean helper(int[][] grid,int m,int r,int c){
3        if(m==grid.length*grid.length-1){
4            return true;
5        }
6        if(m!=grid[r][c]){
7            return false;
8        }
9        if(r+2<grid.length&&c+1<grid.length){
10            if(grid[r+2][c+1]==m+1){
11            return helper(grid,m+1,r+2,c+1);}
12        }
13        if(r+2<grid.length&&c-1>=0){
14             if(grid[r+2][c-1]==m+1){
15            return helper(grid,m+1,r+2,c-1);}
16        }
17        if(r-2>=0&&c+1<grid.length){
18            if(grid[r-2][c+1]==m+1){
19            return helper(grid,m+1,r-2,c+1);}
20        }
21        if(r-2>=0&&c-1>=0){
22             if(grid[r-2][c-1]==m+1){
23            return helper(grid,m+1,r-2,c-1);}
24        }
25        if(r+1<grid.length&&c+2<grid.length){
26            if(grid[r+1][c+2]==m+1){
27            return helper(grid,m+1,r+1,c+2);}
28        }
29        if(r+1<grid.length&&c-2>=0){
30             if(grid[r+1][c-2]==m+1){
31            return helper(grid,m+1,r+1,c-2);}
32        }
33        if(r-1>=0&&c+2<grid.length){
34            if(grid[r-1][c+2]==m+1){
35            return helper(grid,m+1,r-1,c+2);}
36        }
37        if(r-1>=0&&c-2>=0){
38             if(grid[r-1][c-2]==m+1){
39            return helper(grid,m+1,r-1,c-2);}
40        }
41        return false;
42
43
44    }
45    public boolean checkValidGrid(int[][] grid) {
46
47        return helper(grid,0,0,0);
48        
49    }
50}