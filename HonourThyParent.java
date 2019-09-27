import java.util.*;
public class HonourThyParent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String y = s.substring(0, s.indexOf(' '));
        String p = s.substring(s.indexOf(' ')+1);

        if(y.endsWith("e")) {
            System.out.println(y + "x" + p);
        } else if(y.endsWith("a") || y.endsWith("e") || y.endsWith("i") || y.endsWith("o") || y.endsWith("u")) {
            y = y.substring(0, y.length()-1);
            y = y + "ex";
            System.out.println(y + p);

        } else if(y.endsWith("ex")) {
            System.out.println(y + p);
        } else {
            System.out.println(y + "ex" + p);
        }
    }
}
