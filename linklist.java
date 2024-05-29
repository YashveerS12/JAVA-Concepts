import java.util.*;

public class linklist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    public static void addfirst(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = tail = temp;
            return;
        }
        temp.next = head;
        head = temp;
    }

    public static void atlast(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = tail = temp;
        }
        tail.next = temp;
        tail = temp;
    }

    public static void show() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void nremove(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int idx = 1;
        Node temp1=head;
        while (idx < size - n)  
        {
            temp1=temp1.next;
            idx++;
         }
         temp1.next=temp1.next.next;
         show();
    }
    public static Node findmid()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
    public static boolean palindrone(){
        if(head==null || head.next==null)
        {
            return true;
        }
        Node mid=findmid();
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        Node left=head;
        Node right =prev;
        while(right!=null)
        {
            if(left.data!=right.data)
            {
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        linklist ll = new linklist();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(3);
        ll.addfirst(1);
        reverse();
       System.out.println(palindrone());
    }
}