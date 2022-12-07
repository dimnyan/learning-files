import java.util.Scanner;

public class Lesson06Exercise01
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        String[] namaSiswa;
        String temp;
        int i, j, hasilBanding;

        System.out.printf("%nProgram mengurutkan nama siswa%n");
        System.out.printf("%nJumlah Siswa: ");
        String strBanyakSiswa = scanner.nextLine();
        int intBanyakSiswa = Integer.parseInt(strBanyakSiswa);

        namaSiswa = new String [intBanyakSiswa];

        System.out.printf("%n");

        for (i = 0; i < intBanyakSiswa; i++)
        {
            System.out.printf("Nama Siswa Ke-%d: ", i+1);
            namaSiswa[i] = scanner.nextLine();
        }

        
        

        for(i = 0; i < intBanyakSiswa; i++)
        {
            for (j = i + 1; j < intBanyakSiswa; j++)
            {
                hasilBanding = namaSiswa[i].compareToIgnoreCase(namaSiswa[j]);
                if (hasilBanding > 0)
                {
                    temp = namaSiswa[i];
                    namaSiswa[i] = namaSiswa[j];
                    namaSiswa[j] = temp;
                }
                System.out.printf("%d%n", hasilBanding);
            }
        }

        


        System.out.printf("%nNama Siswa di urutkan berdasarkan abjad adalah:%n");

        for (i = 0; i < intBanyakSiswa; i++)
        {
            System.out.printf("%d. ", i+1);
            System.out.printf("%s%n", namaSiswa[i]);
        }
    }
}