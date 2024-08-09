package Week4.Day5;
import java.util.*;
public class SolveSudoku 
{

    public static boolean check(int[][]sudoku,int i,int j,int n,int number)
    {
        for(int x=0;x<n;x++)
        {
            //check simultaneously that if queen can be placed horizontlly or verically
            if(sudoku[x][j]==number || sudoku[i][x]==number)
            {
                return false; 
            }
        }
        //check bigger box
        int rn=(int)Math.sqrt(n);
        int sx=(i/rn)*rn;
        int sy=(i/rn)*rn;
        for(int x=sx;x<sx+rn;x++)
        {
            for(int y=sy;y<sy+rn;y++)
            {
                if(sudoku[x][y]==number)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int[][]sudoku,int i,int j,int n)
    {
        //base case;Answer found
        if(i==n)
        {
            return true;
        }
        //Row filled
        if(j==n)
        {
            return sudokuSolver(sudoku, i+1, 0, n);
        }
        //Block prefilled
        if(sudoku[i][j]!=0)
        {
            return sudokuSolver(sudoku, i, j+1, n);
        }
        for(int number=1;number<=n;number++)
        {
            if(check(sudoku, i, j, n, number))
            {
                sudoku[i][j]=number;
                sudokuSolver(sudoku, i, j+1, n);
                if(sudokuSolver(sudoku, i, j+1, n))
                {
                    return true;
                }
            }
        }
        sudoku[i][j]=0;             //backtracking
        return false;

    }
        public static void main(String[] args) 
    {
        int n=9;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        int[][] mat= new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                mat[i][j]=sc.nextInt();
        
        sudokuSolver(mat,0,0,n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}
