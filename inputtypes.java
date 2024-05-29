import java.util.*;
public class inputtypes {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        /*
         String yash =sc.next();
         ****** for only single word  *********
          */
           String yash =sc.nextLine();
        System.out.println(yash);

        int num=sc.nextInt();
        System.out.println(num);

        float price = sc.nextFloat();
        System.out.println(price);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("The sum is: ");
        System.out.println(a+b);

    }
    
}
