package hw;

public class q29_2
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
       {
            for(int k=1;k<=(n-i);k++)
                System.out.print("   ");
            System.out.print(" "+(i)+" ");
            for(int j=2;j<=(i-1);j++)
                System.out.print(" 0 ");
            System.out.print(" "+(i)+" ");
            for(int j1=2;j1<=((i-1));j1++)
                System.out.print(" 0 ");
            System.out.print(" "+(i)+" ");
            System.out.println("   ");
        }
        
    }
}
