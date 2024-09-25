package Week7.Day1;

import java.util.*;
public class revision 
{
    public static void array(int [][]arr,int m,int n)
    {
        
        for(int i=0;i<m;i++)
        {
            if(i%2==0)
            {
                for(int k=n;k>n;k--)
                {
                    System.out.print(arr[i][k]+" ");
                }
            
            }
            else
            {
                for(int k=0;k<n;k++)
                {
                    System.out.print(arr[i][k]+" ");
                }

            }
        }
        
    }
    public static void disp(int [][]arr)
    {
        for(int i=0;i<arr.length;i++)
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

        System.out.println("Enter the eleents in array:");
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
    }
    public static void main(String[] args) 
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int m=sc.nextInt();
        System.out.println("Enter no. of columns:");
        int n=sc.nextInt();
        int[][]arr=new int [m][n];
        insert(arr);
        disp(arr);
        array(arr,m,n);

        
    }
}
