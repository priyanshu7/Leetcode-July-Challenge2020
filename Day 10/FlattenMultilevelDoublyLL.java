package july2020;

public class FlattenMultilevelDoublyLL {
	
	class Node {
	    public int val;
	    public Node prev;
	    public Node next;
	    public Node child;
	}
	
	public Node flatten(Node head) {
        if(head== null)
            return head;
        Node ptr = head;
        while(ptr != null){
            if(ptr.child == null){
                ptr = ptr.next;
                continue;
            }
            
            Node childPtr = ptr.child;
            while(childPtr.next != null)
                childPtr = childPtr.next;
            
            childPtr.next = ptr.next;
            if(ptr.next != null)
                ptr.next.prev = childPtr;
            
            ptr.next = ptr.child;
            ptr.child.prev = ptr;
            ptr.child = null;
        }
        return head;
    }

}
