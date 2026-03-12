1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        if(head==null){
15            return false;
16        }
17        if(head.next==null){
18            return false;
19        }
20        ListNode s=head;
21        ListNode f=head.next;
22        
23        while(f!=null&&f.next!=null&&f.next.next!=null){
24            if(f==s){
25                return true;
26            }
27            f=f.next.next;
28            s=s.next;
29
30        }
31        return false;
32    }
33}