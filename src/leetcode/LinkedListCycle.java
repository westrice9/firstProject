package leetcode;

public class LinkedListCycle {
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {
        ListNode behind = head;
        ListNode ahead = head;
        while(ahead!=null&&ahead.next!=null){
            behind = behind.next;
            ahead = ahead.next.next;
            if(ahead == behind)
                return true;
        }
        return false;
    }
}
