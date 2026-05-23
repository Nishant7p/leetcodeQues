1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode sortList(ListNode head) {
13        ArrayList<Integer> arr=new ArrayList<>();
14
15        while(head!=null){
16            arr.add(head.val);
17            head=head.next;
18        }
19        System.out.println(arr);
20
21        ListNode x=new ListNode(-1);
22        Collections.sort(arr);
23        ListNode t=x;
24        int i=0;
25        while(i<arr.size()){
26            t.next=new ListNode(arr.get(i));
27            i++;
28            t=t.next;
29        }
30
31
32
33        return x.next;
34        
35    }
36}