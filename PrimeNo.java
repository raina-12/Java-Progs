import java.util.*;
public class PrimeNo
{
    public static void main (String[] args)
    {
        int n, i, j=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        n = sc.nextInt();

        if(n==1||n==0)
        System.out.println(n+" is neither prime nor composite");

        for (i=1; i<=n; i++)
        {
            if(n%i==0)
            j++;
        }
        if (j>2)
        System.out.println(n + " is a composite number");
        
        if(j==2)
        System.out.println(n+" is a prime number");        
    }
}

