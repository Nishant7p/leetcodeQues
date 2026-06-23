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
17    public void inO(TreeNode root, ArrayList<Integer> arr){
18        if(root==null){
19            return;
20        }
21        inO(root.left,arr);
22        arr.add(root.val);
23        inO(root.right,arr);
24
25    }
26    public int kthSmallest(TreeNode root, int k) {
27        ArrayList<Integer> arr=new ArrayList<Integer>();
28        inO(root,arr);
29        return arr.get(k-1);
30        
31    }
32}