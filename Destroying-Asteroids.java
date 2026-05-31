1class Solution {
2    public boolean asteroidsDestroyed(int mass, int[] arr) {
3        Arrays.sort(arr);
4        long s=mass;
5        for(int i:arr){
6            if(i>s){
7                return false;
8            }
9            s=s+i;
10
11
12        }
13        return true;
14    }
15}