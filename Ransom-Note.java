1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3
4        HashMap<Character,Integer> map=new HashMap<>();
5        for (int i=0;i<magazine.length();i++) {
6            if(map.containsKey(magazine.charAt(i))){
7                map.put(magazine.charAt(i), map.get(magazine.charAt(i))+1);
8            }
9            else{
10                map.put(magazine.charAt(i), 1);
11                
12            }
13
14        }
15        for (int i=0;i<ransomNote.length();i++){
16            if(map.containsKey(ransomNote.charAt(i))){
17                map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))-1);
18                if(map.get(ransomNote.charAt(i))<0){
19                    return false;
20                    
21                }
22            }
23            else {
24                return false;
25            }
26        }
27        return true;
28        
29
30
31    }
32}