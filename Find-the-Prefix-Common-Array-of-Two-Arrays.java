1class Solution {
2    public int[] findThePrefixCommonArray(int[] A, int[] B) {
3        int n = A.length;
4        int[] c = new int[n];
5        int[] freq = new int[n + 1];
6
7        int x = 0;
8
9        for(int i = 0; i < n; i++){
10            freq[A[i]]++;
11
12            if(freq[A[i]] == 2){
13                x++;
14            }
15
16            freq[B[i]]++;
17
18            if(freq[B[i]] == 2){
19                x++;
20            }
21
22            c[i] = x;
23        }
24
25        return c;
26    }
27}