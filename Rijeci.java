import java.util.*;

public class Rijeci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = 1;
		int b = 0;
		for (int i = 1; i <= n; i++) {
			int prevA = a;
			a = b;
			b = b + prevA;
		}
		System.out.println(a + " " + b);
	}
}