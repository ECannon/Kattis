import java.util.*;

public class BaconEggsAndSpam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TreeMap<String, String> map = new TreeMap<String, String>();

		while (true) {
			map.clear();
			int n = Integer.parseInt(sc.nextLine());
			if (n == 0)
				break;

			for (int i = 0; i < n; i++) {

				String s1 = sc.nextLine();
				String[] ar1 = s1.split(" ");

				for (int j = 1; j < ar1.length; j++) {

					if (!map.containsKey(ar1[j])) {

						map.put(ar1[j], ar1[0] + " ");

					} else {
						map.put(ar1[j], map.get(ar1[j]) + ar1[0] + " ");
					}

				}

			}

			for (String i : map.keySet()) {
				String[] sorted = map.get(i).split(" ");
				Arrays.sort(sorted);
				String s2 = "";
				for (int j = 0; j < sorted.length; j++) {
					s2 += sorted[j] + " ";

				}
				System.out.println(i + " " + s2);
			}
		}

	}

}
