public class Array3
{
    public static void main(String[] Args)
    {
        String[] name = {"Dimas", "Nyoman"};
        // String firstName = name[0];
        // String lastName = name[1];
        int i;

// FORRRRRRRRRR
        System.out.printf("%nMenggungakan For%n");
        for(i = 0; i < name.length; i++)
        {
            System.out.printf("name[%d]: %s%n", i, name[i]);
        }

        

// WHILEEEEE
        System.out.printf("%nMenggungakan While%n");
        i = 0;
        while (i < name.length)
        {
            System.out.printf("name[%d]: %s%n", i, name[i]);
            i++;
        }

// FOR EACH
        System.out.printf("%nMenggungakan For Each%n");
        i = 0;
        for(String nama: name)
        {
            System.out.printf("name[%d]: %s%n", i, nama);
            i++;
        }
    }
}