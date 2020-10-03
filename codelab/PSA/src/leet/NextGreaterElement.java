
public class NextGreaterElement {
	
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            boolean found = false;
            int j=0;
            for(j=0;j<nums2.length;j++){
                if(found && nums1[i]<nums2[j]){
                   res[i] = nums2[j];
                   break;
                }
                if(nums1[i]==nums2[j]) found = true;
            }
            if(j==nums2.length) res[i]=-1;
        }
        return res;
    }
}


