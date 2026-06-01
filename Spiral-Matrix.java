1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        int m=matrix.length;
4        int n=matrix[0].length;
5
6        int s_r=0;
7        int s_c=0;
8        int e_r=m-1;
9        int e_c=n-1;
10        List<Integer> ans=new ArrayList<>();
11
12
13        while(s_r<=e_r&&s_c<=e_c){
14
15            for(int i=s_c;i<=e_c;i++){
16                ans.add(matrix[s_r][i]);
17            }
18            s_r++;
19            if(s_r<=e_r&&s_c<=e_c){
20
21            for(int i=s_r;i<=e_r;i++){
22                ans.add(matrix[i][e_c]);
23            }
24            e_c--;}
25
26            if(s_r<=e_r&&s_c<=e_c){
27            for(int i=e_c;i>=s_c;i--){
28                ans.add(matrix[e_r][i]);
29            }
30            e_r--;}
31
32            if(s_r<=e_r&&s_c<=e_c){
33            for(int i=e_r;i>=s_r;i--){
34                ans.add(matrix[i][s_c]);
35            }
36            s_c++;}
37
38
39
40        }
41
42
43
44
45        return ans;
46
47
48
49
50    }
51       
52}