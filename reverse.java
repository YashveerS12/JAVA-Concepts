import java.util.*;
public class reverse {
    public static void reverse(int num[])
    {
        int start=0;
        int last=num.length-1;
        while(start<last)
        {
            int temp;
            temp=num[start];
            num[start]=num[last];
            num[last]=temp;
            start++;
            last--;
        }
        for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int num[]=new int[10];
        int n;
        System.out.println("Enter the number of elements: ");
        n=sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }
        reverse(num);
    }
    
}
