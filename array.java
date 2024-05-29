import java.util.*;
public class array {
    public static void search(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
         ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            int start=i;
            for(int j=0;j<nums.length;j++)
            {
                int end=j;
                for(int k=start;k<=end;k++)
                {
                    System.out.println(arr.add(nums[k]));
                    
                }

                
            }
        }
        //System.out.println(arr1);
    }
    public static void main(String args[]){
       /*  Scanner sc= new Scanner(System.in);
        int marks[]=new int[50];
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("Marks of physics: "+marks[0]);
        System.out.println("Marks of Math: "+marks[1]);
        System.out.println("Marks of chemistry: "+marks[2]);
        System.out.println("Lenght of array is: "+marks.length);*/
        int nums[]={1,2,3,4,5,6,7};
        search(nums);


    }
}
