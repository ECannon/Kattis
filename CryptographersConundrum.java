import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

public class CryptographersConundrum 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        String inputString = sc.nextLine();

        int counter = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

            int j = i % 3;

            switch (j) 
            {
                case 0:
                    if (c != 'P') counter++;
                    break;
                case 1:
                    if (c != 'E') counter++;
                    break;
                case 2:
                    if (c != 'R') counter++;
                    break;
                default:
                    break;
            }
        }
        System.out.println(Integer.toString(counter));
    }
}