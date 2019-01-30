import java.util.*;
public class CollatzConjecture {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Long> ar1 = new ArrayList<Long>();
		ArrayList<Long> ar2 = new ArrayList<Long>();
		
		while(true) {
			
		
			long num1 = sc.nextInt();
			long num2 = sc.nextInt();
			
			if(num1==0 && num2==0) break;
			
			ar1 = getArray(num1);
			ar2 = getArray(num2);
			
			int min = Math.min(ar1.size(), ar2.size());
			long n = 0;
			
			for(int i = 0; i < min; i++) {
				
				if(ar2.contains(ar1.get(i))) {
					
					n = ar1.get(i);
					break;
				}
				if(ar1.contains(ar2.get(i))) {
					
					n = ar2.get(i);
					break;
				}
			}
			
			int num1Steps = ar1.indexOf(n);
			int num2Steps = ar2.indexOf(n);
			
			System.out.println(num1+" needs " +num1Steps +" steps, "+num2+" needs "+num2Steps+" steps, they meet at "+n);
		}

	}
	
	public static ArrayList<Long> getArray(long n) {
		
		ArrayList<Long> ar1 = new ArrayList<Long>();
		ar1.add(n);
		
		while(n>1) {
			
			if(n%2==0) {
				n=n/2;
			} else {
				n=(n*3)+1;
			}
			
			ar1.add(n);
		}
		
		return ar1;

	}
}
