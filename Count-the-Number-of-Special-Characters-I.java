1class Solution {
2    public int numberOfSpecialChars(String s) {
3        int[] arr1=new int[26];
4        int[] arr2=new int[26];
5        for(int i=0;i<s.length();i++){
6            char c=s.charAt(i);
7            if(c>='a'&&c<='z'){
8                arr1[c-'a']=1;
9            }
10            if(c>='A'&&c<='Z'){
11                arr2[c-'A']=1;
12            }
13
14        }
15        int ans=0;
16
17        for(int i=0;i<26;i++){
18            if(arr1[i]==1&&arr2[i]==1){
19                ans++;
20
21            }
22        }
23        return ans;
24        
25    }
26}