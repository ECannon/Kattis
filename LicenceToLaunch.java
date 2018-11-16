import java.util.*;

public class LicenceToLaunch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] ar1 = new int[n];
		int min = 1000000000;
		int index = 0;

		for (int i = 0; i < ar1.length; i++) {

			ar1[i] = sc.nextInt();

			if (ar1[i] < min) {
				min = ar1[i];
				index = i;
			}

		}

		System.out.println(index);
	}

}
