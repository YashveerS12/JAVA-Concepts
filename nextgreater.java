import java.util.*;
public class nextgreater {
    public static void nextgreater(int arr[])
    {
        int ar[]=new int[5];
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(arr[i]<arr[j])
                {
                    ar[i]=arr[j];
                    break;
                }
            }
        }
        ar[5-1]=-1;

        for(int i=0;i<5;i++)
       {
    System.out.print(ar[i]+" ");
     }

    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of elements you want in array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        nextgreater(arr);
    }
}
