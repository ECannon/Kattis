import java.util.*;
import java.math.*;

public class SimpleAddition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.nextLine();
        
        BigInteger num1 = new BigInteger(s1);
        s1 = sc.nextLine();
        BigInteger num2 = new BigInteger(s1);
        
        num2 = num2.add(num1);
        
        System.out.println(num2);
    }
}