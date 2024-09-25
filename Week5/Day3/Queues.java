package Week5.Day3;
import java.util.*;
public class Queues 
{
    public static void main(String[] args) 
    {
        //Defination
        Queue<Integer>q=new LinkedList<>();

        System.out.println(q.element());            //throews an exception when no element present
        //Add elements
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        //display

        System.out.println(q);
        System.out.println();
        //remove Elemment
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println();
        //peek the first element
        q.remove(20);
        System.out.println(q);

        System.out.println(q.peek());
    }
    
    
    
}
