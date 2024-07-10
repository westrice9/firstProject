package leetcode;

public class DeleteMiddleOfLinkedList {
    public static void main(String[] args) {

    }
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next !=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev != null){
            prev.next = slow.next;
            slow.next = null;
        }
        return head;
    }
}
