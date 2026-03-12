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
13    public ListNode detectCycle(ListNode head) {
14        if(head==null){
15            return null;
16        }
17        if(head.next==null){
18            return null;
19        }
20        ListNode s=head;
21        ListNode f=head;
22        int c=0;
23        while(f!=null&&f.next!=null&&f.next.next!=null){
24            s=s.next;
25            f=f.next.next;
26            if(s==f){
27                c=1;
28                break;
29            }
30        }
31        if(c==0){
32            return null;
33        }
34        ListNode temp=head;
35        while(s!=temp){
36            s=s.next;
37            temp=temp.next;
38        }
39        return temp;
40
41        
42    }
43}