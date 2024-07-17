package hw;

public class q16 
{
    public static void main(String[] args) {
        int n=5;
        for(int i1=n;i1>=1;i1--)
        {
            for(int k1=1;k1<=(i1);k1++)
                System.out.print("      ");
            for(int j1=1;j1<=i1;j1++)
                System.out.print(" * ");
            System.out.println("   ");
        }   
        for(int i=2;i<=n;i++)
        {

            for(int k2=1;k2<=(i);k2++)
                System.out.print("      ");
            
            for(int j=1;j<=i;j++)
                System.out.print(" * ");
            System.out.println("   ");
        }
    }
}
