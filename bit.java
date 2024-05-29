import java.util.*;
public class bit {
    public static int get(int n,int i){
        int x=1<<i;
        if((n&x)==0)
        {
            return 0;
        }
        else{
            return 1;
        }

    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        //int n=sc.nextInt();
        System.out.println(get(67,5));
    }
}
