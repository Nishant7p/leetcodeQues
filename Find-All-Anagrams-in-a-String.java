1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        HashMap<Character,Integer> map=new HashMap<>();
4        List<Integer> ans=new ArrayList<>();
5        int k=p.length();
6        for(int i=0;i<k;i++){
7            if(map.containsKey(p.charAt(i))){
8                 map.put(p.charAt(i), map.get(p.charAt(i)) + 1);
9            }
10            else{
11                map.put(p.charAt(i), 1);
12            }
13        }
14        //System.out.println(map);
15        int l=0;
16        int r=0;
17        if(s.length()<k){
18            return ans;
19        }
20
21
22        HashMap<Character,Integer> map2=new HashMap<>();
23        int m=1;
24        for(int i=0;i<k;i++){
25            map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
26        }
27       
28        if(map.equals(map2)){
29
30        ans.add(0);
31        }
32        r=k;
33
34        
35
36        while(r<s.length()){
37            char left=s.charAt(l);
38            map2.put(left,map2.get(left)-1);
39            if(map2.get(left)==0){
40                map2.remove(left);
41            }
42            l++;
43
44            map2.put(s.charAt(r),map2.getOrDefault(s.charAt(r),0)+1);
45            if(map.equals(map2)){
46                ans.add(l);
47            }
48
49           
50                
51r++;
52
53            }
54        
55
56
57
58
59
60
61
62
63
64        return ans;
65        
66    }
67}