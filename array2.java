import java.util.*;
public class array2 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int arr[][]=new int[5][5];
        int n=3;
        int m=3;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
               if(largest<arr[i][j])
               {
                largest=arr[i][j];
               }
            }
        }
        System.out.println(largest);

    }
}

