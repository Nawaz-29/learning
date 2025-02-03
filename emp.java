// Through reference method
/*
class Student
{
    int rollno;
    String name;
    void insertRecord(int r,String n)
    {
        rollno=r;
        name=n;
    }
    void display()
    {
        System.out.println(rollno+","+name);
    }
}
public class emp
{
    public static void main(String args[])
    {
        Student s1=new Student();
        Student s2=new Student();
        s1.insertRecord(13,"Ram");
        s2.insertRecord(20,"Vamshi");
        s1.display();
        s2.display();
    }
}
 */

/*
class Student
{
    int rollno;
    String name;

    Student(int r,String n)
    {
        rollno=r;
        name=n;
    }
    void display()
    {
        System.out.println(rollno+","+name);
    }
}
public class emp
{
    public static void main(String args[])
    {
        Student s1=new Student(13,"Ram");
        Student s2=new Student(20,"Vamshi");
        s1.display();
        s2.display();
    }
}
 */


/*
class Student
{
    int roll;
    String name;
    static String college="KITS";
    Student(int r, String n)
    {
        roll=r;
        name=n;
    }
    void display()
    {
        System.out.println(roll+","+name+","+college);
    }
}

class emp
{
    public static void main(String args[])
    {
        Student s1=new Student(13,"Ram");
        Student s2=new Student(20,"Vamshi");
        Student.college="BITS";
        s1.display();
        s2.display();
    }
}
 */

/*
class Student1
{
    private int roll;
    private String name;
    private int marks;
    public Student(int r, String n, int m)
    {
        roll=r;
        name=n;
        marks=m;
    }
    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public int getMarks()
    {
        return marks;
    }

    public void setRoll(int roll)
    {
        this.roll=roll;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String toString()
    {
        return "Student{"+"roll="+roll;
    }
}

class emp
{
    public static void main(String args[])
    {
        Student s1=new Student(13,"Ram",78);
        Student s2=new Student(20,"Vamshi",85);
        Student s3=new Student(19,"Varun",90);
        s1.display();
        s2.display();
    }
}
 */