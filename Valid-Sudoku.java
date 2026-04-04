1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3
4       
5
6        for(int i=0;i<9;i++){
7             int[] arr=new int[9];
8            for(int j=0;j<9;j++){
9                if(board[i][j]=='.'){
10                    continue;
11                }
12                int x=board[i][j]-'1';
13                if(arr[x]!=0){
14                    return false;
15                }
16                arr[x]++;
17
18            }
19        }
20        for(int j=0;j<9;j++){
21             int[] arr1=new int[9];
22            for(int i=0;i<9;i++){
23                if(board[i][j]=='.'){
24                    continue;
25                }
26                int x=board[i][j]-'1';
27                if(arr1[x]!=0){
28                    return false;
29                }
30                arr1[x]++;
31
32            }
33        }
34        for(int l=0;l<3;l++){
35
36        
37       
38        for(int k=0;k<3;k++){
39            int[] arr1=new int[9];
40
41
42        
43
44        for(int i=0;i<3;i++){
45            
46            for(int j=0;j<3;j++){
47                if(board[l*3+i][k*3+j]=='.'){
48                    continue;
49                }
50                int x=board[l*3+i][k*3+j]-'1';
51                if(arr1[x]!=0){
52                    return false;
53                }
54                arr1[x]++;
55
56
57            }
58           
59        }
60        }
61        }
62
63
64
65        return true;
66    }
67}
68