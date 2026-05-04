1class Solution {
2    public void rotate(int[][] matrix) {
3        int temp=0;
4        for(int i=0;i<matrix.length;i++){
5            for(int j=i+1;j<matrix.length;j++){
6                temp=matrix[i][j];
7                matrix[i][j]=matrix[j][i];
8                matrix[j][i]=temp;
9
10            }
11        }
12        
13
14        for(int i=0;i<matrix.length;i++){
15            for(int j=0;j<matrix.length/2;j++){
16                temp=matrix[i][j];
17                matrix[i][j]=matrix[i][matrix.length-j-1];
18                matrix[i][matrix.length-j-1]=temp;
19
20            }
21        }
22
23        
24    }
25}
26