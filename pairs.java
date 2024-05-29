import java.util.*;
public class pairs {
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
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            System.out.print("("+num[i]+","+num[j]+")");
        }
        System.out.println();
    }
}
}
