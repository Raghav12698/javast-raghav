public class Students 
{
    int roll=0;
    String name="";
    int sem=0;
    int year=0;
    int branch_code=-1;
    Branch branch=new Branch();
    public Students(){}
    public Students
    (
        int roll,
        String name,
        int sem,
        int branch,
        int year
    )
    {
    this.roll=roll;
    this.name=name;
    this.sem=sem;
    this.year=year;
    this.branch_code=branch;
    }
    public Students(
        String name,
        int year,
        int sem
    )
    {

        this.name=name;
        this.sem=sem;
        this.year=year;
    }
//getters
    int getBranchcode()
    {
        return this.branch_code;
    }
    
    void setBranchCode(int code)
    {
        this.branch_code=code;
    }
}
