
public class DailyTemperatures {
	
	class Solution {
	    public int[] dailyTemperatures(int[] T) {
	       
	        int len = T.length;
	        int[] res = new int[len], stack = new int[71];
	        int index = -1;
	        for (int i = len - 1; i >= 0; i--) {
	            while (index >= 0 && T[stack[index]] <= T[i]) {
	                index--;
	            }
	            if(index >= 0) res[i] = stack[index] - i;
	            stack[++index] = i;
	    }
	        return res;
	}
	}

}
