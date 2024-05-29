import java.util.Arrays;
public class Trapwater {
    public static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
              System.out.print(arr[i]+" ");
        }
    }
    /*public static void bubble(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printarray(arr);
    }*/
    public static void selection(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n-1;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        printarray(arr);

    }
    public static void insertion(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        printarray(arr);
    }
    public static void main(String args[])
    {
        int arr[]={4,3,5,11,6,1,2,8,9,7,10};
       
        //bubble(arr);
        //selection(arr);
        insertion(arr);


        
    }
}
