package hw;

public class q28 
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
       {
            for(int k=1;k<=(n-i);k++)
                System.out.print("   ");
            for(int j=i;j<=(2*i)-1;j++)
                System.out.print(" "+(j)+" ");
            for(int j1=(2*i)-2;j1>=i;j1--)
                System.out.print(" "+j1+" ");

           
            System.out.println("   ");
        }
        
    }
    
}

