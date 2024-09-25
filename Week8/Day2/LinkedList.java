package Week8.Day2;

import java.security.PrivateKey;

public class LinkedList {
    class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public int size() {
        return size;
    }

    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {

            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("Null");
    }

    public void addFirst(int item)
    /* create a node if ll is empty, */
    {
        Node nn = new Node();
        nn.data = item;
        if (size == 0) {
            head = nn;
            tail = nn;
        } else {
            nn.next = head;
            head = nn;
        }
        size++;
    }

    public void addLast(int item)
    {
        if(size==0)
        {
            addFirst(item);
        }
        else
        {
            Node nn=new Node();
            nn.data=item;
            tail.next=nn;
            tail=nn;
            size++;
        }
    }

    public Node getNode(int index)
    {
        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
    public void addAtIndex(int item,int index)
    {
        if(index==0)
        {  
            addFirst(size);
        }
        else if(index==size)
        {
            addLast(item);
        } 
        else 
        {
            Node nn=new Node();
            nn.data=item;
            Node k_1th=getNode(index-1);
            nn.next=k_1th.next;
            k_1th.next=nn;
            size++;
        }

    }
    public int getStart()
    {
        return head.data;
    }
    public int getEnd()
    {
        return tail.data;
    }
    public int getIndex(int index)
    {
        if(index==0)
            return getStart();
        else if (index==size-1)
        {
            return getEnd();
        }
        else
        {
            return getNode(index).data;
        }
    }
    public int removeFirst()
    {
        int rn=head.data;
        if(size==1)
        {
            head=null;
            tail=null;
        }
        else
        {
            Node temp=head;
            head=head.next;
            temp.next=null;
        }
        size--;
        return rn;
    }
    public int removeEnd()
    {
        if(size==1)
        {
            return removeFirst();
        }
        else
        {
            int rn=tail.data;
            Node s1=getNode(size-2);
            s1.next=null;
            tail=s1;
            size--;
            return rn;
        }
    }
    public int removeAtIndex(int index)
    {
        if(index==0)
        {  
            return removeFirst();
        }
        else if(index==size-1)
        {
            return removeEnd();
        } 
        else 
        {
            Node k_1th=getNode(index-1);
            Node temp=k_1th.next;
            k_1th.next=temp.next;
            temp.next=null;
            size--;
            return temp.data;
        }
    }

}
