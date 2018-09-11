import java.util.*;

public class AlphabetSpam {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        int white = 0;
        int lower = 0;
        int upper = 0;
        int symbols = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '_')
            {
                white++;
            }
            else if(s.substring(i,i+1).matches("[A-Z]"))
            {
                upper++;
            }
            else if(s.substring(i,i+1).matches("[a-z]"))
            {
                lower++;
            }
            else
            {
                symbols++;
            }
        }
        System.out.println((double)white/s.length());
        System.out.println((double)lower/s.length());
        System.out.println((double)upper/s.length());
        System.out.println((double)symbols/s.length());
    }
}