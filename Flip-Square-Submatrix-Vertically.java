1class Solution {
2    
3    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
4        
5        for(int row = 0; row < k / 2; row++) {
6            for(int col = 0; col < k; col++) {
7                
8                int temp = grid[x + row][y + col];
9                
10                grid[x + row][y + col] = grid[x + k - 1 - row][y + col];
11                
12                grid[x + k - 1 - row][y + col] = temp;
13            }
14        }
15        
16        return grid;
17    }
18}