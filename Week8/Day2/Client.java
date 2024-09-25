package Week8.Day2;

public class Client 
{
    public static void main(String[] args) 
    {
        LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(100);               
        ll.addAtIndex(50, 3);
        ll.display();
        System.out.println(ll.size());
        System.out.println(ll.getIndex(4));
        ll.removeFirst();
        ll.removeEnd();
        ll.removeAtIndex(1);
        ll.display();
    }
    
}
