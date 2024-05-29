
import java.util.*;

public class greedy {
    public static void main(String args[])
    {
        int cv[]={4,3,2,1,1};
        int ch[]={4,2,1};
        int h=0,v=0;
        int hp=1;
        int vp=1;
        int c=0;
        while(h<ch.length && v<cv.length)
        {
            if(ch[h]>=cv[v])
            {
                c+=ch[h]*vp;
                hp++;
                h++;
            }
            else{
                c+=cv[v]*hp;
                vp++;
                v++;
            }
        }
        while(h<ch.length)
        {
            c+=ch[h]*vp;
            hp++;
            h++;
        }
        while(v<cv.length)
        {
            c+=cv[v]*hp;
            vp++;
            v++;
        }
        System.out.println(c);
    }
}
