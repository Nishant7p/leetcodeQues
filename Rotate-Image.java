1class Solution {
2    public void rotate(int[][] matrix) {
3        int n=matrix.length;
4        for(int i=0;i<n;i++){
5            for(int j=i+1;j<n;j++){
6                int t=matrix[i][j];
7                matrix[i][j]=matrix[j][i];
8                matrix[j][i]=t;
9
10            }
11        }
12        for(int i=0;i<n;i++){
13            for(int j=0;j<n/2;j++){
14                int t=matrix[i][j];
15                matrix[i][j]=matrix[i][n-j-1];
16                matrix[i][n-1-j]=t;
17
18
19            }
20        }
21
22
23
24       
25
26        
27    }
28}
29