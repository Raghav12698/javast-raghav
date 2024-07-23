package leetcodearray;



public class Q26 
{
    public static int removeDuplicates(int[] nums) 
    {
        int k=nums.length;
        int a=1;
        for(int i=1;i<k;i++)   
        {
            if(nums[i]!=nums[i-1])
            {
                nums[a]=nums[i];
                a++;
            }
            
        }
        return a;
        
    }
    public static void main(String[] args) 
    {
        int[] arr={1,1,2};
        removeDuplicates(arr);
        
    }

}
