1class Solution {
2    public boolean judgeCircle(String s) {
3        int x=0;
4        int y=0;
5        for(int i=0;i<s.length();i++){
6            char c=s.charAt(i);
7
8            if(c=='L'){
9                x++;
10            }
11            else if(c=='R'){
12                x--;
13            }
14            else if(c=='U'){
15                y++;
16            }
17            else{
18                y--;
19            }
20        }
21
22
23        if(x==0&&y==0){
24            return true;
25        }
26        return false;
27        
28    }
29}