1class Solution {
2    public int furthestDistanceFromOrigin(String moves) {
3        int x=0;
4        int ct=0;
5        for(int i=0;i<moves.length();i++){
6            char c=moves.charAt(i);
7            if(c=='L'){
8                x--;
9            }
10            else if(c=='R'){
11                x++;
12            }
13            else{
14                ct++;
15            }
16
17        }
18        return Math.abs(x)+ct;
19        
20    }
21}