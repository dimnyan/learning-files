public class Classroom
{
    private String name;
    private String level;

    public Classroom()
    {
        System.out.printf("Classroom constructor invoke...%n");
    }

    public void setLevel (String level)
    {
        this.level = level;
    }

    public String getLevel ()
    {
        return this.level;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getName ()
    {
        return this.name;
    }

    public void showDetail ()
    {
        System.out.printf("{level: %s, name: %s}%n", level, name);
    }
}