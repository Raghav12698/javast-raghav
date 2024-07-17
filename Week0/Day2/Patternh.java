/*Q1
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
                System.out.print(" * ");
            System.out.println("   ");
        }
        
    }
    
}
Q2
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(" * ");
            System.out.println("   ");
        }
        
    }
    
}
Q3
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print(" * ");
            System.out.println("   ");
        }
        
    }
    
}
Q4
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=(n-i);k++)
                System.out.print("   ");
            for(int j=1;j<=i;j++)
                System.out.print(" * ");
            System.out.println("   ");
        }
        
    }
    
}
Q5
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int k=1;k<=(n-i);k++)
                System.out.print("   ");
            for(int j=1;j<=i;j++)
                System.out.print(" * ");
            System.out.println("   ");
        }   
    }
    
}
Q6
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int k=1;k<=(n-i);k++)
                System.out.print("      ");
            for(int j=1;j<=i;j++)
                System.out.print(" * ");
            System.out.println("   ");
        }
        
    }
    
}
Q7
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n)
                    System.out.print(" * ");
                else
                     System.out.print("   ");
            }
                
            System.out.println("   ");
        }
        
    }
    
}
Q8
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==j||i+j==n+1)
                    System.out.print(" * ");
                else
                     System.out.print("   ");
            }
                
            System.out.println("   ");
        }
        
    }
    
}
Q9
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=(n-i);k++)
                System.out.print("   ");
            for(int j=1;j<=i;j++)
                System.out.print(" * ");
            for(int j1=1;j1<=i-1;j1++)
                System.out.print(" * ");
           
            System.out.println("   ");
        }
        
    }
    
}
Q10
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int k=1;k<=(n-i);k++)
                System.out.print("   ");
            for(int j=1;j<=i;j++)
                System.out.print(" * ");
            for(int j1=1;j1<=i-1;j1++)
                System.out.print(" * ");
           
            System.out.println("   ");
        }
        
    }
    
}
Q11
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=(n-i);k++)
                System.out.print("   ");
            for(int j=1;j<=i;j++)
            {
                if ((i+j)%2==0)
                {
                    System.out.print(" * ");
                } 
                else 
                {
                    System.out.print("   ");
                }
            }
               
            for(int j1=1;j1<=i-1;j1++)
                if ((i+j1)%2==0)
                {
                    System.out.print("   ");
                } 
                else 
                {
                    System.out.print(" * ");
                }
           
            System.out.println("   ");
        }
        
    }
    
}
Q12
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=(n-i);k++)
                System.out.print("   ");
            for(int j=1;j<=i;j++)
            {
                if ((i+j)%2==0)
                {
                    System.out.print(" * ");
                } 
                else 
                {
                    System.out.print(" ! ");
                }
            }
               
            for(int j1=1;j1<=i-1;j1++)
                if ((i+j1)%2==0)
                {
                    System.out.print(" ! ");
                } 
                else 
                {
                    System.out.print(" * ");
                }
           
            System.out.println("   ");
        }
        
    }
    
}

Q13
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(" * ");
            System.out.println("   ");
        }
        for(int i1=n;i1>=1;i1--)
        {
            for(int j1=1;j1<=i1-1;j1++)
                System.out.print(" * ");
            System.out.println("   ");
        }   
    }
    
}
Q14
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=(n-i);k++)
                System.out.print("   ");
            for(int j=1;j<=i;j++)
                System.out.print(" * ");
            System.out.println("   ");
        }
        for(int i1=n-1;i1>=1;i1--)
        {
            for(int k1=1;k1<=(n-i1);k1++)
                System.out.print("   ");
            for(int j1=1;j1<=i1;j1++)
                System.out.print(" * ");
            System.out.println("   ");
        }   
    }
    
}
Q15
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i1=n-1;i1>=1;i1--)
        {
            for(int k1=1;k1<=(n-i1);k1++)
                System.out.print("      ");
            for(int j1=1;j1<=i1;j1++)
                System.out.print(" * ");
            System.out.println("   ");
        }
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=(n-i);k++)
                System.out.print("      ");
            for(int j=1;j<=i;j++)
                System.out.print(" * ");
            System.out.println("   ");
        }   
    }
    
}
Q16
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i1=n;i1>=1;i1--)
        {
            for(int k1=1;k1<=(n-i1);k1++)
                System.out.print("      ");
            for(int j1=1;j1<=i1-1;j1++)
                System.out.print(" * ");
            System.out.println("   ");
        }   
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(" * ");
            System.out.println("   ");
        }
    }
    
}
Q17
public class Patternh {
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
Q18

public class Patternh {
    public static void main(String[] args) {
        int n=7;
        {
            for(int i=1;i<=((n+1)/2);i++)
            for(int k=((n+1)/2);k<=(n-i);k++)
                System.out.print("   ");
            for(int j=1;j<=i;j++)
                System.out.print(" * ");
            for(int j1=1;j1<=i-1;j1++)
                System.out.print(" * ");
           
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

Q19
public class Patternh {
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
Q20
public class Patternh {
    public static void main(String[] args) {
        int n=7;
        {
            for(int i=1;i<=((n+1)/2);i++){
           
             for(int k=((n+1)/2);k<=(n-i);k++)
                System.out.print("   ");
             for(int j=1;j<=i;j++)
            {
                if((i+j)==(n-2))
                    System.out.print(" * ");
                
                else
                    System.out.print("   ");
            }   
            for(int j1=1;j1<=i-1;j1++)
            {
                if(i==j1)
                    System.out.print(" * ");
                
                else
                    System.out.print("   ");
            }   }
           
            System.out.println("   ");
        }
        for(int i1=((n-1)/2);i1>=1;i1--)
        {
            for(int k=((n+1)/2);k<=(n-i1);k++)
                System.out.print("   ");
            for(int j=1;j<=i1;j++)
            {
                if((i1==j))
                    System.out.print(" * ");
                
                else
                    System.out.print("   ");
            }   
            for(int j3=1;j3<=i1;j3++)
            {
                if((i1+j3)==(n-4))
                     System.out.print(" * ");
                    
                else
                     System.out.print("   ");
            }   
           
            System.out.println("   ");
        }
        
    }
    
}

Q21
public class Patternh{
    public static void main(String args[]){
        int n=5;
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

Q22
public class Patternh{
    public static void main(String args[]){
        int n=5;
        
        for(int i=n;i>=1;i--)
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
Q23
public class Patternh {
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
Q24
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=(n-i);k++)
                System.out.print("   ");
            for(int j=1;j<=i;j++)
                System.out.print(" "+i+" ");
            for(int j1=1;j1<=i-1;j1++)
                System.out.print(" "+i+" ");

           
            System.out.println("   ");
        }
        
    }
    
}
Q25
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++)
        {
            for(int k=1;k<=(n-i);k++)
                System.out.print("   ");
            for(int j=0;j<=i;j++)
                System.out.print(" "+(j+i)+" ");
                
                
            for(int j1=1;j1<=i-1;j1++)
                System.out.print(" "+(j1+i)+" ");
           
            System.out.println("   ");
        }
        
    }
    
}
Q26
public class Patternh {
        public static void main(String[] args) {
            int n=5;
            for(int i=1;i<=n;i++)
            {
                for(int k=1;k<=(n-i);k++)
                    System.out.print("   ");
                for(int j=1;j<=i;j++)
                    System.out.print(" "+j+" ");
                for(int j1=1;j1<=i-1;j1++)
                    System.out.print(" "+(i+j1)+" ");
    
               
                System.out.println("   ");
            }
            
        }
        
    }
Q27
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=(n-i);k++)
                System.out.print("   ");
            for(int j=1;j<=i;j++)
                System.out.print(" "+j+" ");
            for(int j1=i-1;j1>=1;j1--)
                System.out.print(" "+j1+" ");

           
            System.out.println("   ");
        }
        
    }
    
}
    
Q28
     public class Patternh {
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
Q29
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
       {
            for(int k=1;k<=(n-i);k++)
                System.out.print("   ");
            System.out.print(" "+(i)+" ");
            for(int j=1;j<=2*(i-1);j++)
                System.out.print(" 0 ");
            System.out.print(" "+(i)+" ");
            for(int j1=1;j1<=(2*(i-1));j1++)
                System.out.print(" 0 ");
            System.out.println("   ");
        }
        
    }
    
}
Q30
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>= 1;j--)
                System.out.print(" "+(j)+" ");
            System.out.println("   ");
        }
        
    }
    
}
Q31
public class Patternh {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>= 1;j--)
                if(i==j)
                    System.out.print(" * ");
                else
                    System.out.print(" "+(j)+" ");
                        
                   
            System.out.println("   ");
        }
        
    }
    
}
    Q32
    public class Patternh {
        public static void main(String[] args) {
            int n=5;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                    {System.out.print(" "+i+" ");
                    System.out.print(" * ");}
                System.out.println("   ");
            }
            for(int i1=n-1;i1>=1;i1--)
            {
                for(int j1=1;j1<=i1;j1++)
                 {System.out.print(" "+i1+" ");
                 System.out.print(" * ");}
                System.out.println("   ");
            }   
        }
        
    }
Q33
public class Patternh {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=(n-i);k++)
                System.out.print("   ");
            for(int j=i;j>=1;j--)
                System.out.print(" "+j+" ");
            for(int j1=1;j1<=i-1;j1++)
                System.out.print(" "+j1+" ");
            System.out.println("   ");
        }
        
    }
    
}
*/