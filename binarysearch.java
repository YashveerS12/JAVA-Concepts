import java.util.*;
public class binarysearch {
    public static int binary(int num[],int key)
    {
        int start=0;
        int end=num.length-1;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(num[mid]==key)
            {
                return mid;
            }
            else if(num[mid]<key)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
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
        int c=binary(num,key);
        System.out.println(c);
    }
    
}
