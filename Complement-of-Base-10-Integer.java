1class Solution {
2    public int bitwiseComplement(int n) {
3        int ans=0;
4        if(n==0){
5            return 1;
6        }
7        int temp=0;
8        while(n>0){
9            //System.out.println((int)Math.pow(2,temp));
10            if((n&1)==1){
11                ans=(int)Math.pow(2,temp)*0+ans;
12                 System.out.println((int)Math.pow(2,temp)*0);
13
14            }
15            else{
16            ans=(int)Math.pow(2,temp)*1+ans;
17            System.out.println((int)Math.pow(2,temp)*1);}
18
19
20
21            temp++;
22            
23            
24          
25            
26            n=n/2;
27
28        }
29        return ans;
30    }
31}