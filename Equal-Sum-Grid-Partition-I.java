1class Solution {
2    public boolean canPartitionGrid(int[][] grid) {
3        long total=0;
4        int n=grid.length;
5        int m=grid[0].length;
6        int[] row=new int[n];
7        int[] col=new int[m];
8        for(int i=0;i<n;i++){
9            for(int j=0;j<m;j++){
10                total=grid[i][j]+total;
11                row[i]=grid[i][j]+row[i];
12                col[j]=grid[i][j]+col[j];
13            }
14        }
15        System.out.println(total);
16        long pre=0;
17        for(int i=0;i<n;i++){
18            pre=pre+row[i];
19            if(total-pre==pre){
20                return true;
21            }
22        }
23        pre=0;
24        for(int i=0;i<m;i++){
25            pre=pre+col[i];
26            if(total-pre==pre){
27                return true;
28            }
29        }
30    
31        return false;
32        
33    }
34}