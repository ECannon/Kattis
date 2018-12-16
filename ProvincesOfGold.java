import java.util.*;

public class ProvincesOfGold {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int gold = Integer.parseInt(sc.next());
		int silver = Integer.parseInt(sc.next());
		int copper = Integer.parseInt(sc.next());
		int buyingPower = gold*3 + silver*2 + copper *1;
		
		boolean check = false;
		if(buyingPower >= 8) {
			System.out.print("Province");
			check = true;
		} else if(buyingPower >= 5) {
			System.out.print("Duchy");
			check = true;
		} else if (buyingPower >= 2) {
			System.out.print("Estate");
			check = true;
		}
		
		if(check) System.out.print(" or ");
		
		if(buyingPower >= 6) System.out.print("Gold");
		else if (buyingPower >= 3) System.out.println("Silver");
		else System.out.println("Copper");

	}

}
