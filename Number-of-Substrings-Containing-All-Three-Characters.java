1class Solution {
2      public int numberOfSubstrings(String s) {
3        int count=0;
4        int size=s.length();
5        HashMap<Character,Integer> map=new HashMap<>();
6        int l=0;
7        int r=0;
8        while (r<size){
9            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
10            while (map.size()==3){
11                count=count+size-r;
12
13                map.put(s.charAt(l),map.get(s.charAt(l))-1);
14                if(map.get(s.charAt(l))==0){
15                    map.remove(s.charAt(l));
16                }
17                l++;
18
19
20            }
21            r++;
22
23
24
25
26        }
27        
28
29
30return count;
31    }
32}