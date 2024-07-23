package Day6;

import Day4.Arrays2;


public class Arrays4 
{
    public static void subArray(int [] arr)
    {   
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i;j<arr.length;j++)
            {
                for (int k=i;k<=j;k++)
                    System.out.print(arr[k]);
                System.out.println();
            }
            
        }
 
        
    }
    public static void subArraySum(int [] arr)
    {   
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i;j<arr.length;j++)
            {
                int sum=0;
                for (int k=i;k<=j;k++)
                    sum+=arr[k];
;                    System.out.print(sum);
                System.out.println();
            }
            
        }
 
        
    }
    public static void subArrayMaxSum(int [] arr)
    {   
        int maxSum=0;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i;j<arr.length;j++)
            {
                int sum=0;
                for (int k=i;k<=j;k++)
                    sum+=arr[k];
                maxSum=Math.max(sum,maxSum);
;              
            }
            
        }  
        System.out.println(maxSum);
 
    }
    public static void rotateByOne(int [] arr)
    {
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
            arr[i]=arr[i-1];
        arr[0]=temp;
    }
    public static void rotateByK(int [] nums,int k)

    {
        int [] arr= new int[nums.length];
    
        for(int i=0;i<nums.length;i++)
        { 
            arr[(i+k)%arr.length]=nums[i];
        }
        nums=arr;
        
    }
    public void rotate(int[] nums, int k) 
    {
        int [] arr= new int[nums.length];
    
        for(int i=0;i<nums.length;i++)
        { 
            arr[(i+k)%arr.length]=nums[i];
            
        }
        for(int i=0;i<nums.length;i++)
            nums[i]=arr[i];
    }

    public static void main(String[] args) 
    {
        int [] arr={1,2,3,4,5};
        //subArray(arr);
        //subArrayMaxSum(arr);
        Arrays2.displayArray(arr);
        
        Arrays2.displayArray(arr);

        
    }
}
