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
17    public void helper(TreeNode par, TreeNode x,TreeNode curr){
18        if(curr==null){
19            if(par.val>x.val){
20                par.left=x;
21            }else{
22                par.right=x;
23            }
24            return;
25        }
26        if(curr.val<x.val){
27            helper(curr,x,curr.right);
28        }
29        else{
30             helper(curr,x,curr.left);
31
32        }
33    }
34    public TreeNode insertIntoBST(TreeNode root, int val) {
35         TreeNode node =new TreeNode(val);
36       
37        if(root==null){
38           
39            return node;
40        }
41        if(root.val<val){
42            helper(root,node,root.right);
43        }
44        else{ helper(root,node,root.left);}
45
46        return root;
47
48        
49    }
50}