package Week4.Day4;
public class ratInAMmaze
{
    static int [][]sol=new int[100][100];
    static void display(int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(sol[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean RIAM(char[][]maze,int i,int j,int n,int m)
    {
        if(i==n-1 && j==m-1)
        {
            sol[i][j]=1;
            display(n,m);
            return true;
        }
        if(i>=0 && i<n && j>=0 && j<m && maze[i][j]!='X' &&  sol[i][j]==0)
        {
            sol[i][j]=1;
            RIAM(maze, i, j+1, n,m);          //move right
            RIAM(maze, i+1, j, n,m);          //move down
            RIAM(maze, i, j-1, n,m);          //move left
            RIAM(maze, i-1, j, n,m);          //move up
            //Backtracking
            sol[i][j]=0;
        }
        return false;
    }
    public static void main(String[] args) 
    {
        char[][]maze=
        {
            {'0','X','0','0','0'},
            {'0','X','0','X','0'},
            {'0','X','0','X','0'},
            {'0','X','0','X','0'},
            {'0','0','0','X','0'}

        };
        RIAM(maze, 0, 0, 5, 5);
        //display(5,5);
    }
}
