package Day5;

import java.util.*;

public class Arrays3 
{
    public static void displayArray(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static int minIndex(int[]a)
    {
        int min=0;
        for(int i=1;i<a.length;i++)
        {
            if(a[min]>a[i])
            {
                min=a[i];
            }
            
        }
        return min;
    }
    void display(int [] arr)
    {
        
    }
    public static void selectionSort(int [] a)
    {
        for (int i=0;i<a.length-1;i++)
        {
            int idx=minIndex1(a,i);
            int temp=a[i];
            a[i]=a[idx];
            a[idx]=temp;

        }
    }
    public static void insertionSort(int[] arr)
    { 

        int n=arr.length; 
        for(int i=1;i<n;i++)
        { 
            int key= arr[i]; 
            int j= i-1; 
            while(j>=0 && arr[j]>key)
            { 
                arr[j+1]= arr[j--]; 
            }
            arr[j+1]=key; 
        } 
        
    } 
    public static int minIndex1(int[]a,int j)
    {
        int min=j;
        for(int i=j+1;i<a.length;i++)
        {
            if(a[min]>a[i])
            {
                min=i;
            }
            
        }
        return min;
    }
    public static int binarySearch (int [] arr,int key)
    {
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==key)
                return mid;
            if(arr[mid]>key)
                end=mid-1;
            else
                start=mid+1;
            
        }
        return -1;

    }
    public static int lowerBound (int [] arr,int key)
    {
        int start=0,end=arr.length-1 ;
        int a=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==key)
            {
                a=mid; 
                end=mid-1;
            }         
            else if(arr[mid]>key)
                end=mid-1;
            else
                start=mid+1;
            
        }
        return a;

    }
    public static int upperBound (int [] arr,int key)
    {
        int start=0,end=arr.length-1 ;
        int a=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==key)
            {
                a=mid+1; 
                start=mid+1;
            }         
            else if(arr[mid]>key)
                end=mid-1;
            else
                start=mid+1;
            
        }
        return a;

    }
        
    
    public static void main(String[] args) 
    {
        
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array:");
        for (int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt(); */
        
        /*arr[1]=10 ;
        arr[6]=13;
        arr[9]=6;*/
        
       // System.out.println("Before Swapping:");
        
        int arr []={1,23,4,4,4,12,2};
        //insertionSort(arr);                                                                                                                                                                                                                                                                                                                    
        Arrays.sort(arr);
        System.out.println(upperBound(arr, 4)) ;
       // displayArray(arr);
        //Day4.Arrays2.revArray(arr, 2, 6);
                //displayArray(arr);
        //sort(arr);
        //swapArray(arr);
        //sc.close();
    }
    

    
}


