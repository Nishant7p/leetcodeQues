1import java.util.*;
2
3class Solution {
4    public int earliestFinishTime(int[] landS, int[] landD, int[] waterS, int[] waterD) {
5        int n = landS.length;
6        int m = waterS.length;
7
8        int[][] land = new int[n][2];
9        int[][] water = new int[m][2];
10
11        for(int i = 0; i < n; i++){
12            land[i][0] = landS[i];
13            land[i][1] = landD[i];
14        }
15
16        for(int i = 0; i < m; i++){
17            water[i][0] = waterS[i];
18            water[i][1] = waterD[i];
19        }
20
21        Arrays.sort(land, (a, b) -> a[0] - b[0]);
22        Arrays.sort(water, (a, b) -> a[0] - b[0]);
23
24        int[] landPrefixMinD = new int[n];
25        int[] landSuffixMinFinish = new int[n];
26
27        int[] waterPrefixMinD = new int[m];
28        int[] waterSuffixMinFinish = new int[m];
29
30        landPrefixMinD[0] = land[0][1];
31        for(int i = 1; i < n; i++){
32            landPrefixMinD[i] = Math.min(landPrefixMinD[i - 1], land[i][1]);
33        }
34
35        landSuffixMinFinish[n - 1] = land[n - 1][0] + land[n - 1][1];
36        for(int i = n - 2; i >= 0; i--){
37            landSuffixMinFinish[i] = Math.min(landSuffixMinFinish[i + 1], land[i][0] + land[i][1]);
38        }
39
40        waterPrefixMinD[0] = water[0][1];
41        for(int i = 1; i < m; i++){
42            waterPrefixMinD[i] = Math.min(waterPrefixMinD[i - 1], water[i][1]);
43        }
44
45        waterSuffixMinFinish[m - 1] = water[m - 1][0] + water[m - 1][1];
46        for(int i = m - 2; i >= 0; i--){
47            waterSuffixMinFinish[i] = Math.min(waterSuffixMinFinish[i + 1], water[i][0] + water[i][1]);
48        }
49
50        int ans = Integer.MAX_VALUE;
51
52        for(int i = 0; i < n; i++){
53            int landFinish = landS[i] + landD[i];
54
55            int waterIndex = upperBound(water, landFinish);
56
57            if(waterIndex > 0){
58                ans = Math.min(ans, landFinish + waterPrefixMinD[waterIndex - 1]);
59            }
60
61            if(waterIndex < m){
62                ans = Math.min(ans, waterSuffixMinFinish[waterIndex]);
63            }
64        }
65
66        for(int i = 0; i < m; i++){
67            int waterFinish = waterS[i] + waterD[i];
68
69            int landIndex = upperBound(land, waterFinish);
70
71            if(landIndex > 0){
72                ans = Math.min(ans, waterFinish + landPrefixMinD[landIndex - 1]);
73            }
74
75            if(landIndex < n){
76                ans = Math.min(ans, landSuffixMinFinish[landIndex]);
77            }
78        }
79
80        return ans;
81    }
82
83    public int upperBound(int[][] arr, int val){
84        int s = 0;
85        int e = arr.length;
86
87        while(s < e){
88            int mid = s + (e - s) / 2;
89
90            if(arr[mid][0] <= val){
91                s = mid + 1;
92            }
93            else{
94                e = mid;
95            }
96        }
97
98        return s;
99    }
100}