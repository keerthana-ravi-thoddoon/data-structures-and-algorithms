
public class MinStack {
	class MinStack {

	    /** initialize your data structure here. */
	    Stack<Integer> s1;
	    Stack<Integer> s2;
	    public MinStack() {
	       s1 = new Stack<>();
	       s2 = new Stack<>();
	    }
	    
	    public void push(int x) {
	       s1.push(x); 
	       if(s2.isEmpty() || x<=s2.peek()){
	           s2.push(x);
	       }
	    }
	    
	    public void pop() {
	       if(s1.peek().equals(s2.peek())){
	           s2.pop();
	       }
	       s1.pop(); 
	    }
	    
	    public int top() {
	        return s1.peek();
	    }
	    
	    public int getMin() {
	       return s2.peek();
	    }
	}

}
