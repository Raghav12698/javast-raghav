package Week0.leetcodearray;
public class toweofHanoi 
{
    static void towerofHanoi(int n,String a,String b,String c)
    {
        if(n==1)
        {
            System.out.println("transfer disk " + n + " from " + a + " to " + c);
            return;
        }
        towerofHanoi(n-1, a, c, b); 
        System.out.println("transfer disk " + n + " from " + a + " to " + c);
        towerofHanoi(n-1, b, a, c); 
    }

    public static void main(String[] args) 
    {
        towerofHanoi(3, "A", "B", "C");
    }

}
