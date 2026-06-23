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
17    public ArrayList<Integer> merge(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
18        int n=arr1.size();
19        int m=arr2.size();
20        ArrayList<Integer> ans=new ArrayList<>();
21
22        int i=0;
23        int j=0;
24        while(i<n&&j<m){
25            if(arr1.get(i)>arr2.get(j)){
26                
27                ans.add(arr2.get(j));
28                j++;
29            }
30            else{
31                
32                ans.add(arr1.get(i));
33                i++;
34            }
35
36        }
37        while(i<n){
38            ans.add(arr1.get(i));
39            i++;
40        }
41        while(j<m){
42            ans.add(arr2.get(j));
43            j++;
44        }
45
46
47
48
49
50        return ans;
51    }
52    public void inO(TreeNode root,ArrayList<Integer> arr){
53        if(root==null){
54            return;
55        }
56        inO(root.left,arr);
57        arr.add(root.val);
58        inO(root.right,arr);
59    }
60    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
61        ArrayList<Integer> arr1=new ArrayList<>();
62        ArrayList<Integer> arr2=new ArrayList<>();
63
64        inO(root1,arr1);
65        inO(root2,arr2);
66
67
68
69    
70        System.out.println(arr2);
71        
72
73        return merge(arr1,arr2);
74        
75    }
76}