public class linkedlist {
    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void addfirst(int data)
    {
        Node nwnode=new Node(data);
        if(head==null)
        {
            head=tail=nwnode;
            return;
        }
        nwnode.next=head;
        head=nwnode;
    }
    public static void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[])
    {
    linkedlist ll =new linkedlist();
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.display();



    }
}
