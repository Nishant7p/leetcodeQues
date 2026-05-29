1class Solution {
2    public int BS_c(int[] s_arr, int s,int e,int tar){
3        if(s>e){
4            return -1;
5        }
6        int mid=s+(e-s)/2;
7
8        if(tar==s_arr[mid]){
9            return mid;
10        }
11        if(tar<s_arr[mid]){
12          
13            return BS_c(s_arr,s,mid-1,tar);
14        }
15        else{
16           
17            return BS_c(s_arr,mid+1,e,tar);
18        }
19
20    }
21     public int BS_l(int[] s_arr, int s,int e,float tar){
22        if(s>e){
23            return s;
24        }
25        int mid=s+(e-s)/2;
26
27        if(tar==s_arr[mid]){
28            return mid;
29        }
30        if(tar<s_arr[mid]){
31          
32            return BS_l(s_arr,s,mid-1,tar);
33        }
34        else{
35           
36            return BS_l(s_arr,mid+1,e,tar);
37        }
38
39    }
40     public int BS_r(int[] s_arr, int s,int e,float tar){
41        if(s>e){
42            return e;
43        }
44        int mid=s+(e-s)/2;
45
46        if(tar==s_arr[mid]){
47            return mid;
48        }
49        if(tar<s_arr[mid]){
50          
51            return BS_r(s_arr,s,mid-1,tar);
52        }
53        else{
54           
55            return BS_r(s_arr,mid+1,e,tar);
56        }
57
58    }
59    public int[] searchRange(int[] arr, int target) { 
60
61        int[] ans={-1,-1};
62        int n=arr.length;
63        float l_t=target-0.5f;
64        float r_t=target+0.5f;
65        if(BS_c(arr,0,n-1,target)==-1){
66            return ans;
67        }
68
69        int l=BS_l(arr,0,n-1,l_t);
70        int r=BS_r(arr,0,n-1,r_t);
71
72
73        ans[0]=l;
74        ans[1]=r;
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90        return ans;
91        
92    }
93      
94}