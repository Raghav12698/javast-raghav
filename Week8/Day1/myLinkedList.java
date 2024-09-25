
public class myLinkedList 
{
    private Node head=null;
    public void InsertAtBegin(int val)
    {
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
    }
    public void InsertAtEnd(int val)
    {
        
        Node tail=head;
        if(head==null)
        {
            InsertAtBegin(val);
            return;
        }
        while(tail.next!=null)
        {
            tail=tail.next;
        }
        Node newNode=new Node(val);
        tail.next=newNode;
    }

    public void display()
    {
        Node current=head;

        if(head==null)
        {
            System.out.println("List is empty");
        }
        while(current!=null)
        {
            
            System.out.println(current.data+"->");
            current=current.next;
        }
        System.out.println();
    }
}
