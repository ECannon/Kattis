import java.util.Scanner;

public class Pet 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        int [][] ar1 = new int[5][4];
        int temp = 0;
        int total=0;
        
        int row=0;
        
        for(int i =0;i<ar1.length;i++)
        {
            for(int j =0;j<ar1[i].length;j++)
            {
                ar1[i][j] = sc.nextInt();
                temp = temp+ar1[i][j];
            }
            if(temp>total)
            {
                total=temp;
                row=i+1;
            }
            temp=0;
        }
        System.out.println(row +" "+ total);
    } 
}