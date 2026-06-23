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
17    public void insert(TreeNode root, int val){
18        if(root==null){
19            return;
20        }
21        if(root.val>val){
22            if(root.left==null){
23                root.left=new TreeNode(val);
24            }
25            else{
26
27             insert(root.left,val);}
28        }
29        else{
30            if(root.right==null){
31                root.right=new TreeNode(val);
32            }
33
34            else{
35             insert(root.right,val);}
36        }
37
38    }
39    public TreeNode bstFromPreorder(int[] preorder) {
40        int n=preorder.length;
41        if(n==0){
42            return null;
43        }
44        TreeNode root=new TreeNode(preorder[0]);
45        for(int i=1;i<n;i++){
46            insert(root,preorder[i]);
47        }
48        return root;
49
50        
51    }
52}