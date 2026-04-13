1class Solution {
2    public boolean helper(char[][] board,int r,int c){
3        if(r==9){
4            return isVS(board);
5        }
6
7        if(!isVS(board)){
8            return false;
9        }
10
11        if(board[r][c]=='.'){
12            for(int i=1;i<=9;i++){
13                char ch=(char)(i+'0');
14                board[r][c]=ch;
15
16                boolean result;
17                if(c!=8){
18                    result = helper(board,r,c+1);
19                } else {
20                    result = helper(board,r+1,0);
21                }
22
23                if(result) return true;
24
25                board[r][c]='.';
26            }
27            return false;
28        }
29        else{
30            if(c!=8){
31                return helper(board,r,c+1);
32            } else {
33                return helper(board,r+1,0);
34            }
35        }
36    }
37    public boolean isVS(char[][] board) {
38        for(int i=0;i<9;i++){
39             int[] arr=new int[9];
40            for(int j=0;j<9;j++){
41                if(board[i][j]=='.'){
42                    continue;
43                }
44                int x=board[i][j]-'1';
45                if(arr[x]!=0){
46                    return false;
47                }
48                arr[x]++;
49
50            }
51        }
52        for(int j=0;j<9;j++){
53             int[] arr1=new int[9];
54            for(int i=0;i<9;i++){
55                if(board[i][j]=='.'){
56                    continue;
57                }
58                int x=board[i][j]-'1';
59                if(arr1[x]!=0){
60                    return false;
61                }
62                arr1[x]++;
63
64            }
65        }
66        for(int l=0;l<3;l++){
67
68        
69       
70        for(int k=0;k<3;k++){
71            int[] arr1=new int[9];
72
73
74        
75
76        for(int i=0;i<3;i++){
77            
78            for(int j=0;j<3;j++){
79                if(board[l*3+i][k*3+j]=='.'){
80                    continue;
81                }
82                int x=board[l*3+i][k*3+j]-'1';
83                if(arr1[x]!=0){
84                    return false;
85                }
86                arr1[x]++;
87
88
89            }
90           
91        }
92        }
93        }
94
95
96
97        return true;
98    }
99    public void solveSudoku(char[][] board) {
100        helper(board,0,0);
101        
102    }
103}