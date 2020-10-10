package leetcode;

public class Main {
	
	public static void main(String args[]) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
//		ll.addTail(1);
//		ll.addTail(2);
//		ll.addTail(3);
//		ll.addTail(4);
//		ll.addTail(2);
//		ll.addTail(1);
		
//		System.out.println(ll.isPalindrome());
	    //	ll.reverse();
//		ll.printList();	
//		ll.pairWiseSwap();		
//		ll.printList();	

		
		//Break in half node
//		Node second = ll.breakInHalf();
//		Node sec = ll.breakInHalf();
//		printList(second);
//		ll.addCycle();
		
		
		
	// Array for Sorted Merge
		
		
	      Node<Integer> node1 = new Node<Integer>(1);
        node1.next = new Node<Integer>(3);
        node1.next.next = new Node<Integer>(5);
        node1.next.next.next = new Node<Integer>(7);

        Node<Integer> node2 = new Node<Integer>(2);
        node2.next = new Node<Integer>(4);
        node2.next.next = new Node<Integer>(6);
        node2.next.next.next = new Node<Integer>(8);
//		
//	
//		
//		Node merged = sortedMerge(node1, node2);
//		printSortedNodeList(merged);
//		
        ll.intersectionOfNodes(node1, node2);
		
		
		
//
	
//	System.out.println("Count : " + ll.count());
//	Node startCycle = ll.findStartOfCycle();
//	if(startCycle != null) {
//		System.out.println("The cycle starts at "+startCycle.data);
//	}
//	System.out.println("Is Cyclic ? - " + ll.isCyclic());
//
	}
	
//public static void printList(Node node){
//		
//		if(node == null) {
//			return;
//		}
//		Node temp = node;
//		while(temp != null) {
//			System.out.print(temp.data + "->");
//			temp = temp.next;
//		}
//		System.out.println("null");
//	}
	
	

// Sorted Merge

private static Node sortedMerge(Node<Integer> node1, Node<Integer> node2) {
    Node<Integer> result = null;

    if(node1 == null){
        return node2;
    }

    if(node2 == null){
        return  node1;
    }

    if(node1.data < node2.data){
        result = node1;
        result.next = sortedMerge(node1.next, node2);
    }else{
        result = node2;
        result.next = sortedMerge(node1, node2.next);
    }

    return  result;
	}




public static void printSortedNodeList(Node<Integer> node){
		
		if(node == null) {
			return;
		}
		Node temp = node;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}



	
}


//Questions:
//Break In Half prints only last half why?
//How to pass an arg in here breakinhalf method
// intersection of node ? output?
