import java.util.*;
public class Strings 
{
    public static void main(String[] args) 
    {
       // Scanner sc=new Scanner(System.in);
        //System.out.println("enter a string:");
        String s1="Today is Thursday";
        //String s2=sc.nextLine();
        String s2="weather";
        String s3="aaaqqqquuuuuiiqqquu";
        System.out.println(subString(s3));
        
    }
    public static String change(String s)
    {
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            ans+=(char)(s.charAt(i)+1);
        }
        return ans;
        
    }
    public static String reverse(String s)
    {
        String ans="";
        for(int i=s.length()-1;i>=0;i--)
        {
            ans+=s.charAt(i);
        }
        return ans;
        
    }
    public static boolean palindrome(String s)
    {
        s=s.toLowerCase();
        return s.equals(reverse(s));
    }
    public static String reverse2(String s)
    {
        s=s.trim();
        String[]arr=s.split(" ");
        String ans="";
        for(int i=arr.length-1;i>=0;i--)
        {
            ans+=arr[i]+" ";
        }
        return ans.trim();
    }
    //find the substring which is largest with repeating characters
    public static int subString(String s)
    {
        int count=1,temp=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-10-))
            {
                temp++;
            }
            else
            {
                count=Math.max(count,temp);
                temp=1;
            }
        }
        return count;
    }

}