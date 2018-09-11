import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class WhatDoesTheFoxSay 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
                
        int cases = Integer.parseInt(sc.nextLine());
        
        for(int i =1;i<=cases;i++)
        {
            ArrayList<String> result = new ArrayList<String>();
            String noises = sc.nextLine();
            String[] ar1 = noises.split(" ");
            
            for(int x=0;x<ar1.length;x++)
            {
                result.add(ar1[x]);
            }
            
            int count=result.size()-1;
            String s1 = new String();
            
            do
            {
                s1 = sc.nextLine();
                int lastSpace = s1.lastIndexOf(" ")+1;
                
                if(result.contains(s1.substring(lastSpace)))
                {
                    result.removeAll(Collections.singleton(s1.substring(lastSpace)));
                    
                }
                
            }while(!s1.equals("what does the fox say?"));
            
            for(int k =0;k<result.size();k++)
            {
                System.out.println(result.get(k) + " ");
            }   
        }
    }
}
