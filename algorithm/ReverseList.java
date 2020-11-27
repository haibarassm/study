/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
           if(head==null||head.next==null){
            return head;
        }
        if(head.next.next==null){
            ListNode nextNode= head.next;
            nextNode.next=head;
            head.next=null;
            return nextNode;
        }
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode preNode=head;
        ListNode curNode=head.next;
        ListNode nextNode=head.next.next;
        while(nextNode!=null){
            ListNode nextNext=nextNode.next;
            nextNode.next=curNode;
            curNode.next=preNode;
            if (preNode.equals(dummy.next)) {
                preNode.next = null;
            }
            preNode=curNode;
            curNode=nextNode;
            nextNode=nextNext;
        }
        return curNode;
    }
}