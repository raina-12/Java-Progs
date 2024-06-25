import java.util.*;
public class Marks 
{
   public static void main(String args[]) 
   {
    int input;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your marks");
    
    do {
        
        int marks = sc.nextInt();

        if (marks >= 75 && marks <= 100) 
               System.out.println("Mama Mia!");
        else if(marks >= 50 && marks <= 74) 
               System.out.println("Voila!");
        else if(marks >= 0 && marks <= 49) 
               System.out.println("Gwenchana :):");
        else
            System.out.println("Invalid");

        
        System.out.println("click 1 to continue or 0 to stop");
        input = sc.nextInt();

       } while(input == 1);
       sc.close();
   }   
}


