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
class BinaryTree{
    static int idx = -1;
    public static Node buildtree(int nodes[])
    {
        idx++;
        if(nodes[idx]==-1)
        {
            return null;
        }
        else{
            Node temp=new Node(nodes[idx]);
            temp.left=buildtree(nodes);
            temp.right=buildtree(nodes);
            return temp;
        }
    }
}
public class priority {
    public static boolean subtree(Node root,Node subroot)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==subroot.data)
        {
            if(identical(root,subroot))
            {
                return true;
            }
        }
        return subtree(root.left,subroot)||subtree(root.right,subroot);
    }
    public static boolean identical(Node root,Node subroot)
    {
        if(root==null && subroot ==null)
        {
            return true;
        }
        else if(root==null || subroot ==null || root.data!= subroot.data)
        {
            return false;
        }
        if(!identical(root.left,subroot.left))
        {
            return false;
        }
        if(!identical(root.right,subroot.right))
        {
            return false;
        }
        return true;
    }
    public static void level(Node root,int l,int k)
    {
        if(root==null)
        {
            return;
        }
        if(l==k)
        {
            System.out.print(root.data+" ");
        }
        level(root.left,l+1,k);
        level(root.right,l+1,k);
    }

    public static void main(String args[])
    {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        Node root1=new Node(2);
        root1.left=new Node(4);
        root1.right=new Node(5);

     //System.out.println(subtree(root,root1));
     level(root,1,3);
    }
    
}
