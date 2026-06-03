1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m=matrix.length;
4        int n=matrix[0].length;
5        int[] row=new int[m];
6        int[] col=new int[n];
7        for(int i=0;i<m;i++){
8            for(int j=0;j<n;j++){
9                if(matrix[i][j]==0){
10                    row[i]=1;
11                    col[j]=1;
12                }
13            }
14        }
15        for(int i=0;i<m;i++){
16            if(row[i]==1){
17                for(int j=0;j<n;j++){
18                    matrix[i][j]=0;
19                }
20            }
21        }
22         for(int i=0;i<n;i++){
23            if(col[i]==1){
24                for(int j=0;j<m;j++){
25                    matrix[j][i]=0;
26                }
27            }
28        }
29        
30
31        
32
33    }
34}
35