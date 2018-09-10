import java.util.Scanner;

public class Sibice 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int numMatches = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();
        int diagonal = (int)Math.sqrt((width*width)+(height*height));
        
        for(int i = 1; i <= numMatches; i++)
        {
            int matchLength = sc.nextInt();
            if(matchLength > diagonal)
            {
                System.out.println("NE");
            }
            else
            {
                System.out.println("DA");
            }
        }
    }
}