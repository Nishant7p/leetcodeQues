/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans=new int[m][n];
        int cnt=m*n;
        ListNode tt=head;
        int j=1;
        while(tt.next!=null){
            tt=tt.next;
            j++;
        }

        while(j<cnt){
            ListNode lis=new ListNode(-1);
            tt.next=lis;
            tt=tt.next;
            j++;
        }

        int t=0;
        int b=m-1;;
        int l=0;
        int r=n-1;
        ListNode temp=head;
        while(t<=b&&l<=r){
            for(int i=l;i<=r;i++){
                ans[t][i]=temp.val;
                temp=temp.next;
            }
            t++;

            if(t<=b&&l<=r){


            for(int i=t;i<=b;i++){
                ans[i][r]=temp.val;
                temp=temp.next;
            }
            r--;
            }

             if(t<=b&&l<=r){

            for(int i=r;i>=l;i--){
                ans[b][i]=temp.val;
                temp=temp.next;
            }
            b--;}
             if(t<=b&&l<=r){

            for(int i=b;i>=t;i--){
                ans[i][l]=temp.val;
                temp=temp.next;
            }
            l++;}

        }













        return ans;
        
    }
}