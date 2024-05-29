import java.util.*;
public class rev2 {
    static class Node{
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
    static class BinaryTree{
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

    public static void main(String args[])
    {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int nodes1[]={2,4,-1,-1,5,-1,-1};
        //BinaryTree bt1=new BinaryTree();
        BinaryTree bt= new BinaryTree();

        //Node root1=bt1.buildtree(nodes1);
        Node root= bt.buildtree(nodes);

        System.out.println(root.data);
     //System.out.println(subtree(root,root1));
    }
    
}
