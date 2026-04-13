1class Solution {
2    public boolean check(int n,List<String> x,int row,int col){
3       for (int i = 0; i < row; i++) {
4    if (x.get(i).charAt(col) == 'Q') return false;
5}
6
7for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
8    if (x.get(i).charAt(j) == 'Q') return false;
9}
10
11for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
12    if (x.get(i).charAt(j) == 'Q') return false;
13}
14
15return true;
16
17    }
18
19    public void helper(List<List<String>> ans,int n, List<String> x,int row){
20        if(row==n){
21            ans.add(new ArrayList<>(x));
22            return ;
23        }
24
25
26
27
28    for(int i=0;i<n;i++){
29        if(check(n,x,row,i)){
30            char[] arr=x.get(row).toCharArray();
31            arr[i]='Q';
32            x.set(row,new String(arr));
33            helper(ans,n,x,row+1);
34            arr[i]='.';
35            x.set(row,new String(arr));
36
37            
38
39        }
40    }
41
42
43
44
45
46
47
48    }
49    public List<List<String>> solveNQueens(int n) {
50        List<List<String>> ans=new ArrayList<>();
51        List<String> x=new ArrayList<>();
52        for(int i=0;i<n;i++){
53            StringBuilder sb=new StringBuilder();
54            for(int j=0;j<n;j++){
55                sb.append('.');
56
57            }
58            x.add(sb.toString());
59        }
60        
61        helper(ans,n,x,0);
62        return ans;
63        
64    }
65}