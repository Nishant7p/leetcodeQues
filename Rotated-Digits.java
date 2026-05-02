1class Solution {
2    public boolean rotate(int n){
3        boolean ch=false;
4        while(n>0){
5            int d=n%10;
6            n=n/10;
7            if(d==2||d==5||d==6||d==9){
8                ch=true;
9            }
10            if(d==7||d==4||d==3){
11                return false;
12            }
13
14        }
15        return ch;
16    }
17    public int rotatedDigits(int n) {
18        int ans=0;
19
20        for(int i=1;i<=n;i++){
21            if(rotate(i)){
22                ans++;
23            }
24        }
25
26
27
28
29        return ans;
30        
31        
32    }
33}