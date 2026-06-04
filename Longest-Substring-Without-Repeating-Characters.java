1class Solution {
2   public int lengthOfLongestSubstring(String s) {
3    int ans=0;
4    int l=0;
5    int r=0;
6    int n=s.length();
7    HashMap<Character,Integer> map=new HashMap();
8    while(r<n){
9        char c=s.charAt(r);
10        if(!map.containsKey(c)){
11            map.put(c,r);
12            //r++;
13        }
14        else{
15            if(map.get(c)+1>l){
16                l=map.get(c)+1;
17                map.remove(c);
18                map.put(c,r);
19
20
21            }
22            else{
23                map.put(c,r);
24
25            }
26            
27         
28            
29
30        }
31           ans=Math.max(ans,r-l+1);
32        r++;
33
34    }
35
36
37
38
39
40    return ans;
41        
42    }
43}