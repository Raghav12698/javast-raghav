package hw;

public class q18
{
    public static void main(String[] args) {
        int n=7;
        {
            for(int i=1;i<=((n+1)/2);i++)
            {for(int k=((n+1)/2);k<=(n-i);k++)
                System.out.print("   ");
            for(int j=1;j<=i;j++)
                System.out.print(" * ");
            for(int j1=1;j1<=i-1;j1++)
                System.out.print(" * ");}
           
            System.out.println("   ");
        }
        for(int i1=((n-1)/2);i1>=1;i1--)
        {
            for(int k=((n+1)/2);k<=(n-i1);k++)
                System.out.print("   ");
            for(int j=1;j<=i1;j++)
                System.out.print(" * ");
            for(int j1=1;j1<=i1-1;j1++)
                System.out.print(" * ");
           
            System.out.println("   ");
        }
        
    }
}
