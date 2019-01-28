import java.util.*;

public class Skocimis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println(Math.max(num2-num1, num3-num2)-1);

	}

}
