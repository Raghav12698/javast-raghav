import java.util.*;
public class stacks 
{
    //check if stack is empty
    //stk.empty();


    public static void main(String[] args) 
    {
        Stack<Integer> stk=new Stack<>();
        //Add elements
        stk.push(1);                            
        stk.push(2);     
        stk.push(10);                                       
        stk.push(20);                                       
        stk.push(100);
        stk.push(200); 

        //view the top element
       // System.out.println(stk.peek());    

        //deleting an element
        //System.out.println(stk.pop());

        // Scanner sc=new Scanner(System.in);
        // //System.out.println("Enter no. of elements:");
        // //int n=sc.nextInt();
        // while(sc.hasNextInt())
        // {
        //     System.out.println("enter element");
        //     stk.push(sc.nextInt());

        // }
        // System.out.println(stk);
        // while(!stk.empty())
        // {
        //     System.out.println(stk.pop());
        // }
        //System.out.println(("Stack is empty"));
        //push elements acc to user
        // for(int i=1;i<=n;i++)
        // {
        //     System.out.println("enter element"+i);
        //     stk.push(sc.nextInt());
        // }
        // System.out.println(stk);
        //sc.close();

        //search an element
        System.out.println(stk.search(10));

        //
        System.out.println(stk.size()-stk.search(100));
        
    }
}
