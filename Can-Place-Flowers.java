1class Solution {
2    public boolean canPlaceFlowers(int[] arr, int n) {
3        if(arr.length==1){
4            if(arr[0]==0&&n==1){
5                return true;
6
7            }
8        }
9        int l=0;
10        if(arr.length>1&&arr[l]==0&&arr[l+1]==0){
11            n--;
12            
13            arr[l]=1;
14            l=l+1;
15        }
16        while(l<arr.length-2){
17
18
19            if(arr[l]==0&&arr[l+1]==0&&arr[l+2]==0){
20                arr[l+1]=1;
21                n--;
22                l=l+2;
23            }else{
24                l++;
25            }
26        }
27        if(arr.length>1&&arr[arr.length-1]==0&&arr[arr.length-2]==0){
28            arr[arr.length-1]=1;
29            n--;
30        }
31        if(n<=0){
32            return true;
33        }
34        return false;
35        
36    }
37}