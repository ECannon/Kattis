import java.util.*;

public class CharacterDevelopment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        
                
        int n = sc.nextInt();
        
        System.out.println((int)Math.pow(2, n) - n - 1);
    }
}