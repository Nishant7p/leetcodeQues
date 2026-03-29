1class Solution {
2    public boolean canBeEqual(String s1, String s2) {
3        HashMap<Character,Integer> map1=new HashMap<>();
4        HashMap<Character,Integer> map2=new HashMap<>();
5
6
7        for(int i=0;i<4;i++){
8            if(map1.containsKey(s1.charAt(i))){
9                map1.put(s1.charAt(i),map1.get(s1.charAt(i)+1));
10                
11            }
12            else if(!map1.containsKey(s1.charAt(i))){
13                map1.put(s1.charAt(i),1);
14
15            }
16
17
18
19            if(map2.containsKey(s2.charAt(i))){
20                map2.put(s2.charAt(i),map2.get(s2.charAt(i)+1));
21                continue;
22            }
23            else if(!map2.containsKey(s2.charAt(i))){
24                map2.put(s2.charAt(i),1);
25
26            }
27        }
28        if(!map1.equals(map2)){
29            System.out.println(map2);
30            return false;
31            
32        }
33        
34int c=0;
35        for(int i=0;i<2;i++){
36           
37            if(s1.charAt(i)!=s2.charAt(i)){
38                 c=1;
39                if((s1.charAt(i+2)!=s2.charAt(i))||s1.charAt(i)!=s2.charAt(i+2)){
40                    return false;
41                }
42            }
43        }
44        if(c==0){
45            for(int i=3;i<4;i++){
46                if(s1.charAt(i)!=s2.charAt(i)){
47                    return false;
48                }
49            }
50        }
51        return true;
52        
53
54
55        
56    }
57}