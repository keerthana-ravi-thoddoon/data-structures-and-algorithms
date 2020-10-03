import java.util.Stack;

public class ScoreParanthesis {
	
	class Solution {
	    public int scoreOfParentheses(String S) {
	        Stack<Integer> s = new Stack();
	        int score = 0;
	        for(char c: S.toCharArray()){
	            if (c == '('){
	                s.push(score);
	                score = 0;
	                
	            }
	            else 
	            {
	                score = s.pop() + Math.max(score*2,1);
	            }
	        }
	        return score;
	    }
	}

}
