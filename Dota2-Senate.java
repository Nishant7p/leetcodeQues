1class Solution {
2    public String predictPartyVictory(String s) {
3        Queue<Integer> R=new LinkedList<>();
4        Queue<Integer> D=new LinkedList<>();
5
6        for(int i=0;i<s.length();i++){
7            if(s.charAt(i)=='R'){
8                R.add(i);
9
10            }else{
11                D.add(i);
12            }
13        }
14
15        while(!R.isEmpty()&&!D.isEmpty()){
16            int r_p=R.peek();
17            int d_p=D.peek();
18
19            if(r_p<d_p){
20                D.poll();
21                R.poll();
22                R.add(r_p+s.length());
23                
24            }
25            else{
26                D.poll();
27                R.poll();
28                D.add(d_p+s.length());
29
30            }
31
32        }
33        if(D.isEmpty()){
34            return "Radiant";
35        }
36        return "Dire";
37
38        
39        
40    }
41}