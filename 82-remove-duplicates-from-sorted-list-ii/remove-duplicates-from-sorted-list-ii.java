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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode pointer = head;

        while(pointer != null && pointer.next != null){
            if(pointer.val == pointer.next.val){
                int duplicate = pointer.val;

                while(pointer != null && pointer.val == duplicate){
                    pointer = pointer.next;
                }
                prev.next = pointer;
            }else{
                prev = pointer;
                pointer = pointer.next;
            }
        }
        return dummy.next;
    }
}