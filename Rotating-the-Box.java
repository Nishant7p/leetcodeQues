1class Solution {
2    public char[][] rotateTheBox(char[][] box) {
3        int m=box.length;
4        int n=box[0].length;
5
6        char[][] ans=new char[n][m];
7
8        for(int i=0;i<m;i++){
9            for(int j=0;j<n;j++){
10                ans[j][m-i-1]=box[i][j];
11            }
12        }
13        for(int j=0;j<m;j++){
14            int f=n-1;
15            int i=n-1;
16            int si=-1;
17            while(i>=0){
18                char c=ans[i][j];
19                if(c=='*'){
20                    f=i-1;
21                    i--;
22                    
23                    continue;
24                }
25                if(c=='.'){
26                    i--;
27                    continue;
28
29                }
30                if(c=='#'&&si!=i){
31                    ans[i][j]='.';
32                    ans[f][j]='#';
33                    f--;
34                    i--;
35
36
37                }
38
39            }
40        }
41
42        return ans;
43
44        
45    }
46}