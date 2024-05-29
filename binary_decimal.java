import java.util.*;
public class binary_decimal {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a binary code: ");
        int n=sc.nextInt();
        int Ld;
        int i=0;
        int Dec=0;
        /*Conversion of binary into decimal 
        while(n>0)
        {
            Ld=n%10;
            Dec= Dec + Ld*(int)Math.pow(2,i);
            n=n/10;
            i++;
            

        }*/
         //Conversion of Decimal into binary
        while(n>0)
         { 
         Ld=n%2;
         Dec= Dec + Ld*(int)Math.pow(10,i);
         n=n/2;
         i++;
    
         }
        System.out.println(Dec);
    }
}
