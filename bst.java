import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data)
    {
        this.data=data;
        
    }
}
class Info{
    boolean isBst;
    int size;
    int min;
    int max;
    public Info(boolean isBst,int size,int min,int max)
    {
        this.isBst=isBst;
        this.size=size;
        this.min=min;
        this.max=max;
    }
}
public class  bst {
    public static void path(Node root,ArrayList<Integer> arr,ArrayList<ArrayList<Integer>> main)
    {
        if(root==null)
        {
            return ;
        }
        arr.add(root.data);
        if(root.left==null && root.right==null)
        {
        //  print(arr);
        main.add(arr);
        }
        path(root.left,arr,main);
        path(root.right,arr,main);
        arr.remove(arr.size()-1);
    }
    public static void print(ArrayList<Integer> arr)
    {
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i));
        }
        System.out.println();
    }

    public static Node insert(Node root,int val)
    {
        if(root==null)
        {
            root=new Node(val);
            return root;
        }
        if(val<root.data)
        {
           root.left= insert(root.left,val);
        }
        else{
            root.right= insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static int maxBST=0;
    public static Info largestBst(Node root)
    {
        if(root==null)
        {
            return  new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info leftInfo=largestBst(root.left);
        Info rightInfo=largestBst(root.right);
        int size=leftInfo.size+rightInfo.size+1;
        int min=Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max=Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));
        if(root.data<=leftInfo.max || root.data>rightInfo.min)
        {
            return new Info(false,size,min,max);
        }
        if(leftInfo.isBst && rightInfo.isBst)
        {
            maxBST=Math.max(maxBST,size);
            return new Info(true,size,min,max);
        }
        return new Info(false,size,min,max);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<arr.length;i++)
        {
            root=insert(root,arr[i]);
        }
        // inorder(root);
        // System.out.println(root.left.right.left.data);
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<ArrayList<Integer>> main=new ArrayList<>();
       // path(root,arr1,main);
       //System.out.println(main.get(0).get(0));
       Node root1=new Node(50);
       root1.left=new Node(30);
       root1.right=new Node(60);
       root1.left.left=new Node(5);
       root1.left.right=new Node(20);
       root1.right.left=new Node(45);
       root1.right.right=new Node(70);
       root1.right.right.right=new Node(80);
       root1.right.right.left=new Node(65);
       largestBst(root1);
       System.out.println(maxBST);

    }
}
