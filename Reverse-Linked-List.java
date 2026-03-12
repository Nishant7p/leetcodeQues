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
12    
13    public ListNode reverseList(ListNode head) {
14        if(head==null){
15            return null;
16        }
17        if(head.next==null){
18            return head;
19        }
20
21
22
23        ListNode news=reverseList(head.next);
24        head.next.next=head;
25        head.next=null;
26        return news;
27        
28    }
29}