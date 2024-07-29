package Week2.Day2;

import java.util.*;

public class twoDArrays 
{
    static void display(int[][]arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void insert(int [][] arr)
    {
        int num=1;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=num++;
            }
        }
        sc.close();
    }
    public static int[] search(int [][]arr,int n)
    {   
        int idx[]={-1,-1};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==n)
                {
                    idx[0]=i;
                    idx[1]=j;
                    return idx;
                }
            }
        }
        return idx;
    }
    public static int[] []transpose(int [][]arr)
    {
        int nums[][]=new int [arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                nums[j][i]=arr[i][j];
            }
        }
        return nums;
    }
    static void sortByCol(int arr[][],int col)
    {
        Arrays.sort(arr,(a,b)->Integer.compare(a[col],b[col]));
    }
    static void sortAllRows(int[][]arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            Arrays.sort(arr[i]);
        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      }
    public static void main(String[] args) 
    {
        int arr[][]={
            {2,4,2,1},
            {4,5,2,4},
            {9,7,1,7}
        };

        sortByCol(arr, 0);
        sortAllRows(arr);
        display(arr);
        // int[][]arr=new int[5][3];
        // insert(arr);
        // display(arr);
        // int nums[][]=transpose(arr); 
        // System.out.println();
        // display(nums);
        //int num[]=search(arr,7);
        //System.out.println(num[0]+" "+num[1]);
    }
}
