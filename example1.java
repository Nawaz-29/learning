import java.util.SortedSet;

class Student4
{
    private String name;
    private int age;
    private int marks;
    public Student4(String n,int a,int m)
    {
        this.name=n;
        this.age=a;
        this.marks=m;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public int getMarks()
    {
        return marks;
    }
}
class example1
{
    public static void main(String args[])
    {
        Student4 p=new Student4("Vamshi",18,85);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getMarks());
    }
}
