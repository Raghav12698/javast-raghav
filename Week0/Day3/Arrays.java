package Day3;

public class Arrays 
{
    public static void displayArray(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]+"");
    }
    public static boolean primeNumber(int n)
    {
    
        for (int i=2;i<n;i++)
            if(n%i==0)
                return false;
            return true;
           
        
    }
    public static int revInteger (int n)
    {
        int r=0,rev=0;
        while(n!=0) 
            {r =n%10;
            rev=rev*10+r;
            n=n/10;}
        return n;

    }

    public static void main(String[] args) 
    {
       /*  int [] arr=new int[10];
        arr[1]=10;
        arr[6]=13;
        arr[9]=6;
        //displayArray(arr);
        int n=13;
        System.out.println(primeNumber(n));*/
        
        int  n=5;
        System.out.print(armstrong(n));
        
    }
    public static int countInt(int n)
    {
        int count=0;
        if(n==0)
            return 1;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        return count;
    }
     public static boolean armstrong(int temp)
    {
        int n=temp;
        int result=0;
        while (temp!= 0)
        {
            
            int d=countInt(temp); 
            int r = temp % 10;
            result +=  result+Math.pow(r,d);
            temp/= 10;
        }
        return (result==n);
    }
    
}
