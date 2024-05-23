import java.util.*;
public class Arrevesum
{
   public static void main (String[]args)
   {
     int n, i;
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter n: ");
     n = sc.nextInt();    
     int a []= new int [n];
     System.out.println("Enter the array: ");

     for (i=0; i<n; i++)
     {
       a[i] = sc.nextInt();
     }

     int sum1 = 0;
     for (i=0; i<n; i++)
     {
       if (i%2==0)
       {
        sum1 = sum1 + a[i];
       }
     }
     System.out.println("The sum of elements at even indexes = "+sum1);

     int sum2 = 0;
     for (i=0; i<n; i++)
     {
       if (i%2!=0)
       {
        sum2 = sum2 + a[i];
       }
     }
     System.out.println("The sum of elements at even positions = "+sum2);

     int sum3 = 0;
     for (i=0; i<n; i++)
     {
       if (a[i]%2==0)
       {
        sum3 = sum3 + a[i];
       }
     }
     System.out.println("The sum of even elements = "+sum3);
     
     sc.close();
   } 
}
