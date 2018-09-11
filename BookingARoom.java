import java.util.*;
import java.math.BigInteger;
import java.io.*;

public class BookingARoom {
    
     public static void main(String[] args){
         

         Scanner sc = new Scanner(System.in);
         
         int rooms = sc.nextInt();
         int booked = sc.nextInt();
         
         int [] ar1 = new int[rooms];
         
         int j =1;
         for(int i = 0; i<ar1.length;i++)
         {
             ar1[i] = j; 
             j++;
         }
         
         for(int i = 1; i <= booked; i++)
         {
             int n = sc.nextInt();
             ar1[n-1] = 0; 
         }
         
         boolean empty = true;
         for(int i = 0; i <ar1.length; i++)
         {
             if(ar1[i] != 0)
             {
                 empty = false;
                 System.out.println(ar1[i]);
                 break;
             }        
         }        
         if(empty)
         {
             System.out.println("too late");
         }
     }        
}