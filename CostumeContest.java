import java.util.*;

public class CostumeContest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Hashtable<String, Integer> map = new Hashtable<String, Integer>();
				
		int cases = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < cases; ++i) {
			String s1 = sc.nextLine();
			
			if(map.containsKey(s1)) {
				map.put(s1, map.get(s1)+1);
			} else {
				map.put(s1, 1);
			}
		}
		
		ArrayList<String> keys = new ArrayList<String>(map.keySet());
		ArrayList<Integer> values = new ArrayList<Integer>(map.values());
		
		for(int i=1;i<keys.size();i++) {
            for(int j =0;j<keys.size()-1;j++) {
                if(values.get(j) > values.get(j+1))
                {
                    Collections.swap(keys, j, j+1);
                    Collections.swap(values, j, j+1);
                }
            }
        }
		
		ArrayList<String> fin = new ArrayList<String>();
		
		fin.add(keys.get(0));
		
		for(int i = 1; i < keys.size(); i++) {
			
			if(values.get(i) == values.get(i-1)) {
				fin.add(keys.get(i));
			}
		}
		
		Collections.sort(fin);
		for(String i : fin) System.out.println(i);
		
	}

}
