public class wrapperlass 
{
    public static void main(String[] args) 
    {
        // int x=25;
        // Integer y=x;        //autoboxing
        // int z=y;            //unboxing
        // System.out.println(z);
        //return true till Integer i=127 and Integer j=127
        //else return false if>127
        //Integer wrapper class range 0-127
        //wrapper class works on address
        // Integer z=128;
        // Integer w=128;
        // System.out.println(Integer.compare(z,w));
        substring1("abcde");

    }
    public static void substring1(String s)
        {
            for(int i=0;i<s.length();i++)
            {
                for(int j=i+1;j<=s.length();j++)
                { 
                    System.out.println(s.substring(i,j));
                }
            }
        }

}
