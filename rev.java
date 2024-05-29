import java.util.*;
public class rev{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int arr[]={1,1,2,3,3,4,4,8,8,};
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==arr[mid+1] ||arr[mid]==arr[mid-1])
            {
                if((end-mid)%2==0)
                {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                System.out.println(arr[mid]);
            }
        }

}
}
