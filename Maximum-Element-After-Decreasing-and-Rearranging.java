1class Solution {
2    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
3        int n=arr.length;
4        Arrays.sort(arr);
5        if(arr[0]!=1){
6            arr[0]=1;
7        }
8        if(arr[0]==1){
9            int prev=arr[0];
10            int i=0;
11            while(i<n){
12                while(i+1<n&&(arr[i+1]-arr[i])<=1){
13                i++;
14            }
15             if(i+1<n){
16                
17                arr[i+1]=arr[i]+1;
18                System.out.println(arr[i+1]);
19             }
20             else{
21                break;
22             }
23            
24
25            }
26             
27            
28           
29        }
30        int max=0;
31        
32
33
34
35
36
37        return arr[n-1];
38        
39    }
40}