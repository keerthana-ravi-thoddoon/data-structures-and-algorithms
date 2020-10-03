import java.util.*; 
class CheckStringPermutation { 

static boolean isPermutation(String str1, String str2, String str3) 
{ 
 
	int n1 = str1.length(); 
	int n2 = str2.length(); 
	if (n1 != n2) 
	return false; 
	char ch1[] = str1.toCharArray(); 
	char ch2[] = str2.toCharArray(); 
	char ch3[] = str3.toCharArray(); 
	Arrays.sort(ch1); 
	Arrays.sort(ch2); 
	Arrays.sort(ch3); 
	for (int i = 0; i < n1; i++) 
	if (ch1[i] != ch2[i]) 
		return false; 

	return true; 
} 
public static void main(String[] args) 
{ 
	String str1 = "meet"; 
	String str2 = "teem"; 
	String str3 = "mete";
	if (isPermutation(str1, str2, str3)) 
	System.out.println("Yes"); 
	else
	System.out.println("No"); 

} 
} 
