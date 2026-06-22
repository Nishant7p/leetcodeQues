1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public void delete(TreeNode root,int val){
18        if(root==null){
19            return; 
20        }
21        if(root.val>val){
22            if(root.left==null){
23                return;
24            }
25            if(root.left.val==val){
26                if(root.left.left==null&&root.left.right==null){
27                    root.left=null;
28                }
29                else if(root.left.left==null||root.left.right==null){
30                    if(root.left.left!=null){
31                        root.left=root.left.left;
32                    }
33                    else{
34                        root.left=root.left.right;
35                    }
36                }else{
37                    TreeNode par=root.left;
38                    TreeNode temp=root.left.left;
39                    while(temp.right!=null){
40                        par=temp;
41                        temp=temp.right;
42                    }
43                   root.left.val=temp.val;
44                   if(par==root.left){
45                    par.left=temp.left;
46                   }
47                   else{
48                    par.right=temp.left;
49                   }
50                    
51
52                }
53            }
54            else{
55                delete(root.left,val);
56            }
57
58
59
60
61
62
63        }
64        else{
65            if(root.right==null){
66                return;
67            }
68            if(root.right.val==val){
69                if(root.right.left==null&&root.right.right==null){
70                    root.right=null;
71                }
72                else if(root.right.left==null||root.right.right==null){
73                    if(root.right.left!=null){
74                        root.right=root.right.left;
75                    }
76                    else{
77                        root.right=root.right.right;
78                    }
79                }
80                else{
81    TreeNode par=root.right;
82    TreeNode temp=root.right.left;
83
84    while(temp.right!=null){
85        par=temp;
86        temp=temp.right;
87    }
88
89    root.right.val=temp.val;
90
91    if(par==root.right){
92        par.left=temp.left;
93    }
94    else{
95        par.right=temp.left;
96    }
97}
98
99
100            }
101            else{
102                delete(root.right,val);
103            }
104
105
106
107
108
109        }
110
111    }
112    public TreeNode deleteNode(TreeNode root, int key) {
113        if(root==null){
114            return root;
115        }
116        if(root.val==key){
117            TreeNode x=new TreeNode(Integer.MAX_VALUE);
118            x.left=root;
119            delete(x,key);
120            return x.left;
121
122        }
123        delete(root,key);
124
125
126
127
128
129        return root;
130        
131    }
132}