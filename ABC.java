import java.util.*;

public class ABC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        int [] ar1 = new int[3];
        ar1[0] = sc.nextInt();
        ar1[1] = sc.nextInt();
        ar1[2] = sc.nextInt();
        sc.nextLine();
        
        ar1 = sortArray(ar1);
        
        map.put('A', ar1[0]);
        map.put('B', ar1[1]);
        map.put('C', ar1[2]);
        
        String s1 = sc.nextLine();
        
        for(int i = 0; i < 3; i++)
        {
            System.out.print(map.get(s1.charAt(i)) + " ");
        }

    }
    
     public static int[] sortArray(int[] ar1)
        {
            for(int i=1;i<ar1.length;i++)
            {
                for(int j =0;j<ar1.length-1;j++)
                {
                    if(ar1[j]>(ar1[j+1]))
                    {
                        int temp = ar1[j];
                        ar1[j] = ar1[j+1];
                        ar1[j+1] = temp;
                    }
                }
            }
            return ar1;
        }
}