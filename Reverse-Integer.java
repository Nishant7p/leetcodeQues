1class Solution {
2    public int reverse(int x) {
3        int s=0;
4        if(x<0){
5            s=1;
6        }
7        x=Math.abs(x);
8        long res=0;
9        int temp=0;
10        while(x>0){
11            res=res*10;
12            temp=x%10;
13            x=x/10;
14            res=res+temp;
15            
16
17        }
18        if(res>2147483647){
19            return 0;
20
21        }
22         if(s==1){
23            return -1*(int)res;
24         }
25        return (int) res;
26        
27        
28    }
29}
30