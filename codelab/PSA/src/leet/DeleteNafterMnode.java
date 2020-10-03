

class LinkedNode {
	LinkedNode next;
  int data;
}

class Linked {
  
  public LinkedNode deleteNNodesPostMNodes(int n, int m, LinkedNode head) {


if(head == null) {
      return head;
    }
    
LinkedNode tmp1 = head;
LinkedNode tmp2 = head;
    int i = 0, j = 0;
    
    while(i++ < m - 1) {
      tmp1 = tmp1.next;
    }
    
    tmp2 = (m == 0) ? tmp1 : tmp1.next;
    
    while(j++ < n) {
      if(tmp2 == null) {
        System.out.println("Not enough elements to delete");
        return head;
      }
      tmp2 = tmp2.next;
    }
    
    if(m == 0) {
      return tmp2;
    } else {
      tmp1.next = tmp2;  
    }
  
    
    return head;
  }
  
  public LinkedNode getNewNode(int key) {
	  LinkedNode a = new LinkedNode();
    a.next = null;
    a.data = key;
    return a;
  }

  public LinkedNode insert(int key, LinkedNode head) {

    if (head == null)
      return getNewNode(key);
    else
      head.next = insert(key, head.next);

    return head;
  }

  public void printList(LinkedNode node) {
    if (node == null) {
      return;
    }

    System.out.print(node.data + " ");
    printList(node.next);
  }
}

public class DeleteNafterMnode {

  public static void main(String[] args) {

	  LinkedNode head = null;
    Linked a = new Linked();

    head = a.insert(1, head);
    head = a.insert(2, head);
    head = a.insert(3, head);
    head = a.insert(4, head);
    head = a.insert(5, head);
    head = a.insert(6, head);
    head = a.insert(7, head);
    head = a.insert(8, head);
    head = a.insert(9, head);
    head = a.insert(10, head);
    
    a.printList(head);
    System.out.println();
    
    head = a.deleteNNodesPostMNodes(2, 3, head);
    
    a.printList(head);
    System.out.println();
  }
}