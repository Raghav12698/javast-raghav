public class client
{
    public static void main(String[] args) 
    {
        // int size=(int)1e10;  //10^10
        // int arr[]=new int [size];

        Node n1=new Node(12);
        Node n2=new Node(13);
        Node n3=new Node(14);
        Node head=n1;                           //assign another namme to any node
        Node temp=n2;
        // temp=n3;
        // or 
        temp=n2.next;                           //shifting of name
        n1.next=n2;
        n2.next=n3;
        System.out.println("N1->"+n1);
        System.out.println("N2->"+n2);
        System.out.println("N3->"+n3);
        System.out.println(n1.next);
        System.out.println(n2.next);

    }
}
