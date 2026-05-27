1class Solution {
2    public int numberOfSpecialChars(String s) {
3        int n=s.length();
4        int[] arr=new int[26];
5        int ans=0;
6
7        for(int i=0;i<n;i++){
8            char c=s.charAt(i);
9            if(c>='a'&&c<='z'){
10                
11                arr[c-'a']=i+1;
12            }
13            
14        }
15         for(int i=0;i<n;i++){
16            char c=s.charAt(i);
17            if(c>='A'&&c<='Z'){
18                if(arr[c-'A']>0){
19                    if(arr[c-'A']<i+1){
20                        ans++;
21    
22                }
23                 arr[c-'A']=0;
24                }
25            }
26        }
27
28    
29
30
31        
32        return ans;
33
34        
35    }
36}