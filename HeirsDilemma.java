import java.util.Scanner;

public class HeirsDilemma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int L = Integer.parseInt(sc.next());
		int H = Integer.parseInt(sc.next());
		
		int count = 0;
		
		for(int i = L; i <= H; i++) {
			boolean flag = true;
			String s1 = Integer.toString(i);
			
			if(s1.contains("0"))
				flag = false;
			else if(!checkDifferent(s1))
				flag = false;
			else {
				char[] ar1 = s1.toCharArray();
				for(int j = 0; j < 6; j++) {
					if(i % Integer.parseInt(ar1[j]+"") != 0) {
						flag = false;
						break;
					}
				}
			}
			
			if(flag)
				count++;	
		}
		
		System.out.println(count);
		
	}
	
	public static boolean checkDifferent(String s1) {
		for(int i = 0; i < s1.length(); i++) {
			for(int j = i+1; j < s1.length(); j++) {
				if(s1.charAt(i) == s1.charAt(j))
					return false;
			}
		}
		
		return true;
	}

}
