import java.util.Scanner;

public class ReversedBinaryNumbers 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        String s1 = Integer.toBinaryString(num1);
        
        String s2 = new String();
        for(int i =s1.length()-1;i>=0;i--)
        {
            s2 = s2 + s1.charAt(i);
        }
        int result = Integer.parseInt(s2,2);
        System.out.println(result);
    }
}