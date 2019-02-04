import java.util.*;

public class Crne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextInt();

		if (n % 2 == 0) {
			n = n / 2 + 1;
			System.out.println(n * n);
		} else {
			System.out.println((n + 3) * (n + 1) / 4);
		}
	}

}
