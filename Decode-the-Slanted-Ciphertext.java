1class Solution {
2    public String decodeCiphertext(String s, int rows) {
3        int n=s.length();
4        int cols=(n-1+rows)/rows;
5        StringBuilder sb=new StringBuilder();
6        char[][] mat=new char[rows][cols];
7
8        int cn=0;
9        for(int i=0;i<rows;i++){
10            for(int j=0;j<cols;j++){
11                mat[i][j]=s.charAt(j+i*cols);
12                if(mat[i][j]!=' '){
13                    cn++;
14
15                }
16               // System.out.println(mat[i][j]);
17            }
18        }
19        int r=-1;
20        int c=-1;
21        int og=0;
22        while(0!=cn){
23            if(r+1<rows&&c+1<cols){
24                r=r+1;
25                c=c+1;
26                sb.append(mat[r][c]);
27                if(mat[r][c]!=' '){
28                    cn--;
29                }
30
31            }
32            else if(r+1==rows){
33                og++;
34                c=og-1;
35                r=-1;
36
37            }
38
39
40
41
42
43
44        }
45
46
47
48
49
50
51        return sb.toString();
52
53        
54    }
55}