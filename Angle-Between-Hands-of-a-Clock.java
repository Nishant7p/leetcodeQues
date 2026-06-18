1class Solution {
2    public double angleClock(int hour, int min) {
3        double angle=0;
4
5        angle=Math.abs((30*hour+min*0.5)-6*min);
6
7
8        return Math.min(angle,360-angle);
9        
10    }
11}