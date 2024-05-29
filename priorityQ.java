import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;


public class priorityQ {
//      static class Stnt implements Comparable <Stnt>{
//         String name;
//         int rank;
//         public Stnt(String name,int rank)
//         {
//             this.name=name;
//             this.rank=rank;
//         }
//         @Override
//     public  int compareTo(Stnt s2)
//     {
//         return this.rank-s2.rank;
//     }
//     }
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();
        public void add(int data)
        {
            arr.add(data);
            int x=arr.size()-1;
            int par=(x-1)/2;
            while(arr.get(x)<arr.get(par))
            {
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                x=par;
                par=(x-1)/2;
            }
        } 
        public int peek()
        {
            return arr.get(0);
        }
        public int remove()
        {
            int data=arr.get(0);
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            arr.remove(arr.size()-1);
            heapify(0);
            return data;
        }
        private void heapify(int i)
        {
            int minIdx=i;
            int left=2*i+1;
            int right=2*i+2;
            if(left<arr.size() && arr.get(left)<arr.get(minIdx))
            {
                minIdx=left;
            }
            if(right<arr.size() && arr.get(right)<arr.get(minIdx))
            {
                minIdx=right;
            }
            while(minIdx!=i)
            {
                int temp=arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,temp);
                heapify(minIdx);
            }
        }
        public boolean isEmpty()
        {
            return arr.size()==0;
        }
    }
    
    public static void add(int data,ArrayList<Integer> arr)
    {
        arr.add(data);
        int x=arr.size()-1;
        int par=(x-1)/2;
        while(arr.get(x)<arr.get(par))
        {
            int temp=arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par,temp);
            x=par;
            par=(x-1)/2;
        }
    }
    public static void main(String args[])
    {
        //PriorityQueue<Stnt> pq=new PriorityQueue<>();
        //PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        // pq.add(5);
        // pq.add(2);
        // pq.add(9);
        // pq.add(1);
        // while(!pq.isEmpty())
        // {
        //     System.out.println(pq.peek());
        //     pq.remove();
        // }
        // pq.add(new Stnt("Yash",54));
        // pq.add(new Stnt("Yashveer",44));
        // pq.add(new Stnt("YashRAj",4));
        // while(!pq.isEmpty())
        // {
        //     System.out.println(pq.peek().name);
        //     pq.remove();
        // }
    //     ArrayList<Integer> arr=new ArrayList<>();
    //     arr.add(2);
    //     arr.add(3);
    //     arr.add(4);
    //     arr.add(5);
    //     arr.add(10);
    //    add(1,arr);
        // System.out.println(arr);
    //     Heap h=new Heap();
    //     h.add(2);
    //     h.add(3);
    //     h.add(4);
    //     h.add(5);
    //     h.add(10);
    //     System.out.println(h.peek());
    //     h.add(1);
    //     System.out.println(h.peek());
    //    System.out.println(h.remove());
        
       // System.out.println(h.peek());
       PriorityQueue<Integer> pq=new PriorityQueue<>();
       pq.add(67);
       pq.add(43);
       pq.add(21);
       pq.add(90);
       pq.add(65);
       pq.add(34);
       //System.out.println(pq.peek());
       pq.remove();
       System.out.println(pq.peek());
    }
}
