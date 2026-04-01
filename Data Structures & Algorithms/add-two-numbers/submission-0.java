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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode new_list= new ListNode(-1);
        ListNode dummy = new_list;
        ListNode pt1 = l1;
        ListNode pt2 = l2;
        int val_sum =0;
        int carry= 0;
        while( pt1!= null || pt2!= null || carry!=0){
            int val_1 = pt1!= null ? pt1.val : 0;
            int val_2 = pt2!= null ? pt2.val : 0;
            val_sum=  carry + val_1 + val_2;
            carry = val_sum/10;
            int real_val = val_sum%10;

            dummy.next= new ListNode(real_val);
            if( pt1!= null) pt1 = pt1.next;
            if( pt2!= null) pt2 = pt2.next;
            dummy = dummy.next; 

        } 
        return new_list.next; 
    }
}
