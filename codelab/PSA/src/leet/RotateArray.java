import java.util.Arrays;

public class RotateArray {

	public static int[] rotate(int[] nums, int k) {
		k = k% nums.length;
		rev(nums,0,nums.length-1);
		rev(nums,0,k-1);
		rev(nums,k, nums.length-1);
		return nums;
		
		
	}
	private static void rev(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		while(start<end) {
			int temp = nums[start];
//			System.out.println(temp);
			nums[start]=nums[end];
//			System.out.println(start);
//			System.out.println(end);
			nums[end]=temp;
//			System.out.println(temp);
			start++;
//			System.out.println(start);
			end--;
//			System.out.println(end);
			
		}
		
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		int[] result = rotate(nums,k);
		System.out.println(Arrays.toString(nums));
	}

}
