import java.util.Scanner;

public class BabyBites {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		boolean flag = true;
		
		for(int i = 1; i <= n; i++) {
			
			String s1 = sc.next();
			
			if(!s1.equals("mumble")) {
				if(Integer.parseInt(s1) != i)
					flag = false;
				
			}
		}
		
		if(flag) 
			System.out.println("makes sense");
		else
			System.out.println("something is fishy");
	}

}
