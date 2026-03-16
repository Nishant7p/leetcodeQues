1class Solution {
2    public String removeStars(String s) {
3        StringBuilder sb=new StringBuilder();
4        Stack<Character> st= new Stack();
5        for(int i=0;i<s.length();i++){
6            char c=s.charAt(i);
7            if(c!='*'){
8                st.add(c);
9            }
10            else{
11                st.pop();
12            }
13
14        }
15        while(!st.isEmpty()){
16            sb.append(st.pop());
17
18        }
19        sb=sb.reverse();
20        return sb.toString();
21
22        
23    }
24}