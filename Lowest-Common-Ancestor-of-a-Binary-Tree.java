1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    public TreeNode trav(TreeNode root,int lca){
12        if( root==null){
13            return null;
14        }
15        if(root.val==lca){
16            return root;
17        }
18        TreeNode left = trav(root.left, lca);
19        if(left != null) return left;
20
21        return trav(root.right,lca);
22
23
24    }
25    public boolean dfs(TreeNode node,ArrayList<Integer> parents,TreeNode dest){
26        if(node==null){
27            return false;
28        }
29        if(node.val==dest.val){
30            parents.add(node.val);
31            return true;
32        }
33        parents.add(node.val);
34        if( dfs(node.left,parents,dest)||dfs(node.right,parents,dest)){
35            return true;
36        }
37       
38       parents.remove(parents.size()-1);
39       return false;
40        
41
42
43
44        
45
46
47
48    }
49    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
50        ArrayList<Integer> parents1=new ArrayList<>();
51        ArrayList<Integer> parents2=new ArrayList<>();
52        
53        
54
55        dfs(root,parents1,p);
56        dfs(root,parents2,q);
57        for(int i:parents2){
58            System.out.println(i);
59        }
60        int i=0;
61        int lca=-1;
62        while(i<parents1.size()&&i<parents2.size()){
63            if(parents1.get(i).equals(parents2.get(i))){
64                lca=parents1.get(i);
65            }
66            else{
67                break;
68            }
69            i++;
70        }
71        return trav(root,lca);
72
73
74
75        
76    }
77}