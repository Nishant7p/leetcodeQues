1class Solution {
2
3    public boolean findRotation(int[][] mat, int[][] target) {
4        int n=mat.length;
5        int ch=1;
6        for(int i=0;i<n;i++){
7            for(int j=0;j<n;j++){
8                if(mat[i][j]!=target[i][j]){
9                    ch=0;
10
11                }
12
13            }
14        }
15        if(ch==1){
16            return true;
17        }
18        ch=1;
19int temp=0;
20        for(int i=0;i<n;i++){
21            for(int j=i;j<n;j++){
22                 temp=mat[i][j];
23                mat[i][j]=mat[j][i];
24                mat[j][i]=temp;
25
26                }
27
28            }
29        for(int i=0;i<n;i++){
30            for(int j=0;j<n/2;j++){
31                temp=mat[i][j];
32                mat[i][j]=mat[i][n-j-1];
33                mat[i][n-j-1]=temp;
34
35
36            }
37        }
38
39        
40        for(int i=0;i<n;i++){
41            for(int j=0;j<n;j++){
42                if(mat[i][j]!=target[i][j]){
43                    ch=0;
44
45                }
46
47            }
48        }
49        if(ch==1){
50            return true;
51        }
52        ch=1;
53        for(int i=0;i<n;i++){
54            for(int j=i;j<n;j++){
55                 temp=mat[i][j];
56                mat[i][j]=mat[j][i];
57                mat[j][i]=temp;
58
59                }
60
61            }
62        for(int i=0;i<n;i++){
63            for(int j=0;j<n/2;j++){
64                temp=mat[i][j];
65                mat[i][j]=mat[i][n-j-1];
66                mat[i][n-j-1]=temp;
67
68
69            }
70        }
71
72        
73        for(int i=0;i<n;i++){
74            for(int j=0;j<n;j++){
75                if(mat[i][j]!=target[i][j]){
76                    ch=0;
77
78                }
79
80            }
81        }
82        if(ch==1){
83            return true;
84        }
85        ch=1;
86        for(int i=0;i<n;i++){
87            for(int j=i;j<n;j++){
88                 temp=mat[i][j];
89                mat[i][j]=mat[j][i];
90                mat[j][i]=temp;
91
92                }
93
94            }
95        for(int i=0;i<n;i++){
96            for(int j=0;j<n/2;j++){
97                temp=mat[i][j];
98                mat[i][j]=mat[i][n-j-1];
99                mat[i][n-j-1]=temp;
100
101
102            }
103        }
104
105        
106        for(int i=0;i<n;i++){
107            for(int j=0;j<n;j++){
108                if(mat[i][j]!=target[i][j]){
109                    ch=0;
110
111                }
112
113            }
114        }
115        if(ch==1){
116            return true;
117        }
118
119        return false;
120    }
121}