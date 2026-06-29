1class Solution {
2    
3    public int numOfStrings(String[] patterns, String word) {
4        
5       
6        int ans=0;
7
8        for( String s:patterns){
9            if(word.contains(s)){
10                ans++;
11            }
12
13        }
14       
15
16
17
18
19        return ans;
20    }
21}