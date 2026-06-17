1class Solution {
2
3    
4    public char processStr(String s,long k) {
5        char[] arr=s.toCharArray();
6       
7
8        int n=s.length();
9         long[] arr2=new long[n+1];
10        long new_l=0;
11       for(int i=0;i<n;i++){
12
13    char c=arr[i];
14
15    long len=arr2[i];
16
17    if(c>='a' && c<='z'){
18
19        arr2[i+1]=len+1;
20    }
21
22    else if(c=='*'){
23
24        arr2[i+1]=Math.max(0,len-1);
25    }
26
27    else if(c=='#'){
28
29        arr2[i+1]=2*len;
30    }
31
32    else{
33
34        arr2[i+1]=len;
35    }
36}
37
38new_l=arr2[n];
39
40       
41       
42        if(new_l<=k){
43           return '.';
44        }
45        for(int i=n-1;i>=0;i--){
46
47    char c=arr[i];
48
49    long before_l=arr2[i];
50
51    long after_l=arr2[i+1];
52
53    if(c>='a' && c<='z'){
54
55        if(k==after_l-1){
56
57            return c;
58        }
59    }
60
61    else if(c=='*'){
62
63        continue;
64    }
65
66    else if(c=='#'){
67
68        if(k>=before_l){
69
70            k-=before_l;
71        }
72    }
73
74    else if(c=='%'){
75
76        k=before_l-1-k;
77    }
78}
79        return '.';
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
90
91       
92    }
93
94        
95    
96}