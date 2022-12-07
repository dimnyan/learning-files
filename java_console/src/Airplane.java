public class Airplane
{
    String type;
    int capacity;

    // constractor
    public Airplane()
    {
        System.out.printf("Constructor berjalan...%n");
    }

    public void startEngine()
    {
        System.out.printf("Mesin berjalan...%n");
    }

    public static void main(String[] args)
    {
        Airplane airplane = new Airplane();
        airplane.startEngine();
    }
}