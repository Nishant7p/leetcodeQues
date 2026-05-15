1class Solution {
2    public int findMin(int[] arr) {
3        int start=0;
4        int end=arr.length-1;
5        int mid=-1;
6
7        int max=0;
8        if(arr[0]<arr[end]){
9            return arr[0];
10        }
11        if(end==0){
12            return arr[0];
13        }
14
15        while(start<end){
16            mid=start+(end-start)/2;
17
18            if(mid+1<arr.length&&arr[mid]>arr[mid+1]){
19                max=mid;
20                break;
21            }
22
23            if(mid-1>=0&&arr[mid-1]>arr[mid]){
24                max=mid-1;
25                break;
26            }
27
28            if(arr[start]>arr[mid]){
29               
30                 end=mid;
31            }
32            else{
33                 start=mid+1;
34               
35            }
36
37        }
38        return arr[max+1];
39
40
41        
42    }
43}