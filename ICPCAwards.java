import java.util.*;

public class ICPCAwards {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int teams = Integer.parseInt(sc.nextLine());
        
        ArrayList<String> list1 = new ArrayList<String>();
        
        for(int i  = 0; i < teams; i++)
        {
            list1.add(sc.nextLine());
        }
        
        for(int i = 0; i < list1.size(); i++)
        {
            String s1 = list1.get(i).substring(0, list1.get(i).indexOf(' '));
            
            for(int j = i+1; j<list1.size()-1;j++)
            {
                if(list1.get(j).startsWith(s1))
                {
                    list1.remove(j);
                }
            }
        }
        
        for(int i = 0; i < list1.size(); i++)
        {
            String s1 = list1.get(i).substring(0, list1.get(i).indexOf(' '));
            
            for(int j = i+1; j<list1.size();j++)
            {
                if(list1.get(j).startsWith(s1))
                {
                    list1.remove(j);
                }
            }
        }
        
        for(int i = 0; i < list1.size(); i++)
        {
            String s1 = list1.get(i).substring(0, list1.get(i).indexOf(' '));
            
            for(int j = i+1; j<list1.size();j++)
            {
                if(list1.get(j).startsWith(s1))
                {
                    list1.remove(j);
                }
            }
        }
        
        for(int i = 0; i < 12; i++)
        {
            System.out.println(list1.get(i));
        }
    }
}