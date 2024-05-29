import java.util.Arrays;
import java.util.Comparator;

class oops {
    public static void main(String args[]) {
         double ratio[][]={{0,6},{1,5},{2,4}};
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        // for(int i=0;i<ratio.length;i++)
        // {
            // for(int j=0;j<ratio[0].length;i++)
            // {
                // System.out.println(ratio[i][j]);
            // }
        // }
        System.out.println((int)ratio[0][0]);
        
    }
}