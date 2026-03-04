1class Solution {
2    public int numSpecial(int[][] mat) {
3        int[] r=new int[mat.length];
4         int[] c=new int[mat[0].length];
5        int ans=0;
6
7        for(int i=0;i<mat.length;i++){
8            for(int j=0;j<mat[0].length;j++){
9                if(mat[i][j]==1){
10                    c[j]++;
11                    r[i]++;
12                }
13            }
14
15        }
16        for(int i=0;i<r.length;i++){
17           for(int j=0;j<c.length;j++){
18            if(mat[i][j]==1&&r[i]==1&&c[j]==1){
19                ans++;
20
21            }
22           }
23
24           }
25        
26
27
28
29
30
31
32        return ans;
33        
34    }
35}