import java.util.*;

public class PeaSoupAndPancakes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> restaurants = new ArrayList<String>();
        Set<String> temp = new HashSet<>();


        int numRestaurants = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < numRestaurants; i++) {
            int items = Integer.parseInt(sc.nextLine());
            String restName = sc.nextLine();
            temp.clear();

            for(int j = 0; j < items; j++) {
                String item = sc.nextLine();
                if(item.equals("pea soup") || item.equals("pancakes")) {
                    temp.add(item);
                    if(temp.size() == 2) {
                        restaurants.add(restName);
                        break;
                    }
                }

            }
        }

        if(restaurants.size() > 0) {
            System.out.println(restaurants.get(0));
        } else {
            System.out.println("Anywhere is fine I guess");
        }
    }
}
