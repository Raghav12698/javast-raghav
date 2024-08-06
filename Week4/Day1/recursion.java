package Week4.Day1;
import java.util.*;
public class recursion 
{
    //Tail recursion
    static void print(int n)
    {   
        if(n==10)                       //Base Case
        {
            System.out.println(n);
            return;                     //Result
        }
        System.out.println(n);          //Assumption
        print(n+1);                     
    }
    
    static int sum(int n,int a)     
    {
        if(n==1)
        {
            return a+n;
        }
        return sum(n-1,a+n);
    }
    static int countEven(int n,int count)
    {
        if(n==1)
        { 
            return count;
        }
        if(n%2==0)  count++;
        return countEven(n-1, count);
    }
    static int power(int base,int pow,int ans)
    {
        if(pow==0)
        {
            return ans;
        }
        return power(base,pow-1,ans*base);
        
    }
    static int fact(int num,int ans)
    {
        if(num==0||num==1)
        {
            return ans;
        }
        return fact(num-1,ans*num);
    }
    static int fibonacci(int n,int ans)
    {
        if(n==0||n==1)
        {
            return ans+n;
        }
        return fibonacci(ans+n-1)+fibonacci(ans+n-2);
    }

    //Head Recursion
    static int sumHead(int n)     
    {
        if(n==1)
        {
            return 1;
        }
        return n+sumHead(n-1);
    }
    static int countEvenHead(int n)
    {
        if(n==1)
        { 
            return 0;
        }
        
        if(n%2==0)
        {
            return (1+countEvenHead(n-1));
        }
        
        return countEvenHead(n-1);
    }
    static int power(int base,int pow)
    {
        if(pow==0)
        {
            return 1;
        }
        return base*power(base, pow-1);
        
    }
    static int fact(int num)
    {
        if(num==0 || num==1)
        {
            return 1;
        }
        return num*fact(num-1);
    }
    static int fibonacci(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args)
    {
        // 1.

        //int n=1;
        // recursive fn
        // print(n);
        // normal code
        // while(n<=10)
        // {
        //     System.out.println(n);
        //     n++
        // }
        //2.
        //int n=10;
        // recursive fn
        // int sum=sum(n,0);
        // System.out.println(sum);
        //normal code
        // int sum=0;
        // for(int i=1;i<=n;i++)
        // {
        //     sum+=i;
        // }
        // System.out.println(sum);
        //int count=0;
        //int n=10;
        // while(n>1)
        // {
        //     if(n%2==0)
        //     {
        //         count++;
        //         n--;
        //     }
        // }
        // int base=2,pow=3;
        // System.out.println(power(5,5));
        System.out.println(fibonacci(5,0));
    }
}
  