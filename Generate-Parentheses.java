1class Solution {
2    public int check(String w){
3        Stack<Character> st=new Stack();
4
5        int i=0;
6        while(i!=w.length()){
7            if(w.charAt(i)=='('){
8                st.push('(');
9            }
10            else{
11                if(st.size()==0){
12                    return 0;
13                
14                }
15                st.pop();
16            }
17            i++;
18        }
19        if(st.size()==0){
20            return 1;
21        }
22
23
24
25
26
27        return 0;
28    }
29    public void helper(int n,StringBuilder sb,int i,List<String> all){
30        if(i==2*n){
31            all.add(sb.toString());
32            return;
33        }
34        sb.append('(');
35        helper(n,sb,i+1,all);
36        sb.deleteCharAt(sb.length()-1);
37        sb.append(')');
38        helper(n,sb,i+1,all);
39        sb.deleteCharAt(sb.length()-1);
40        
41
42
43
44    }
45    public List<String> generateParenthesis(int n) {
46        List<String> all=new ArrayList<>();
47        StringBuilder sb=new StringBuilder();
48        helper(n,sb,0,all);
49
50
51       for(int i = 0; i < all.size(); i++){
52    if(check(all.get(i)) == 0){
53        all.remove(i);
54        i--; 
55    }
56}
57       
58
59
60
61
62
63
64
65
66
67        return all;
68        
69    }
70}
71