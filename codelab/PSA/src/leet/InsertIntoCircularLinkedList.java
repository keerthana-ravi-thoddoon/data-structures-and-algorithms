import java.util.*;


class Node {
	    public int val;
	    public Node next;

	    public Node() {}

	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, Node _next) {
	        val = _val;
	        next = _next;
	    }
	}

class LinkedListImplementation{
	Node head;
	LinkedListImplementation(){
		head = null;
	}
	
	public void insertNode(int insertVal) {
		head = insert(head,insertVal);
		System.out.println("After insertion of " + insertVal);
		display();
	}
	public Node insert(Node head, int insertVal) {
        // Check if head is null
        if(head == null){
            Node n = new Node(insertVal);            
            head = n;
            head.next = head;
            return head;
        }
        
        // insert if only head is present
        if(head.next == head){
            insertNode(head,insertVal,head);
            return head;
        }
        
        //insert element if present between any two elements
        Node prev = head;
        Node current = head.next;
        do{
            if(prev.val < insertVal && current.val >= insertVal){
                insertNode(prev,insertVal,current);
                return head;  
            }
            prev = prev.next;
            current = current.next;
        }while(prev != head);
        
        // insert the element at last, if its the largest or smallest
        while(current != head){
           if(prev.val > current.val){
               insertNode(prev,insertVal,current);
               return head;
           }
            prev = prev.next;
            current = current.next;
        }
        insertNode(prev,insertVal,current);
       
        return head;        
    }
    
    public void insertNode(Node prev,int insertVal,Node current){
        Node n = new Node(insertVal);
        prev.next = n;
        n.next = current;
    }
    
    public void display() {
    	String s = "";
    	Node current = head;
    	
    	do {
    		s += current.val + " ->";
    		current = current.next;
    	}while(current != head);
    	
    	System.out.println(s.substring(0,s.length()-2));
    }
	
}
	
public class InsertIntoCircularLinkedList {
	

	public static void main(String[] args) {
			
		LinkedListImplementation insert = new LinkedListImplementation();
		insert.insertNode(3);
		insert.insertNode(5);
		insert.insertNode(1);
		insert.insertNode(0);

	}	
}