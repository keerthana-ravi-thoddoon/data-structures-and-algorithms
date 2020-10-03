

import java.util.Stack;

public class BackspaceStringCompare {
	class Solution {
	    public boolean backspaceCompare(String S, String T) {
	       Stack<Character> s = new Stack();
	       for(char c : S.toCharArray()){
	           if(c!='#'){
	              s.push(c); 
	           }else if(!s.isEmpty()){
	               s.pop();
	           } 
	       }
	        StringBuilder sb = new StringBuilder();
	        while(!s.isEmpty()){
	            sb.append(s.pop());
	        }
	        for(char c : T.toCharArray()){
	           if(c!='#'){
	              s.push(c); 
	           }else if(!s.isEmpty()){
	               s.pop();
	           } 
	        }
	        StringBuilder sb1 = new StringBuilder();
	        while(!s.isEmpty()){
	            sb1.append(s.pop());
	        }
	        return sb.toString().equals(sb1.toString());
	    }
	}
}
