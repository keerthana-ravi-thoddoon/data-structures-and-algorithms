import java.util.Arrays;

public class UniqueCharacter {
	
	
    public static int firstUniqChar(String s) {
        int[] freq = new int [26];
          for (int i=0;i<s.length();i++)
          freq[s.charAt(i) -'a']++;
          for (int i=0;i<s.length(); i++)
          if(freq[s.charAt(i)-'a'] == 1)
              return i;
          return -1;
          
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "livelife";
		
		 int result=firstUniqChar(s);
		 System.out.println(result);
		
		
	}

}
