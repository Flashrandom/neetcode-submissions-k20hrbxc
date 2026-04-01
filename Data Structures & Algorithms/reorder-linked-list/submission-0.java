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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!= null && fast.next!= null){
            fast= fast.next.next;
            slow = slow.next;
        }
        
        ListNode last =reverse(slow.next);
        slow.next = null;
        ListNode first  = head; 
        while(last!= null){
            ListNode last_temp = last.next;
            ListNode temp = first.next;
            first.next = last;
            last.next = temp;
            first = temp;
            last = last_temp;
        }

    }
    public ListNode reverse(ListNode slow){
        //now revese
        ListNode prev= null;
        while(slow!= null){
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        return prev;

    }
}
