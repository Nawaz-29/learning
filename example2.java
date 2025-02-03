class voter
{
    private String name;
    private int age;

    public void setName(String n)
    {
        this.name=n;
    }

    public void setAge(int a)
    {
        if(a>0)
        {
            this.age = a;
        }
        else
        {
            System.out.println("Enter positive age");
        }
    }
}

class example2
{
    public static void main(String args[])
    {
        voter v=new voter();
        v.setName("Vamshi");
        v.setAge(15);
        System.out.println("Details added");
    }
}
