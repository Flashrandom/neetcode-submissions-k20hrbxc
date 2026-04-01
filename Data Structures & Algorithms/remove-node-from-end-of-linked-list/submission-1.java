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
        
        
        if( head.next == null) return null;
        ListNode curr = head;
        int count = 0;
        while( curr!= null){
            count+= 1;
            curr = curr.next;
        }

        int nth_start = (count-n)+1;
        if( n== count) return head.next;
        int i=1;
        ListNode curr1 = head;
        while(i < nth_start-1){
            curr1 = curr1.next;
            i++;
        }
        curr1.next= curr1.next.next;
        return head;
    }
}

