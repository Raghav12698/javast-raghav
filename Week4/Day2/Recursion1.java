package Week4.Day2;
public class Recursion1 
{
    //valid parenthesis
    static void validParenthesis(int n,int l,int r,String ans)
    {
        if(l==n && r==n)
        {
            System.out.println(ans);
            return;
        }
        if(l>n ||r>l)
        {
            return;
        }
        validParenthesis(n,l+1,r,ans+"{") ; 
        validParenthesis(n,l,r+1,ans+"}");
    }
    //count subsequences
    static int countSubsequences(String n)
    {
        int num1=0;
        int num2=0;
        
        if(n.isEmpty())
        { 
            return 1;
        }
        num1+=countSubsequences(n.substring(1));
        num2+=countSubsequences(n.substring(1)); 
        return num1+num2;
       }
    //generating subsequences
    static void generateSubsequences(String n,String ans)
    {
        if(n.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        generateSubsequences(n.substring(1),ans+n.charAt(0));
        generateSubsequences(n.substring(1),ans+""); 
       }
    //coin toss
    static void toss(int n,String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        toss(n-1,ans+"H");
        toss(n-1, ans+"T");
    }
    public static void main(String[] args) 
    {
       // toss(3, "");
        //System.out.println(countSubsequences("TAP"));
        validParenthesis(3, 0, 0, "");
    }
}
