import java.util.*;

public class RoamingRomans {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		
		double convert = (double)5280/4854;
		double answer = x*((1000)*convert);
				
		String s1 = Double.toString(answer);
		
		if(Integer.parseInt(s1.charAt(s1.indexOf('.')+1)+"") >= 5)
		{
			System.out.println((int)Math.ceil(answer));
		}
		else
		{
			System.out.println((int)Math.floor(answer));
		}

	}

}
