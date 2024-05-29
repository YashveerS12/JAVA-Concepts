public class backtracking {
    public static void print(String str,String ans,int i)
    {
        if(i==str.length())
        {
            System.out.println(ans);
            return;
        }
        if(isConsonant(str.charAt(i)))
        {
            print(str," "+str,i+1);
        }
    
        print(str,ans,i+1);
        
    

    }
    public static boolean isConsonant(char c) {
        return !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') && Character.isLetter(c);
    }
    public static void main(String args[])
    {
       String str="bac";
       print(str,"",0);
      
    }
}
