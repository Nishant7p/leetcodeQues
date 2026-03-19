1class Solution {
2    public int compress(char[] arr) {
3
4        int l = 0;
5        int r = 0;
6
7        while(r < arr.length){
8            char current_char = arr[r];
9            int count = 0;
10
11            while(r < arr.length && arr[r] == current_char){
12                r++;
13                count++;
14            }
15
16            arr[l] = current_char;
17            l++;
18
19            if(count > 1){
20                String count_string = Integer.toString(count);
21                for(int i = 0; i < count_string.length(); i++){
22                    arr[l] = count_string.charAt(i);
23                    l++;
24                }
25            }
26        }
27
28        return l;
29    }
30}