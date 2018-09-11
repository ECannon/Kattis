import java.util.*;

public class RaggedRight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int maxLength = 0;
        int total = 0;
        ArrayList<String> ar1 = new ArrayList<String>();
        
        while(sc.hasNext())
        {
            String s1 = sc.nextLine();
            if(s1.length() > maxLength) maxLength = s1.length();
            ar1.add(s1);
        }
        
        for(int i = 0; i < ar1.size()-1; i++)
        {
            if(ar1.get(i).length() < maxLength)
            {
                total += (maxLength - ar1.get(i).length())*(maxLength - ar1.get(i).length());
            }
        }
        System.out.println(total);
    }
}