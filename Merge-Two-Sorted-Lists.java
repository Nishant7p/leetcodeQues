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
12    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
13        ListNode ans=new ListNode(-1);
14        ListNode t=ans;
15        while(h1!=null&&h2!=null){
16            if(h1.val<=h2.val){
17                t.next=h1;
18                h1=h1.next;
19            }
20            else{
21                t.next=h2;
22                h2=h2.next;
23
24            }
25            t=t.next;
26        }
27        if(h1!=null){
28            t.next=h1;
29        }
30    
31        if(h2!=null){
32            t.next=h2;
33        }
34        return ans.next;
35    }
36
37}