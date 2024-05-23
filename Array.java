//ARRAY
import java.util.*;
class Array{ 
public static void main (String[]args){
    int n;
    System.out.println("enter n:");
    Scanner sc = new Scanner (System.in);
    n= sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter the array:");
    for (int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    for (int i=0;i<n;i++){
        System.out.print(a[i] + "\n");
    }
   
    int sum = a[1] + a[6];
    System.out.println("The sum of 2nd and 7th number is ="+sum);
    
    int product = a[3]*a[5];
    System.out.println("The product of 4th and 6th number is ="+product);

    System.out.println(a[0]+"\n"+a[2]+"\n"+a[4]+"\n"+a[7]);
    sc.close();
}
}



