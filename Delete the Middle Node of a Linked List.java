class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow=head,fast=head;
        if(head.next==null) return null;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if (slow.next==null){
            head.next=null;
            return head;
        }
         slow.val=slow.next.val;
        slow.next=slow.next.next;
        return head;
    }
}
