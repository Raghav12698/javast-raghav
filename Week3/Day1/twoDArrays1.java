package Week3.Day1;
import java.util.*;
public class twoDArrays1 
{
    public static void main(String[] args) 
    {
        int [][] arr={{2,4,2,5},{4,5,2,4},{9,7,1,7}};
        int[] nums=flatArr(arr);
        Arrays.sort(nums);
        display(nums);
        fillArr(arr, nums);
    }
    static void fillArr(int [][]arr,int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
           arr[i/arr[0].length][i%arr[0].length]=nums[i];
        }
        display1(arr);
    }
    static  int [] flatArr(int [][]arr)
    {
        int[]nums=new int[arr.length*arr[0].length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                nums[arr[0].length*i+j]=arr[i][j];
            }
        }
        return nums;
    }
    static void display1(int[][]arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            display(arr[i]);
        }

    }
    static void display(int[]nums)
    {
        for (int i:nums)
        {
            System.out.print(i+"");
        }
        System.out.println();

    }
}
