public class Class2
{
    public static void display(Students s)
    {
        System.out.println(s.name);
        System.out.println(s.roll);
        System.out.println(s.sem);
        System.out.println(s.year);
        if(s.getBranchcode()<0 && s.getBranchcode()<4)
        {
            System.out.println("No Branch Assigned");
        }
        else
        {
            System.out.println(s.branch.Branch[s.branch_code]);
        }
    }
    public static void main(String[] args) 
    
    {
        Students s1=new Students();
        Students Utkarsh=new Students(
            69,
            "Utkarsh",
            5,
            2,
            3
        );
        display(Utkarsh);
        Utkarsh.setBranchCode(0);
        Students naman= new Students(
            "Naman",
            1,
            1
        );
        // utkarsh.branch_code=0;
        display(naman);

    }
}
