import java.util.*;

public class Sjecista {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println((n*(n-1)*(n-2)*(n-3))/24);
	}

}
