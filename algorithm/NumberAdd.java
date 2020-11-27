/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // 别想着转int或者long万一链表长了加起来就不对了
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 前置条件判断
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        // 指定一个哨兵节点，方便最后指向新链表的第一个节点
        ListNode dummy=new ListNode(-1);
        // 移位节点
        ListNode pre=dummy;
        // 进位计数器
        int upCount=0;
        // 两个链表都有值的时候
        while(l1!=null&&l2!=null){
            int number=l1.val+l2.val+upCount;
            int val=number%10;
            upCount=number/10;
            ListNode node=new ListNode(val);
            pre.next=node;
            pre=pre.next;
            l1=l1.next;
            l2=l2.next;
        }
        // l1链表有值的时候
        while(l1!=null){
            int number=l1.val+upCount;
            int val=number%10;
            upCount=number/10;
            ListNode node=new ListNode(val);
            pre.next=node;
            pre=pre.next;
            l1=l1.next;
        }
        // l2链表有值的时候
         while(l2!=null){
             int number=l2.val+upCount;
            int val=number%10;
            upCount=number/10;
            l2=l2.next;
            ListNode node=new ListNode(val);
            pre.next=node;
             pre=pre.next;
        }
       // 都算完了可能计数器还有进位
        if(upCount!=0){
             ListNode node=new ListNode(upCount);
             pre.next=node;
        }
        return dummy.next;
    }
}