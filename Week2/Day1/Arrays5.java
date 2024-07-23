package Week2.Day1;



public class Arrays5 
{
    public static void displayArray(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    static void NGRNI(int [] nums,int [] arr)
    {
        int maxR=0;
        for (int i=nums.length-1;i>=0;i--)
        {
            arr[i]=maxR;
            maxR=Math.max(maxR,nums[i]);
        }
    }
    static void NGRCI(int [] nums,int [] arr)
    {
        int maxR=0;
        for (int i=nums.length-1;i>=0;i--)
        {
            maxR=Math.max(maxR,nums[i]);
            arr[i]=maxR;
        }
    }
    static void NSRNI(int [] nums,int [] arr)
    {
        int minR=100;
        for (int i=nums.length-1;i>=0;i--)
        {
            arr[i]=minR;
            minR=Math.min(minR,nums[i]);
        }
    }
    static void NSRCI(int [] nums,int [] arr)
    {
        int minR=100;
        for (int i=nums.length-1;i>=0;i--)
        {
            minR=Math.min(minR,nums[i]);
            arr[i]=minR;
        }
    }
    static void NGLNI(int [] nums,int [] arr)
    {
        int maxL=0;
        for (int i=0;i<=nums.length-1;i++)
        {
            arr[i]=maxL;
            maxL=Math.max(maxL,nums[i]);
        }
    }
    static void NGLCI(int [] nums,int [] arr)
    {
        int maxL=0;
        for (int i=0;i<=nums.length-1;i++)
        {
            maxL=Math.max(maxL,nums[i]);
            arr[i]=maxL;
        }
    }
    static void NSLNI(int [] nums,int [] arr)
    {
        int minL=100;
        for (int i=nums.length-1;i>=0;i--)
        {
            arr[i]=minL;
            minL=Math.min(minL,nums[i]);
        }
    }
    static void NSLCI(int [] nums,int [] arr)
    {
        int minL=100;
        for (int i=nums.length-1;i>=0;i--)
        {
            minL=Math.min(minL,nums[i]);
            arr[i]=minL;
        }
    }
    public static void main(String[] args) 
    {
        int nums[]={2,3,1,8,7,3,4};
        int [] arr=new int[nums.length];
        NSLNI(nums,arr);
        displayArray(arr);
        System.out.println("");
        NSLCI(nums,arr);
        displayArray(arr);


    
    }
}
