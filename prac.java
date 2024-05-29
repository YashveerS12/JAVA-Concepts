import java.util.*;

 class Node{
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
class Info{
    Node node;
    int hd;
    public Info(Node node,int hd)
    {
        this.node=node;
        this.hd=hd;
    }
}
class BinaryTree{
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
public class prac {
    public static void preorder(Node temp)
    {
        if(temp==null)
        {
            return;
        }
        System.out.println(temp.data);
        preorder(temp.left);
        preorder(temp.right);
       
    }
    public static void levelOrder(Node temp)
    {
        if(temp==null)
        {
            return ;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(temp);
        q.add(null);
        while(!q.isEmpty())
        {
            Node temp1=q.remove();
            if(temp1==null)
            {
                System.out.println(" ");
                if(q.isEmpty())
                {
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.println(temp1.data);
                if(temp1.left!=null)
                {
                    q.add(temp1.left);
                }
                if(temp1.right!=null)
                {
                    q.add(temp1.right);

                }
            }

        }

    }
    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static int dia(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=dia(root.left);
        int right=dia(root.right);

        int l=height(root.left);
        int r=height(root.right);
        int sub=l+r+1;
        return Math.max(sub,Math.max(left,right));
    }
    public static boolean isSubTree(Node root,Node subroot)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==subroot.data)
        {
            if(isIdentical(root,subroot))
            {
                return true;
            }
        }
        return isSubTree(root.left,subroot)||isSubTree(root.right,subroot);
    }
    public static boolean isIdentical(Node root,Node subroot)
    {
        if(root==null && subroot==null)
        {
            return true;
        }
        if(root==null || subroot ==null || root.data!=subroot.data){
            return false;
        }
        return isIdentical(root.left,subroot.left) && isIdentical(root.right,subroot.right);
    }
    public static void topview(Node root)
    {
        HashMap<Integer,Node> map=new HashMap<>();
        Queue<Info> q= new LinkedList<>();
        q.add(new Info(root,0));
        q.add(null);
        int max=0,min=0;

        while(!q.isEmpty())
        {
            Info curr=q.remove();
            if(curr==null)
            {
                if(q.isEmpty())
                {
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(curr.hd))
                {
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left!=null)
                {
                    q.add(new Info(curr.node.left,curr.hd-1));
                    min=Math.min(min,curr.hd-1);

                }
                if(curr.node.right!=null)
                {
                    q.add(new Info(curr.node.right,curr.hd+1));
                    max=Math.max(max,curr.hd+1);

                }
            }
        }
        for(int i=min;i<=max;i++)
        {
            System.out.print(map.get(i).data+" ");
        }
    }
    public static void kLevel(Node root,int level,int k)
    {
        if(root==null)
        {
            return;
        }
        if(level==k)
        {
            System.out.print(root.data+" ");
        }
        kLevel(root.left,level+1,k);
        kLevel(root.right,level+1,k);
    }
    public static boolean getPath(Node root,int n,ArrayList<Node> path)
    {
        if(root==null)
        {
            return false;
        }
        path.add(root);
        if(root.data==n)
        {
            return true;
        }
        boolean left=getPath(root.left,n,path);
        boolean right=getPath(root.right,n,path);
        if(left||right)
        {
            return true;
        }
        path.remove(path.size()-1);
        return false;


    }
    public static int sumTree(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftroot=sumTree(root.left);
        int rightroot=sumTree(root.right);
        int data=root.data;
        int left=root.left==null? 0 : root.left.data;
        int right=root.right==null ? 0 :root.right.data;
        root.data=left+leftroot+right+rightroot;
        return  data;
    }
   public static void main(String args[])
   {
    int arr[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
    BinaryTree b= new BinaryTree();
    Node root=b.buildtree(arr);
    ArrayList<Node> path=new ArrayList<>();
    //System.out.println(root.right.right.data);
    //preorder(root);
    //levelOrder(root);
    //System.out.println(height(root));
    //System.out.println(dia(root));
    //topview(root);
    //kLevel(root,1,3);
    // getPath(root,3,path);
    // for(int i=0;i<path.size();i++)
    // {
    // System.out.println(path.get(i).data);
    // }
    System.out.println(sumTree(root));
   }
}
