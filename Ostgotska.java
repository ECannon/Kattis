import java.util.Scanner;

public class Ostgotska {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		int count = 0;
		
		String[] ar1 = s1.split(" ");
		
		for(int i = 0; i < ar1.length; i++) {
			if(ar1[i].contains("ae")) count++;
		}
		
		if(((double)count/ar1.length) >= 0.4) System.out.println("dae ae ju traeligt va");
		else System.out.println("haer talar vi rikssvenska");
		
		
	}

}