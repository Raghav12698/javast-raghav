package hw;

public class q23 
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=(n-i);k++)
                System.out.print("   ");
            for(int j=1;j<=i;j++)
                System.out.print(" 1 ");
            for(int j1=1;j1<=i-1;j1++)
                System.out.print(" 1 ");
           
            System.out.println("   ");
        }
        
    }
}
