import java.util.*;
public class tree {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildtree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node temp=new Node(nodes[idx]);
            temp.left=buildtree(nodes);
            temp.right=buildtree(nodes);
            return temp;
        }
    }
    public static void level(Node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node temp=q.remove();
            if(temp==null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.println(temp.data+" ");
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }
        }
    }
    public static int sum(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int l=sum(root.left);
        int r=sum(root.right);
        return l+r+root.data;

    }
    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data+" ");

    }
    public static void main(String args[])
    {
        BinaryTree tree= new BinaryTree();
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root= tree.buildtree(nodes);
       // System.out.println(root.right.data);
        //preorder(root);
        //level(root);
        System.out.println(sum(root));
    }
}
