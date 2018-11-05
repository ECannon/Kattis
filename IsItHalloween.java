import java.util.Scanner;

public class IsItHalloween {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		
		if(s1.equals("OCT 31") || s1.equals("DEC 25")) {
			System.out.println("yup");
		}
		else {
			System.out.println("nope");
		}
		
	}

}
