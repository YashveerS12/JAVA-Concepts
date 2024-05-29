import java.util.*;
public class largest {
    public static int maximum(int num[])
    {
        int max=num[0];
        for(int i=0;i<num.length;i++)
        {
            if(max<num[i])
            {
                max=num[i];
            }

        }
        return max;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num[]=new int[10];
        int n;
        System.out.println("Enter the number of elements you want");
        n=sc.nextInt();
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }
        int c=maximum(num);
        System.out.println("The largest element is: ");
        System.out.print(c);
    }
}
