public class string1 {
    public static void print(String str)
    {
        System.out.println(str);
    }
    public static void addSpace(String str,int i)
    {
        StringBuilder sb=new StringBuilder("");
       sb.append(" ");
      for(int j=i;j<str.length();j++)
      {
        sb.append(str.charAt(j));
      }
      System.out.println(sb);
    }
    public static boolean isConsonant(char c) {
        c = Character.toLowerCase(c);
        return !(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') && Character.isLetter(c);
    }
    public static void main(String args[])
    {
        String str="BAC";
        for(int j=0;j<str.length();j++)
        {
            int i=j;
        while(i<str.length())
        {
            if(isConsonant(str.charAt(i)))
            {
             addSpace(str,i);
           
            }
            if(!isConsonant(str.charAt(i)))
            {
                break;
            }
            i++;
        }
    }

        
    }    
}
