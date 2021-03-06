
public class SumOfStrings {
	
	public static String addString(String num1, String num2) {
		StringBuilder result = new StringBuilder();
		int i = num1.length() -1;
		int j = num2.length() -1;
		int carry = 0;
		while (i>-1 || j>-1) {
			int d1 = i>-1 ? num1.charAt(i) - '0' : 0;
			int d2 = i>-1 ? num2.charAt(j) - '0' : 0;
			int sum = d1+d2+carry;
			result.append(sum%10);
			carry = sum/10;
			i--;
			j--;
		}
		if(carry > 0 )
			result.append(carry);
		return result.reverse().toString();		
		
	}	
	
	public static void main (String args[]) {
		String num1 = "141";
		String num2 = "999";
		
		addString(num1,num2);
		System.out.println(addString(num1, num2));
		
		
		
		
	}

}
