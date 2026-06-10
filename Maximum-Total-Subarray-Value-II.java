1class Solution {
2    public class HNode{
3        int start;
4        int end;
5        int val;
6        public HNode(int start,int end,int val){
7            this.start=start;
8            this.val=val;
9            this.end=end;
10        }
11    }
12    public class Pair{
13        int max;
14        int min;
15        public Pair(int max,int min){
16            this.max=max;
17            this.min=min;
18
19        }
20    }
21    public  class Node{
22        Node right;
23        Node left;
24        int max;
25        int min;
26        int start;
27        int end;
28        public Node(int start,int end){
29            this.start=start;
30            this.end=end;
31
32        }
33    }
34    public class STree{
35        Node root;
36        public STree(int[] arr){
37            this.root=createTree(arr,0,arr.length-1);
38        }
39        public Node createTree(int[] arr,int start,int end){
40            if(start==end){
41                Node leaf=new Node(start,start);
42                leaf.max=arr[start];
43                leaf.min=arr[end];
44                return leaf;
45            }
46            int mid=start+(end-start)/2;
47            Node n=new Node(start,end);
48            n.left=createTree(arr,start,mid);
49            n.right=createTree(arr,mid+1,end);
50            n.max=Math.max(n.left.max,n.right.max);
51            n.min=Math.min(n.left.min,n.right.min);
52            return n;
53        }
54        public Pair query(int left,int right){
55            return helper(left,right,this.root);
56
57        }
58
59        private Pair helper(int left, int right, Node root) {
60            int node_s=root.start;
61            int node_e=root.end;
62            if(node_e<=right&&node_s>=left){
63                return new Pair(root.max, root.min);
64            }
65            if(right<node_s||left>node_e){
66                return new Pair(Integer.MIN_VALUE,Integer.MAX_VALUE);
67            }
68            else {
69                Pair left_a=helper(left,right,root.left);
70                Pair right_a=helper(left,right,root.right);
71                return new Pair(Math.max(left_a.max,right_a.max),Math.min(right_a.min,left_a.min));
72            }
73
74        }
75
76
77    }
78    public long maxTotalValue(int[] arr, int k) {
79        int n=arr.length;
80        STree tree=new STree(arr);
81        PriorityQueue<HNode> pq=new PriorityQueue<>((a,b)->Integer.compare(b.val,a.val));
82        for(int i=0;i<n;i++){
83            int end=n-1;
84            Pair curr=tree.query(i,end);
85            int c_val=curr.max-curr.min;
86            pq.offer(new HNode(i,end,c_val));
87            
88        }
89        long ans=0;
90        while(k>0){
91            HNode node=pq.poll();
92            ans=ans+node.val;
93            int curr_s=node.start;
94            int next_e=node.end-1;
95            if(curr_s<=next_e){
96                Pair next_range=tree.query(curr_s,next_e);
97                int n_val=next_range.max-next_range.min;
98                pq.offer(new HNode(curr_s,next_e,n_val));
99
100
101            }
102            k--;
103
104
105        }
106
107
108
109
110
111
112
113
114
115        return ans;
116
117       
118        
119    }
120}