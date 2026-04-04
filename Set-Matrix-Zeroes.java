1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int[] r=new int[matrix.length];
4        int[] c=new int[matrix[0].length];
5        for(int i=0;i<matrix.length;i++){
6            for(int j=0;j<matrix[0].length;j++){
7                if(matrix[i][j]==0){
8                    r[i]=1;
9                    c[j]=1;
10                    
11                }
12            }
13            
14        }
15
16        for(int i=0;i<matrix.length;i++){
17            for(int j=0;j<matrix[0].length;j++){
18                if(r[i]==1||c[j]==1){
19                    matrix[i][j]=0;
20                    
21
22                }
23            }
24        }
25        
26    }
27}
28