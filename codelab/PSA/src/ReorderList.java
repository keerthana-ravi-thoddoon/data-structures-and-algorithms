
public class ReorderList {

	class Solution {
	    public void reorderList(ListNode head) {
	        if(head == null || head.next == null) return;
	        
	        ListNode a = head;
	        ListNode slow = head;
	        ListNode fast = head;
	        ListNode prev = null;
	        while(fast != null && fast.next != null){
	            prev = slow;
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        prev.next = null;
	        ListNode b = reverse(slow);
	        merge(a,b);
	               
	    }
	    public ListNode reverse(ListNode head){
	        ListNode prev = null;
	        ListNode current_node = head;
	        
	        while(current_node != null){
	            ListNode next_node = current_node.next;
	            current_node.next = prev;
	            prev = current_node;
	            current_node = next_node;
	        }
	        return prev;
	    }
	    public void merge(ListNode a, ListNode b){
	        while (a != null){
	            ListNode a_next  = a.next;
	            ListNode b_next = b.next;
	            a.next = b;
	            if(a_next == null ){
	                break;
	            }
	            b.next = a_next;
	            a = a_next;
	            b = b_next;
	        }
	    }
	}

}
