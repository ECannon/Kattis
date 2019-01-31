import java.util.*;

public class PigLatin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Character> vowels = new ArrayList<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('y');

		while(sc.hasNextLine()) {
				
			String[] ar1 = sc.nextLine().split(" ");
			
			for(int i = 0; i < ar1.length; i++) {
				
				if(vowels.contains(ar1[i].charAt(0))) {
					ar1[i] = ar1[i]+"yay";
				} else {
					
					int index = -1;
					for(int j = 0; j < ar1[i].length(); j++) {
						if(vowels.contains(ar1[i].charAt(j))) {
							index = j;
							break;
						}
					}
					
					ar1[i] = ar1[i].substring(index)+ ar1[i].substring(0, index) + "ay";
				}
				
			}
			
			for(int i = 0; i < ar1.length; i++) {
				System.out.print(ar1[i]+ " ");
			}
			System.out.println();
		}
	}

}
