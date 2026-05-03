1class Solution {
2    public boolean prime(int n){
3        if(n==1){
4            return false;
5        }
6        for(int i=2;i<n;i++){
7            if(n%i==0){
8                return false;
9            }
10        }
11        return true;
12    }
13    public int sumOfPrimesInRange(int n) {
14        int r=0;
15        int temp=n;
16        while(temp>0){
17            int d=temp%10;
18            r=r*10+d;
19            temp=temp/10;
20        }
21        int max=Math.max(r,n);
22        int min=Math.min(r,n);
23
24        int sum=0;
25        for(int i=min;i<=max;i++){
26            if(prime(i)){
27                sum=sum+i;
28            }
29        }
30
31
32
33
34        return sum;
35        
36    }
37}