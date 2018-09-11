import java.util.*;

public class Mjehuric {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ar1 = new int[5];

        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = sc.nextInt();
        }

        for (int i = 1; i < ar1.length; i++) {
            for (int j = 0; j < ar1.length - 1; j++) {
                if (ar1[j] > (ar1[j + 1])) {
                    int temp = ar1[j];
                    ar1[j] = ar1[j + 1];
                    ar1[j + 1] = temp;

                    printArray(ar1);
                    System.out.println();
                }
            }
        }
    }

    public static void printArray(int[] ar1) {
        for (int i = 0; i < ar1.length; i++) {
            System.out.print(ar1[i] + " ");
        }
    }
}