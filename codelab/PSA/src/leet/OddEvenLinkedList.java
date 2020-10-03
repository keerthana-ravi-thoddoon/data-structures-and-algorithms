class OddEvenLinkedList  
{  

static class Node  
{  
    int data;  
    Node next;  
} 

static Node newNode(int key)  
{  
    Node temp = new Node();  
    temp.data = key;  
    temp.next = null;  
    return temp;  
}  
 
static Node rearrangeEvenOdd(Node head)  
{  

    if (head == null)  
        return null;  

    Node odd = head;  
    Node even = head.next;    
    Node evenFirst = even;  
    while (even!=null && even.next != null){
        odd.next = even.next;
        odd = odd.next;
        even.next = odd.next;
        even = even.next;
    }
    odd.next = evenFirst;
    return head;
    
}


static void printlist(Node node)  
{  
    while (node != null)  
    {  
        System.out.print(node.data + "->");  
        node = node.next;  
    }  
    System.out.print("Null") ;  
    System.out.println("\n") ;  
   
}  
  

public static void main(String[] args)  
{  
    Node head = newNode(10);  
    head.next = newNode(20);  
    head.next.next = newNode(30);  
    head.next.next.next = newNode(40);  
    head.next.next.next.next = newNode(50);  
  
    System.out.println("Input : ");  
    printlist(head);  
  
    head = rearrangeEvenOdd(head);  
  
    System.out.println("Output : ");  
    printlist(head);  
} 
}  



