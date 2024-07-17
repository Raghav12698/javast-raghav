package hw;
public class q32 
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=2*i-1;j++)
            {
            if(j%2!=0)
                System.out.print(" "+i+" ");
            else 
                System.out.print(" * ");
        
            }
            System.out.println("   ");
        
        }
        for(int i1=n-1;i1>=1;i1--)
        {
            for(int j1=1;j1<=2*i1-1;j1++)
            
            {
            if(j1%2!=0)
                System.out.print(" "+i1+" ");
            else
                System.out.print(" * ");
           
            }  
            System.out.println("   "); 
        }
    }
}
