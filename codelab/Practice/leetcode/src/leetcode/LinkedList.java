package leetcode;

public class LinkedList<T> {
	
	public Node<T>  head;
	public LinkedList()
	{
		head = null;
//		addCycle();
	}
	
	public void addHead(T data) {
		Node add = new Node(data);
		{
			add.next = head;
			head = add;
		}
	}
	
	public void addTail(T data) {
		Node add = new Node(data);
		if(head == null) {
			head = add;
		return;
		}
		Node temp = head;
		while (temp.next!= null) {
			temp = temp.next;
		}
		temp.next = add;
	}
	
	public void printList()
	{
		
		if(isCyclic()) {
			System.out.println("There is a cycle");
			return;
		}
		if(head == null) {
			return;
		}
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	
	public int count(Node node1) {
		if (head == null) {
			return 0;
		}
		Node temp = head;
		int count = 0;
		while(temp != null) {
			count ++;
			temp = temp.next;
		}
		return count;
	}
	
	// Reverse the Linked List
	public void reverse() {
		if (head == null || head.next == null) {
			return;
		}
		Node back = null;
		Node mid = head;
		Node front = head.next;
		
		try {
		while(front != null) {
			mid.next = back;
			back = mid;
			mid = front;
			front = front.next;
		}
		mid.next = back;
		head = mid;
	}
		catch(Exception e) {
			System.out.println("infinite loop");
			
		}
	}
	
	
	// Reverse the Linked List from a Given Node
	   public Node reverse(Node node){
	        if(node == null || node.next == null){
	            return node;
	        }


	        Node back = null;
	        Node mid = node;
	        Node front = node.next;

	        while(front != null){
	            mid.next = back;
	            back = mid;
	            mid = front ;
	            front = front.next;
	        }

	        mid.next = back;
	        node = mid;
	        return node;
	    }
	
	
	public void addCycle() {
		head = null;
		head = (Node<T>) new Node<Integer> (1);
		head.next = (Node<T>) new Node<Integer> (2);
		head.next.next = (Node<T>) new Node<Integer> (3);
		head.next.next.next = (Node<T>) new Node<Integer> (4);
		head.next.next.next.next = (Node<T>) new Node<Integer> (5);
		head.next.next.next.next.next = (Node<T>) new Node<Integer> (6);
		head.next.next.next.next.next.next = head.next.next;
		}
	
	public boolean isCyclic() {
		if(head == null || head.next == null) {
		return false;
		}
		Node fast = head;
		Node slow = head;
		
		while(fast != null ) {
			fast = fast.next;
			if(fast ==null) {
				return false;
			}
			fast = fast.next;
			slow = slow.next;
			// Node meet point
			if (fast == slow) {
				return true;
			}
		}
	return false;
		
		
	}
	
	
	public Node findStartOfCycle(){

        if( head == null || head.next == null){
            return null;
        }
        Node fast = head;
        Node slow = head;

        while(fast != null){
            fast = fast.next;
            if(fast == null){
                return null;
            }
            fast = fast.next;
            slow = slow.next;

            // Nodes met which means there is a cycle
            if( fast == slow ){
                break;
            }
        }

        // There is definitely a cycle
        // Move fast or slow to head

        fast = head;

        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;

    }
	
	public Node nthFromTheEnd(int n) {
		if (head == null || n<=0) {
			return null;
			}
		
		if(isCyclic()) {
			System.out.println("There is a cycle");
			return null;
		}
		Node front = head;
		Node back = head;
		
		for (int i=0; i<n; i++) {
			
			if(front == null) {
				return null;
			}
			front = front.next;
			
		}
		while (front != null ) {
			front = front.next;
			back = back.next;
		}
		
		
		return back;
		
	}
	
	// Break In Half 
	public Node breakInHalf() {
		if(head == null || head.next == null) {
			return null;
		}
		Node front = head;
		Node back = head;
		
		//Assume there is no cycle
		while(front.next != null) {
			front = front.next;
			if(front.next != null) {
				front = front.next;
				back = back.next;
			}
	
		}
		
			
			Node temp = back.next;
			back.next = null;
			return temp;
			
		}
	
	
	// Break In Half from the given Node
	public Node breakInHalf(Node node) {
		if(node == null || node.next == null) {
			return null;
		}
		Node front = head;
		Node back = head;
		
		//Assume there is no cycle
		while(front.next != null) {
			front = front.next;
			if(front.next != null) {
				front = front.next;
				back = back.next;
			}
	
		}
		
			
			Node temp = back.next;
			back.next = null;
			return temp;
			
		}
	
	
	// IsPalindrome 
	 public boolean isPalindrome(){

	        if(head == null || head.next == null){
	            return true;
	        }

	        Node secondHalf = breakInHalf();

	        secondHalf = reverse(secondHalf);

	        Node temp1 = head;
	        Node temp2 = secondHalf;

	        boolean palindrome = true;

	        while(temp1 != null && temp2 != null){
	            if(temp1.data != temp2.data){
	                palindrome = false;
	                break;
	            }
	            temp1 = temp1.next;
	            temp2 = temp2.next;
	        }

	        secondHalf = reverse(secondHalf);
	        temp1 = head;
	        while(temp1.next != null){
	            temp1 = temp1.next;
	        }
	        temp1.next = secondHalf;

	        return  palindrome;

	    }
	 
	
	 // pair wise swap
	 public void pairWiseSwap() {
		 if(head == null || head.next == null) {
			 return;
		 }
		 Node temp = head;
		 while(temp!=null && temp.next != null) {
			 T swap = (T) temp.data;
			 temp.data = temp.next.data;
			 temp.next.data = swap;
			 temp = temp.next.next;
			 
		 }
		 
	 }
	 
	 // intersection of nodes
	  public Node intersectionOfNodes(Node node1, Node node2){

	        if(node1 == null || node2 == null){
	            return null;
	        }
	        // Assuming no cycle
	        int count1 = count(node1);
	        int count2 = count(node2);

	        if(count1 > count2){
	            for(int i = 0 ;i < count1 - count2; i ++){
	                node1 = node1.next;
	            }
	        }
	        if(count2 > count1){
	            for(int i = 0 ;i < count2 - count1; i ++){
	                node2 = node2.next;
	            }
	        }
	        while(node1 != null || node2 != null){
	            if(node1 == node2){
	                return node1;
	            }
	            node1 = node1.next;
	            node2 = node2.next;

	        }

	        return null;
	    }
	
}
