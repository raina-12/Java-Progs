import java.util.*;

public class Varrays 
{
    public static void main(String[] args) 
    {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        n = sc.nextInt();

        int a []= new int[100];
        int b []= new int[100];
        int c []= new int[100];

       
        System.out.println("the even numbers which go until "+n);
        for(i=0; i<n; i++)
        {
            if(i*2<=n)
            {
                a[i]=i*2;   
                System.out.print(a[i] + "\n");  
            } 
        }
        System.out.println("\n");

        System.out.println("the numbers which are divisible by 5 go until "+n);
        for(i=0; i<n; i++)
        {
            if(i*5<=n)
            {
                b[i]=i*5;   
                System.out.print(b[i] + "\n");  
            } 
        }
        System.out.println("\n");

        System.out.println("the odd numbers which go until "+n);
        for(i=0; i<n; i++)
        {
            if(i*2<n)
            {
                a[i]=(i*2)+1;   
                System.out.print(a[i] + "\n");  
            } 
        }
        System.out.println("\n");

        System.out.println("the square of numbers which go until "+n);
        for (i=0; i<n; i++)
        {
            a[i]=i*i;
            System.out.println(a[i]);
        }
        System.out.println("\n");

        System.out.println("the power of numbers which go until "+n);
        for (i=1; i<n; i++)
        {
            a[i]= 
            System.out.println(a[i]);
        }
        System.out.println("\n");


        }
}
