import java.util.Deque;
import java.util.LinkedList;
import java.util.*;

public class deque {
    public static void main(String args[])
    {

    
    Deque<Integer> deque=new LinkedList<>();
    deque.addFirst(1);
     deque.addFirst(2);
     deque.addLast(3);
     deque.addLast(5);
     System.out.println(deque);
     deque.removeFirst();
     System.out.println(deque);
     deque.removeLast();
     System.out.println(deque);
    }
    
    
    
}
