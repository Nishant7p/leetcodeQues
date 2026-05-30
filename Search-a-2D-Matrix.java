1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m=matrix.length;
4        int n=matrix[0].length;
5        int s=0;
6        int e=m-1;
7        while(s<=e){
8            int mid=s+(e-s)/2;
9            if(matrix[mid][0]==target){
10                return true;
11            }
12            else if(matrix[mid][0]>target){
13                e=mid-1;
14            }
15            else{
16                s=mid+1;
17            }
18        }
19        //e==0;
20        int s2=0;
21        int e2=n-1;
22        if(e<0){
23            return false;
24        }
25        while(s2<=e2){
26            int mid=s2+(e2-s2)/2;
27            if(matrix[e][mid]==target){
28                return true;
29            }
30            else if(matrix[e][mid]>target){
31                e2=mid-1;
32            }
33            else{
34                s2=mid+1;
35            }
36        }
37        return false;
38
39
40
41       
42        
43    }
44}