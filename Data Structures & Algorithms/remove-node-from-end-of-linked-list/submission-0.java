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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int i = 1;
        int upto_node = length(head)-(n-1);
        
        ListNode curr= head;
        ListNode prev = head;
        if( upto_node==1){
            return head.next;
        }
        while( i< upto_node){
            prev = curr;
            curr = curr.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }

    public int length(ListNode head){
        int i=0;
        ListNode curr = head;
        while( curr!=null){
            i++;
            curr = curr.next;
        }
        return i;
    }
}
