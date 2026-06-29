1class Solution {
2    
3    public int numOfStrings(String[] patterns, String word) {
4        
5        HashSet<String> set=new HashSet();
6       
7        int n=word.length();
8
9        for(int i=0;i<n;i++){
10            StringBuilder sb=new StringBuilder();
11            for(int j=i;j<n;j++){
12                sb.append(word.charAt(j));
13                set.add(sb.toString());
14            }
15        }
16        System.out.println(set);
17        int ans=0;
18
19        for( String s:patterns){
20            if(set.contains(s)){
21                ans++;
22            }
23
24        }
25       
26
27
28
29
30        return ans;
31    }
32}