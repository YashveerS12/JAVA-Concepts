public class queue {
    static class Queue{
        int arr[];
        int size;
        int rear;
        Queue(int n)
        {
            arr=new int[n];
            size=n;
            rear=-1;
        }
        public boolean isEmpty()
        {
            return rear==-1;
        }
        public void add(int data)
        {
            if(rear==size-1)
            {
                System.out.println("Queue is Full");
                return ;
            }
            
            rear=rear+1;
            arr[rear]=data;
        }
        public int remove()
        {
            if(rear==-1)
            {
                System.out.println("Queue is Empty");
            }
            int val=arr[0];
            for(int i=1;i<rear;i++)
            {
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return val;
        
        }
        public int peek()
        {
            if(rear==-1)
            {
                System.out.println("Queue is Empty");
            }
            return arr[0];
        }

    }
    public static void main(String args[])
    {
        Queue  q= new Queue(5);
    
        q.add(2);
        q.add(2);
        q.add(2);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
