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
17    public TreeNode createBinaryTree(int[][] arr) {
18        HashMap<Integer,TreeNode> map=new HashMap();
19        HashSet<Integer> set=new HashSet();
20        for(int[] d:arr){
21            int parent=d[0];
22            int child=d[1];
23            int left=d[2];
24            map.putIfAbsent(parent,new TreeNode(parent));
25            map.putIfAbsent(child,new TreeNode(child));
26
27            TreeNode par=map.get(parent);
28            TreeNode ch=map.get(child);
29            if(left==1){
30                par.left=ch;
31            }else{
32                par.right=ch;
33            }
34            set.add(child);
35
36
37        }
38        for(int[] d:arr){
39            int nod=d[0];
40            if(!set.contains(nod)){
41                return map.get(nod);
42
43            }
44        }
45
46
47
48
49
50        return null;
51
52        
53    }
54}