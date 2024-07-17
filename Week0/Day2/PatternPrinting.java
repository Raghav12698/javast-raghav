/*import java.util.*;
public class PatternPrinting {
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no:");
        n=sc.nextInt();
        for ( int i=1;i<=n;i++)
        {
            System.out.print("* ");
        }
    }


}

import java.util.*;
public class PatternPrinting {
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no:");
        n=sc.nextInt();
        for ( int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
           System.out.println("* ");
        }
        sc.close();
    }


}

import java.util.*;
public class PatternPrinting{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        sc.close();


    }
    

}

import java.util.*;
public class PatternPrinting{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int k=1;k<=(n-i);k++)
                {System.out.println(" ");}
            for (int j=1;j<=i;j++)
                {System.out.print("*");}
            System.out.println();
            
            
        }
        sc.close();


    }
    

}
    
    import java.util.*;
    public class PatternPrinting{
        public static void main(String args[]){
            int n;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a number:");
            n=sc.nextInt();
            for(int i=n;i>=1;i--){
                for (int j=1;j<=i;j++)
                    {System.out.print("*");}
                System.out.println();
                
            }
            sc.close();
    
    
        }
        
    
    }

import java.util.*;
public class PatternPrinting{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for (int k=0;k<(n-i);k++){
                System.out.print(" ");}
            for (int j=1;j<i;j++)
                System.out.print("* ");
            System.out.println("*");
            
            
        }
        sc.close();


    }
    

}
public class PatternPrinting{
    public static void main(String args[]){
        int n=5;
        for(int i=n;i>=1;i--){
            for (int k=1;k<=(n-i);k++){
                System.out.print("    ");}
            for (int j=1;j<=i;j++)
                System.out.print(" * ");
            System.out.println("");
            
            
        }
        


    }
    

}

public class PatternPrinting{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++)
        {   
            for (int j=1;j<=n;j++)
                {
                    if(i==1||i==n||j==1||j==n)
                    {
                        System.out.print("* ");
                    }else
                        System.out.print("  ");
                    
                }
                System.out.println();
                
        }

    }
}

public class PatternPrinting{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++)
        {   
            for (int j=1;j<=n;j++)
                {
                    if(i==j||i+j==n+1)
                    {
                        System.out.print("* ");
                    }else
                        System.out.print("  ");
                    
                }
                System.out.println();
                
        }

    }
}

import java.util.*;
public class PatternPrinting{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int k=0;k<=(n-i);k++){
                System.out.print("   ");}
            for (int j1=1;j1<=i;j1++)
                System.out.print(" * ");
            for (int j2=1;j2<=i-1;j2++)
                System.out.print(" * ");
                System.out.println();
            
        }
        sc.close();


    }
    

}

import java.util.*;
public class PatternPrinting{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for (int k=0;k<=(n-i);k++){
                System.out.print("   ");}
            for (int j1=1;j1<=i;j1++)
                System.out.print(" * ");
            for (int j2=2;j2<=i;j2++)
                System.out.print(" * ");
                System.out.println();
            
        }
        sc.close();


    }
}    

import java.util.*;
public class PatternPrinting{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
        
            for(int j=1;j<=i;j++)
                System.out.print(" * ");
            
            System.out.println();     
        
        }
        for(int k=n;k>=1;k--)
        {
            for(int l=1;l<=k;l++)
                System.out.print(" * ");
            System.out.println();     
        
        }

    }
}

import java.util.*;
public class PatternPrinting{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int m=1;m<=(n-i);m++)
                System.out.print("   ");
            for(int j=1;j<=i;j++)
                System.out.print(" * ");
            
            System.out.println();     
        
        }
        for(int k=n-1;k>=1;k--)
        {   
            for(int o=1;o<=(n-k);o++)
                System.out.print("   ");
            for(int l=1;l<=k;l++)
                System.out.print(" * ");
            System.out.println();     
        
        }

    }
}

import java.util.*;
public class PatternPrinting{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int k=1;k<=(n-i);k++)
                System.out.print("     ");
            for(int j=1;j<=i;j++)
                System.out.print(" * ");
            System.out.println();
        }
        for(int l=1;l<=n;l++)
        {
            for(int m=1;m<=(n-l);m++)
                System.out.print("     ");
            for(int o=1;o<=l;o++)
                System.out.print(" * ");
            System.out.println();
        }
    }
}
Q21
import java.util.*;
public class PatternPrinting{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(" * "); 
            for(int k=1;k<=2*(n-i)-1;k++)
                System.out.print("   ");
                    
            for(int l=1;l<=i && l<n;l++)
                System.out.print(" * ");
            System.out.println(); 
        
        
        }

    }
}
*/