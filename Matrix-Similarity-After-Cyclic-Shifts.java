1class Solution {
2    public boolean areSimilar(int[][] mat, int k) {
3        int n=mat.length;
4        int m=mat[0].length;
5
6        int[][] ans=new int[n][m];
7         k=k%m;
8
9        for(int i=0;i<n;i++){
10             
11
12            if(i%2==0){
13                for(int j=0;j<m;j++){
14                    if(j>=k){
15                        ans[i][j-k]=mat[i][j];
16                    }
17                    else{
18                        ans[i][m-k+j]=mat[i][j];
19                    }
20                   
21                   
22
23
24
25                }
26
27            }
28            else{
29
30                for(int j=0;j<m;j++){
31                    if(j+k<m){
32                        ans[i][j+k]=mat[i][j];
33                    }
34                    else{
35                        ans[i][j+k-m]=mat[i][j];
36                    }
37                    
38                }
39
40            }
41        }
42
43
44
45
46
47
48
49
50
51
52        for(int i=0;i<n;i++){
53            for(int j=0;j<m;j++){
54                System.out.println(ans[i][j]);
55                if(ans[i][j]!=mat[i][j]){
56                    return false;
57                    
58                }
59            }
60        }
61        return true;
62        
63    }
64}