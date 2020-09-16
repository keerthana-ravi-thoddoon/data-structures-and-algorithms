import java.util.*;

public class TwoSums {
	    public static int[] twoSum(int[] nums, int target) {
	        Map<Integer,Integer> map = new HashMap();
	       for(int i=0;i<=nums.length;i++)
	       {
	           
	           int diff = target - nums[i];
	           if(map.containsKey(diff)){
	              return new int[]{map.get(diff),i}; //7,0 	
	           }
	           map.put(nums[i],i);
	       }
	        return null;
	    }
	    
	    public static void main(String args[]) {
	    	int[] arr = new int[] {2,7,11,15};
	    	int target =9;
	    	
	    int[] result=twoSum(arr,target);
	    System.out.println(Arrays.toString(result));
	    }

}
