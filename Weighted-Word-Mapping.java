1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        StringBuilder sb=new StringBuilder();
4        for (String word : words){
5            int c=0;
6            for(int i=0;i<word.length();i++){
7                char v=word.charAt(i);
8                c=c+weights[v-'a'];
9                
10            }
11            c=c%26;
12            char n_c=(char)('z'-c);
13            sb.append(n_c);
14            
15        }
16        return sb.toString();
17        
18    }
19}