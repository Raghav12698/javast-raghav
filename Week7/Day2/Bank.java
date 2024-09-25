package Week7.Day2;
import java.util.*;
public class Bank 

{
    int accNum;
    String accName;
    protected float balance;
    String IFSCcode;
    public static boolean isEmpty(float balance)
    {
        if(balance>0)
        {
            return false;
        }
        return true;
    }
    public static void Deposit()
    {
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();

        System.out.println("Please deposit in the box:");
    }
    public static void Withdraw(float balance)
    {
        System.out.println("Enter the amount to withdarw");
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        if(balance==0 && balance<amount)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            balance=balance-amount;
            System.out.println("Remaining Balance"+ balance);
        }
        sc.close();
    }
    


}
