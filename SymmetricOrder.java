import java.util.*;
public class SymmetricOrder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		int setNum = 1;
		
		while(n != 0) {
			
			ArrayList<String> ar1 = new ArrayList<String>();
			ArrayList<String> ar2 = new ArrayList<String>();
			
			for(int i = 0; i < n; i++)
				ar1.add(sc.nextLine());
				
			for(int i = 1; i < ar1.size(); i+=2) {
				ar2.add(ar1.get(i));
			}
			
			for(int i = 1; i < ar1.size(); i+=2) {
				ar1.remove(ar1.get(i));
				i--;
			}
			
			System.out.println("SET " + setNum);
			
			for(int i = 0; i < ar1.size(); i++) {
				System.out.println(ar1.get(i));
			}
			for(int i = ar2.size()-1; i >= 0; i--) {
				System.out.println(ar2.get(i));
			}

			n = Integer.parseInt(sc.nextLine());
			setNum++;

		}
		
		
	}

}
