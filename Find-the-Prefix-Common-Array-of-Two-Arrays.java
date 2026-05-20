1class Solution {
2    public int[] findThePrefixCommonArray(int[] A, int[] B) {
3        int n=A.length;
4        int[] c=new int[n];
5        HashMap<Integer,ArrayList<Integer>> a=new HashMap<>();
6        HashMap<Integer,ArrayList<Integer>> b=new HashMap<>();
7        
8
9        ArrayList<Integer> aa=new ArrayList<>();
10        ArrayList<Integer> bb=new ArrayList<>();
11
12        for(int i=0;i<n;i++){
13           
14            aa.add(A[i]);
15            bb.add(B[i]);
16            a.put(i,new ArrayList<>(aa));
17            b.put(i,new ArrayList<>(bb));
18        
19
20        }
21        for(int i=0;i<n;i++){
22            int x=0;
23             ArrayList<Integer> aaa=a.get(i);
24             ArrayList<Integer> bbb=b.get(i);
25
26             for(int j=0;j<aaa.size();j++){
27                if(bbb.contains(aaa.get(j))){
28                    x++;
29                }
30             }
31             c[i]=x;
32
33        }
34        return c;
35
36
37        
38    }
39}