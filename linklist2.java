import java.util.*;

public class linklist2 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;


        }
    }
    public static Node head;
    public static Node tail;

    public void addfirst(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public static void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void zigzag()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        Node mid=slow;
        Node prev =null;
        Node curr=mid.next;
        Node next;
        mid.next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node leftL,rightR;
        while(left!=null&& right!=null)
        {
            leftL=left.next;
            left.next=right;
            rightR=right.next;
            right.next=leftL;
            left=leftL;
            right=rightR;
        }
    }
    public static void main(String args[])
    {
       linklist2 ll= new linklist2();
       ll.addfirst(6);
       ll.addfirst(5);
       ll.addfirst(4);
       ll.addfirst(3);
        ll.addfirst(2);
         ll.addfirst(1);
       print();
       zigzag();
       print();
    }
}
