1class Solution {
2    public String rev(char[] arr){
3        int l=0;
4        int r=arr.length-1;
5        while(l<r){
6            char t=arr[l];
7            arr[l]=arr[r];
8            arr[r]=t;
9            l++;
10            r--;
11
12        }
13        return new String(arr);
14    }
15    
16    public String processStr(String s) {
17        char[] arr=s.toCharArray();
18
19        int n=s.length();
20        StringBuilder sb=new StringBuilder();
21        for(int i=0;i<n;i++){
22            char c=arr[i];
23            if(c>='a'&&c<='z'){
24                sb.append(c);
25                continue;
26
27            }
28            if(c=='*'){
29                if(sb.length()==0){
30                    continue;
31                }
32                sb.deleteCharAt(sb.length()-1);
33                continue;
34            }
35            if(c=='#'){
36                sb.append(sb);
37                continue;
38            }
39            if(c=='%'){
40                String x=sb.toString();
41                char[] arr2=x.toCharArray();
42                String y=rev(arr2);
43                //System.out.println(y);
44                sb=new StringBuilder(y);
45            }
46
47        }
48        
49
50
51
52
53
54
55
56
57        return sb.toString();
58       
59
60        
61    }
62}