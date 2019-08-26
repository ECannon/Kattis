import java.util.*;

public class DifferentDistances {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			String s1 = sc.nextLine();
			if (s1.equals("0"))
				break;
			String[] ar1 = s1.split(" ");

			double x1 = Double.parseDouble(ar1[0]);
			double y1 = Double.parseDouble(ar1[1]);
			double x2 = Double.parseDouble(ar1[2]);
			double y2 = Double.parseDouble(ar1[3]);
			double p = Double.parseDouble(ar1[4]);

			double p1 = Math.abs(x1 - x2);
			double p2 = Math.abs(y1 - y2);

			System.out.println(Math.pow((Math.pow(p1, p) + Math.pow(p2, p)), 1 / p));
		}

	}

}
