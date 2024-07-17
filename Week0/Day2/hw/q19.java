package hw;

public class q19 
{
    public static void main(String[] args) {
        int n=7; 
        int a=(n+1)/2;
        for(int i2=(a);i2>=1;i2--)
        {
            for(int j1=1;j1<=i2;j1++)
                System.out.print(" * ");
            for(int k2=1;k2<=((a-i2));k2++)
                System.out.print("   ");
            for(int k=2;k<=((a-i2));k++)
                System.out.print("   ");
            for(int j2=1;j2<=i2 && j2<a;j2++)
                System.out.print(" * ");
            System.out.println("  ");
            
        }
        for(int i3=2;i3<=(a);i3++)
        {
            for(int j=1;j<=i3;j++)
                System.out.print(" * ");
            for(int k1=a;k1>=(i3+1);k1--)
                System.out.print("   "); 
            for(int k3=a-1;k3>=(i3+1);k3--)
                System.out.print("   ");
            for(int j3=1;j3<=i3 && j3<=a-1;j3++)
                System.out.print(" * ");
            System.out.println("   ");
        }   
    }
}
