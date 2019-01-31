import java.util.*;
public class JanitorTroubles {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double d = sc.nextInt();
		double s = (a+b+c+d)/2;
		
		double maxArea = Math.sqrt((s-a)*(s-b)*(s-c)*(s-d));
		System.out.println(maxArea);

	}

}
