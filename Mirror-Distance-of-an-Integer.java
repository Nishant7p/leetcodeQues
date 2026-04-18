1class Solution {
2    public int mirrorDistance(int n) {
3        int num=0;
4        int temp=n;
5        int off=1;
6        
7        while(temp>0){
8            num=num+temp%10;
9           
10            temp=temp/10;
11
12            if(temp!=0){
13                num=num*10;
14            }
15            
16            
17            
18            
19        }
20        
21        return Math.abs(n-num);
22        
23    }
24}