import java.util.*;
public class LandC 
{
   public static void main (String[]args)
   {
     int n;
     System.out.println("enter n");
     Scanner sc = new Scanner(System.in);
     n=sc.nextInt();

     for (int i=0; i<4; i++)
     {
        if (n==1)
        {
            System.out.println("hehe");
        }
        if (n==3)
        {
            System.out.println("haha");
        }
        
     }
     System.out.println("oops nvm");
     sc.close();
   } 
}
