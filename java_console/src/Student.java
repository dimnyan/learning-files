
public class Student
{
    private String nisn;
    private String name;
    private String gender;
    private String address;

    public Student()
    {
        System.out.printf("Student constructor invoke...%n");
    }

    // NISN
    public void setNisn (String nisn)
    {
        this.nisn = nisn;
    }
    public String getNisn ()
    {
        return this.nisn;
    }

    // NAME
    public void setName (String name)
    {
        this.name = name;
    }

    public String getName ()
    {
        return this.name;
    }

    // Gender
    public void setGender (String gender)
    {
        this.gender = gender;
    }

    public String getGender ()
    {
        return this.gender;
    }

    // Address
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
        System.out.printf("{nisn: %s, name: %s, gender: %s, address: %s}%n", nisn, name, gender, address);
    }
}