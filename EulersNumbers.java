import java.util.*;

public class EulersNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double d = 1;
		double n2 = 1;

		for (int i = 1; i <= n; i++) {

			d += n2 *=  1d / i;
		}

		System.out.println(d);
	}

	public static int factorial(int n) {

		for (int i = n - 1; i > 0; i--) {

			n = n * i;

		}

		return n;

	}

}
