import java.util.*;

public class OneChickenPerPerson {
	
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int people = sc.nextInt();
        int chicken = sc.nextInt();
        
        if(chicken-people == 1)
        {
            System.out.println("Dr. Chaz will have "+(chicken-people)+" piece of chicken left over!");  
        }
        else if(people - chicken == 1)
        {
            System.out.println("Dr. Chaz needs "+ (people-chicken)+" more piece of chicken!");
        }
        else if(people < chicken)
        {
            System.out.println("Dr. Chaz will have "+(chicken-people)+" pieces of chicken left over!");
        }
        else
        {
            System.out.println("Dr. Chaz needs "+ (people-chicken)+" more pieces of chicken!");
        }
    }
}