package Week4.Day3;

public class Cheezy 
{
    static int sum=0;
    
    static void sumArray(int [] arr,int i,int k)
    {   
        if(i==arr.length )
        {
            return;
        }
        sum+=arr[i];
        if(sum>k)
        {
            sum-=arr[i];
            return;
        }
        sumArray(arr,i+1,k);
    }
    static boolean backtracksumArray(int [] arr,int i,int k)
    {
        if(i==arr.length)
        {
            return  true;
        }
        if(sum>k)
        {
            return false;
        }
        sum+=arr[i];
        if(!backtracksumArray(arr, i+1, k))
        {
            sum-=arr[i];
        }
        return true;
    }
    public static void main(String[] args) 
    {
        int [] arr={1,2,3,4,5,6,7};
        backtracksumArray(arr,0,15);
        System.out.println(sum);   
    }
    
}
