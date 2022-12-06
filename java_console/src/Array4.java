import java.util.Scanner;

public class Array4
{
    public static void main(String[] Args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] namaMobil;
        
        System.out.printf("Jumlah Tipe Mobil: ");
        String tipeMobil = scanner.nextLine();
        int intTipeMobil = Integer.parseInt(tipeMobil);

        namaMobil = new String[intTipeMobil];
        
        int i;
        for (i = 0; i < intTipeMobil; i++)
        {
            System.out.printf("Tipe Mobil %d: ", i+1);
            namaMobil[i] = scanner.nextLine();
        }

        System.out.printf("%nTerdapat Data Sebanyak: %d%n", intTipeMobil);
        System.out.printf("Data yang tercatat adalah: ");
        for (i = 0; i < intTipeMobil; i++) 
        {
            if (i > 0)
            {
                System.out.printf(", ");
            }
            System.out.printf("%s", namaMobil[i]);
        }


    }
}