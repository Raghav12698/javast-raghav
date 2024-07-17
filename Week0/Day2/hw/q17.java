package hw;

public class q17 
{
    public static void main(String[] args) {
        int n=7; 
        
        for(int i2=((n-1)/2);i2>=1;i2--)
        {
            for(int j1=1;j1<=i2;j1++)
                System.out.print(" * ");
            for(int k2=(n+1)/2;k2<=((n-i2));k2++)
                System.out.print("   ");
            for(int k=(n+1)/2;k<=((n-i2));k++)
                System.out.print("   ");
                for(int j2=1;j2<=i2;j2++)
                    System.out.print(" * ");
            System.out.println("   ");
        }
        System.out.println("   ");
        for(int i3=1;i3<=((n-1)/2);i3++)
        {
            for(int j=1;j<=i3;j++)
                System.out.print(" * ");
            for(int k1=(n+1)/2;k1<=(n-i3);k1++)
                System.out.print("   "); 
            for(int k3=(n+1)/2;k3<=(n-i3);k3++)
                System.out.print("   ");
                for(int j3=1;j3<=i3;j3++)
                    System.out.print(" * ");
            System.out.println("   ");
        }   
    }
    
}

