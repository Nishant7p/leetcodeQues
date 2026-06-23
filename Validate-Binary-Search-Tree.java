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
17    public void inorder(TreeNode root,ArrayList<Integer> arr){
18        if(root==null){
19            return;
20        }
21        inorder(root.left,arr);
22        arr.add(root.val);
23        inorder(root.right,arr);
24    }
25    public boolean isValidBST(TreeNode root) {
26        ArrayList<Integer> arr=new ArrayList<Integer>();
27        inorder(root,arr);
28        for(int i=1;i<arr.size();i++){
29            if(arr.get(i-1)>=arr.get(i)){
30                return false;
31            }
32        }
33        return true; 
34        
35    }
36}