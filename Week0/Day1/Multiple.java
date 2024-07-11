package Day1;

public class Multiple {

    public static void main(String[] args) {
        int i=5;
        while(i<15)
        {
            if(i%2==0&&i%7==0)
            {
                System.out.println(i);
                i++;
            }
            i++;
        }
        
    }
}
