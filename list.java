import java.util.*;
public class list {
    public static boolean max(ArrayList<Integer> height,int target){
        int bp=-1;
        for(int i=0;i<height.size();i++)
        {
            if(height.get(i)>height.get(i+1));
            {
                bp=i;
                break;
            }
        }
        
        int lp=bp+1;
        int rp=bp;
        int n=height.size();
        while(lp!=rp)
        {
            if(height.get(lp)+height.get(rp)==target)
            {
                return true;
            }
            else if(height.get(lp)+height.get(rp)<target)
            {
                lp=(lp+1)%n;
            }
            else{
                 rp=(n+rp-1)%n;

            }
        }
    
        return false;
    }
    public static void main(String args[])
    {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(6);
         height.add(7);
          height.add(8);
           height.add(9);
            height.add(1);
             height.add(2);
              height.add(3);
               height.add(4);
                height.add(5);
                System.out.println(max(height,19));


    }
}
