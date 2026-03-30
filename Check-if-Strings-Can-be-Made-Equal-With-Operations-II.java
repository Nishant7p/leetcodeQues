1class Solution {
2    public boolean checkStrings(String s1, String s2) {
3        int n=s1.length();
4        HashMap<Character,ArrayList<Integer>> map1=new HashMap();
5        HashMap<Character,ArrayList<Integer>> map2=new HashMap();
6
7        for(int i=0;i<n;i++){
8            char c1=s1.charAt(i);
9            char c2=s2.charAt(i);
10
11            if(!map1.containsKey(c1)){
12                map1.put(c1,new ArrayList<>());
13                map1.get(c1).add(i);
14            }
15            else if(map1.containsKey(c1)){
16                map1.get(c1).add(i);
17
18            }
19            if(!map2.containsKey(c2)){
20                map2.put(c2,new ArrayList<>());
21                map2.get(c2).add(i);
22            }
23            else if(map2.containsKey(c2)){
24                map2.get(c2).add(i);
25
26            }
27        }
28
29        for(char c:map1.keySet()){
30            if(!map2.containsKey(c)){
31                return false;
32            }
33            ArrayList<Integer> a1=map1.get(c);
34            ArrayList<Integer> a2=map2.get(c);
35            if(a1.size()!=a2.size()){
36                return false;
37            }
38            int o=0;
39            int e=0;
40            for(int i=0;i<a1.size();i++){
41                if(a1.get(i)%2==0){
42                    e++;
43                }
44                if(a1.get(i)%2==1){
45                    o++;
46                }
47
48                if(a2.get(i)%2==0){
49                    e--;
50                }
51                if(a2.get(i)%2==1){
52                    o--;
53                }
54               
55
56            }
57            if(o!=0||e!=0){
58                return false;
59            }
60
61        }
62return true;
63        
64    }
65}