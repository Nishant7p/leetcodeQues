1class Solution {
2    public int largestAltitude(int[] gain) {
3        int[] att=new int[gain.length+1];
4        int max=0;
5        int count=0;
6        for(int i=0;i<gain.length;i++){
7
8            count=count+gain[i];
9            if(max<count){
10                max=count;
11            }
12           
13        }
14        return max;
15      }
16}