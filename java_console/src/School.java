public class School
{
    private String name;
    private String address;

    public School()
    {
        System.out.printf("School constructor invoke...%n");
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getName ()
    {
        return this.name;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public String getAddress ()
    {
        return this.address;
    }

    public void showDetail ()
    {
        System.out.printf("{name: %s, address: %s}%n", name, address);
    }
}