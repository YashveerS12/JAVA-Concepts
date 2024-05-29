import java.util.*;
public class linearsearch {
    public static int searching (int num[],int key)
    {
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==key)
            {
                return i;
            }

        }
        return -1;

    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num[]=new int[10];
        int n;
        System.out.println("Enter the number of elements you want: ");
        n=sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("Enter the key element: ");
        int key=sc.nextInt();
        int index=searching(num,key);
        System.out.println(index+1);


    }
}
