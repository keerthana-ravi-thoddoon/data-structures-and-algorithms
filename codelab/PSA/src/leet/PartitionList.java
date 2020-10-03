import java.util.*;

class ListNode1{
	    public int val;
	    public ListNode1 next;

	    public ListNode1() {}

	    public ListNode1(int _val) {
	        val = _val;
	    }

	    public ListNode1(int _val, ListNode1 _next) {
	        val = _val;
	        next = _next;
	    }
	}

class Partitions {
	ListNode1 head;
	
	Partitions(ListNode1 head){
		this.head = head;
	}
	
	public void partitionList(int i) {
		head = partition(i);
		display();
	}
    public ListNode1 partition(int x) {
        if(head == null){
            return null;
        }
        ListNode1 current = head;
        List<Integer> small = new ArrayList<Integer>();
        List<Integer> big = new ArrayList<Integer>();
        while(current != null){
            if(current.val < x){
                small.add(current.val);
            }else{
                big.add(current.val);
            }
            current = current.next;
        }
        ListNode1 curr = new ListNode1(0);
        ListNode1 newHead = curr;
        if(small.size()  > 0){            
            for(int i =0;i<small.size();i++){
                curr.next = new ListNode1(small.get(i));
                curr = curr.next;
            }
        }
        if(big.size() > 0){
              if(curr.next == null){
                  for(int i =0;i<big.size();i++){
                    curr.next = new ListNode1(big.get(i));
                    curr = curr.next;
                }
            }else{
                  for(int i =0;i<big.size();i++){
                    curr = new ListNode1(big.get(i));
                    curr = curr.next;
              }   
              }
        }
        
        return newHead.next;
    }
    
    public void display() {
    	String s = "";
    	ListNode1 curr = head;
    	while(curr != null) {
    		s += curr.val +" ->";
    		curr = curr.next;
    	}
    	System.out.println(s.substring(0,s.length()-2));
    }
}

public class PartitionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode1 l1 = new ListNode1(1);
		ListNode1 l2 = new ListNode1(4);
		ListNode1 l3 = new ListNode1(3);
		ListNode1 l4 = new ListNode1(2);
		ListNode1 l5 = new ListNode1(5);
		ListNode1 l6 = new ListNode1(2);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		
		Partitions p = new Partitions(l1);
		
		p.partitionList(3);
		

	}

}