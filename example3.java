class data
{
    private String name;
    private int marks;
    private double percent;

    public data(String name, int marks, double percent)
    {
        this.name = name;
        this.marks = marks;
        this.percent = percent;
    }

    public String getName()
    {
        return name;
    }

    public int getMarks()
    {
        return marks;
    }

    public double getPercent()
    {
        return percent;
    }

    @Override
    public String toString() {
        return "data{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", percent=" + percent +
                '}';
    }

}

class example3
{
    public static void main(String args[])
    {
        data d=new data("Nelson",550,85.0);
        System.out.println(d);
    }
}
