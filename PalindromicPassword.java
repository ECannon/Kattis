import java.util.Scanner;

public class PalindromicPassword
{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		
		for(int i = 0; i < cases; i++) {
			int n = sc.nextInt();
			
			
					
				int low = n;
				int high = n;
				
				while(true) {
					
					if(isPalindrome(String.valueOf(low))) {
						System.out.println(low);
						break;
					} else if (isPalindrome(String.valueOf(high))) {
						System.out.println(high);
						break;
					}
					
				if(low != 100000) {
					low--;
				}
				if(high != 999999 ) {
					high++;
				}
				}
			
			
			
		}

	}
	
	public static boolean isPalindrome(String s1) {
		
		String s2 = "";
		for(int i = s1.length()-1; i >= 0; i--)
			s2+=s1.charAt(i);
		
		if(s1.equals(s2)) return true;
		else return false;
		
	}
	
	
	

}
