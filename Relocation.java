import java.util.*;

public class Relocation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numComp = sc.nextInt();
		int req = sc.nextInt();
		
		int[] ar1 = new int[numComp];
		
		for(int i = 0; i < numComp; i++) {
			ar1[i] = sc.nextInt();
		}
		
		for(int i = 0; i < req; i++) {
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();

			
			if(num1 == 1) {
				ar1[num2-1] = num3;
			} else {
				System.out.println(Math.abs(ar1[num2-1] - ar1[num3-1]));
			}
			
		}
	}

}
