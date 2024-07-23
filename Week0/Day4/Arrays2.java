package Day4;

//import java .util.*;
public class Arrays2 
{
    public static int sumArray(int [] arr)
    {int Sum=0;
    {
        for(int i=0;i<arr.length;i++)
        {
            Sum+=arr[i];
        }
        return Sum;
    }
    }
    public static int searchArray(int [] arr,int n)
    {
    {   System.out.println("Enter the element you want to search:");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
                return i;
        }
        return -1;
    }
    }
    public static void change (int []arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void bubbleSort(int [] arr)
    {
        for (int turn=1;turn<arr.length;turn++)
        {
            for(int i=0;i<arr.length-turn;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }

    public static void swap (int a,int b)
    {

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping:");
        System.out.println(a+" "+b);

    }
    public static void swapArray(int [] arr)
    {
        int i=0;
        int n=arr.length-1;
        System.out.println("After Swapping:");
        while(i<n)
            change(arr, i++, n--);
        
    }

    public static void revArray(int [] arr,int i,int j)
    {
        System.out.println("After Swapping:");
        while(i<j)
            change(arr, i++, j--);
        
    }
    public static void displayArray(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static int maxArray(int[]a)
    {
       int max=0;
        for(int i=0;i<a.length;i++)
        {
            if(max>a[i])
            {
                max=a[i];
            }
            
        }
        return max;
    }
    
    public static void main(String[] args) 
    {
        
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array:");
        for (int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt(); */
        
        /*arr[1]=10;
        arr[6]=13;
        arr[9]=6;*/
        
        System.out.println("Before Swapping:");
        
        int arr []={1,4,8,7,2,5,5,8,10,3};
        
        displayArray(arr);
        revArray(arr, 2, 6);
        displayArray(arr);
        //sort(arr);
        //swapArray(arr);
        //sc.close();
    }

    
}
