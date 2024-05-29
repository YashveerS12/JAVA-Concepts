import java.util.*;
public class functions {

    public static void hello()
    {
        System.out.println("Hello World");
    }

    public static int sum(int a,int b)
    {
        int s=a+b;
        return s;
    }
    public static void swap(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.print("The value of a is: "+a+" and b is: "+b);

    }
    public static void factorial()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x=sc.nextInt();
        int fact=1;
        for(int i=1;i<=x;i++)
        {
            fact=fact*i;

        }
        System.out.println("The factorial is: "+fact);

    }
   public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter the numbers: ");
        //int a=sc.nextInt();
        //int b=sc.nextInt();
        //int c=sum(a,b);

        //hello();

        //System.out.print("The sum is: "+c);
        //swap(a,b);
        factorial();

    }
    
}
