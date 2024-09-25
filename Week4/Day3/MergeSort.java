package Week4.Day3;

public class MergeSort 
{   public static void displayArray(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    static void mergeSort(int [] arr,int low,int high)
    {
        if(low<high)
        {
            int mid=(high-low)/2;
        
            mergeSort(arr, 0, mid);
            mergeSort(arr,mid+1,high);
            merge(arr, low, mid, high);
        }
    }
    static void merge(int [] arr,int low,int mid,int high)
    {
        int size=high-low+1;
        int [] temp=new int [size];
        int i=mid;
        int j=high;
        int k=size-1;
        while(j>=mid+1)
        {
            if(i>=low && arr[i]>arr[j])
            {
                temp[k--]=arr[i--];
            }
            else
            {
                temp[k--]=arr[j--];
            }
        }
        
        for(i=low;i<=mid;i++)
        {
            arr[i]=temp[i-low];
        }
        // for(i=mid+1;i<=high;i++)
        // {
        //     arr[i]=temp[i-low];
       // }
        while(i>=0)
        {
            temp[k--]=arr[i--];
        }
    }
    
    public static void main(String[] args) 
    {
        int [] arr={1,3,5,2,3,6};
        int low=0;
        int high=arr.length-1;
        int mid=(low+high)/2;
        displayArray(arr);
        mergeSort(arr, low, high);
        displayArray(arr);
    }
}
