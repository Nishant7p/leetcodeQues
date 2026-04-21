1class Solution {
2    public String convert(String s, int numRows) {
3        if(numRows==1){
4            return s;
5        }
6                int max_even = (numRows - 1) * 2;
7        int n = s.length();
8        int sep = 0;
9        StringBuilder str = new StringBuilder();
10        int i = 0;
11        int curr = 0;
12        int check = 0;
13        //str.append(s.charAt(0));
14        while (i < numRows) {
15            check = 0;
16            curr=i;
17
18
19            while (curr < n) {
20
21                if (check == 1) {
22                    sep = 2 * i;
23                    check = 0;
24                } else {
25                    sep = max_even - 2 * i;
26                    check = 1;
27                }
28
29                if(sep==0){
30                    sep=max_even;
31                }
32                str.append(s.charAt(curr));
33                curr = curr + sep;
34            }
35            i++;
36
37
38        }
39        return str.toString();
40    }
41        
42        
43    }
44