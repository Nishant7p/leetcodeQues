1class Solution {
2    public int maxScore(int[] cardPoints, int k) {
3        int size= cardPoints.length;
4        int maxs=0;
5        for(int i=0;i<k;i++){
6            maxs=maxs+cardPoints[i];
7        }
8        int l=k-1;
9        int r=size-1;
10        int sum=maxs;
11        while(l>=0){
12            sum=sum-cardPoints[l];
13            sum=sum+cardPoints[r];
14            r--;
15            l--;
16            if(sum>maxs){
17                maxs=sum;
18            }
19            
20        }
21        return  maxs;
22        
23
24    }
25}