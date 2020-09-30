
public class RemoveOuterParanthesis {
	class Solution {
	    public String removeOuterParentheses(String S) {
	        StringBuilder res=new StringBuilder();
	        int open=0,close=0,start=0;
	        for(int i=0;i<S.length();i++){
	            if(S.charAt(i)=='('){
	                open++;
	            }
	             if(S.charAt(i)==')'){
	                close++;
	            }
	            if(open==close){
	                res.append(S.substring(start+1,i));
	                start=i+1;
	            }
	        }
	        return res.toString();
	    }
	}

}
