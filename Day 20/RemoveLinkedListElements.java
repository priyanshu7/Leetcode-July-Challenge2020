package july2020;

public class RemoveLinkedListElements {
	
	 public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	 
	 public static ListNode removeElements(ListNode head, int val) {
		 if(head == null)
	            return null;
	        while(head != null && head.val == val){
	            head = head.next;
	        }
	        if(head == null){
	            return null;
	        }
	        ListNode prev = head;
	        ListNode curr = head.next;
	        while(curr != null){
	            if(curr.val == val){
	                prev.next = curr.next;
	                curr = curr.next;
	            }else{
	                prev = prev.next;
	                curr = curr.next;
	            }
	            
	        }
	        return head;        
	    }
	 


}
