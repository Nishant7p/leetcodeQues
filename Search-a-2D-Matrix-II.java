1class Solution {
2    public boolean BS(int s,int e,int tar,int[] arr){
3        if(s>e){
4            return false;
5        }
6        int mid=s+(e-s)/2;
7
8        if(tar==arr[mid]){
9            return true;
10        }
11        if(tar<arr[mid]){
12            return BS(s,mid-1,tar,arr);
13        }
14        else{
15            return BS(mid+1,e,tar,arr);
16        }
17
18
19    }
20    public boolean searchMatrix(int[][] matrix, int target) {
21        int m=matrix.length;
22        int n=matrix[0].length;
23
24        for(int i=0;i<m;i++){
25            int s=matrix[i][0];
26            int e=matrix[i][n-1];
27            if(target>=s&&target<=e){
28                if(BS(0,n-1,target,matrix[i])){
29                    return true;
30                }
31            }
32
33
34
35
36
37        }
38        return false;
39
40
41
42        
43    }
44}