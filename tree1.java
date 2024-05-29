import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data)
    {
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
public class tree1 {
    public static Node lowestcommon(Node root,int n,int m)
    {
        if(root==null || root.data==n||root.data==m)
        {
            return root;
        }
        Node left=lowestcommon(root.left,n,m);
        Node right=lowestcommon(root.right,n,m);
        if(left==null)
        {
            return right;
        }
        if(right==null)
        {
            return left;
        }
        return root;
    }
    public static boolean path(Node root,int k,ArrayList<Node> arr)
    {
        if(root==null)
        {
            return false;
        }
        arr.add(root);
        if(root.data==k)
        {
            return true;
        }
        boolean left=path(root.left,k,arr);
        boolean right=path(root.right,k,arr);
        if(left||right)
        {
            return true;
        }
        arr.remove(arr.size()-1);
        return false;

    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(4);
        root.right.right=new Node(7);
        root.right.left=new Node(6);
       // Node ans=lowestcommon(root,6,7);
       // System.out.println(ans.data);
        ArrayList<Node> arr=new ArrayList<>();
        path(root,6,arr);
       for(int i=0;i<arr.size();i++)
       {
        System.out.println(arr.get(i).data);
       }
    }
    
}
