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
12    public ListNode middleNode(ListNode head) {
13        ListNode x=head;
14        int c=1;
15        while(x.next!=null){
16            c++;
17            x=x.next;
18        }
19        c=c/2+1;
20        int c1=1;
21        x=head;
22        
23        while(c1!=c){
24            x=x.next;
25            c1++;
26        }
27
28        return x;
29        
30    }
31}