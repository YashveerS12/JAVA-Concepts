import java.util.*;
public class sumofsubarray {
    public static void MaxSumofSubarry(int num[])
    {
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++)
        {
            int start=i;
            for(int j=i;j<num.length;j++)
            {
                int end=j;
                sum=0;
                for(int k=start;k<=end;k++)
                {
                    sum=sum+num[k];

                }
                System.out.println(sum);
                if(maxsum<sum)
                {
                    maxsum=sum;
                }
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String args[])
    {

        
            Scanner sc= new Scanner(System.in);
            int num[]=new int[5];
            int n;
            System.out.println("Enter the number of elements: ");
            n=sc.nextInt();
            System.out.println("Enter the elements: ");
            for(int i=0;i<n;i++)
            {
                num[i]=sc.nextInt();
            }
            MaxSumofSubarry(num);

    }
}
