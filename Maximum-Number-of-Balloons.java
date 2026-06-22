1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        HashMap<Character,Integer> mp=new HashMap<>();
4        int n=text.length();
5        for(int i=0;i<n;i++){
6            char c=text.charAt(i);
7
8            mp.put(c,mp.getOrDefault(c,0)+1);
9            
10        }
11        int ans=0;
12        while(true){
13            if(mp.containsKey('b')&&mp.containsKey('a')&&mp.containsKey('l')&&mp.get('l')>=2&&mp.containsKey('o')&&mp.get('o')>=2&&mp.containsKey('n')){
14                ans++;
15                mp.put('b',mp.get('b')-1);
16                mp.put('a',mp.get('a')-1);
17                mp.put('l',mp.get('l')-2);
18                mp.put('o',mp.get('o')-2);
19                mp.put('n',mp.get('n')-1);
20                if(mp.get('a')==0){
21                    mp.remove('a');
22                }
23                if(mp.get('b')==0){
24                    mp.remove('b');
25                }
26                if(mp.get('l')==0){
27                    mp.remove('l');
28                }
29                if(mp.get('o')==0){
30                    mp.remove('o');
31                }
32                if(mp.get('n')==0){
33                    mp.remove('n');
34                }
35                
36
37                
38                
39
40            }
41            else{
42                break;
43            }
44
45        }
46        return ans;
47        
48    }
49}