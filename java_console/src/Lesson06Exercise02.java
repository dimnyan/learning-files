import java.util.Scanner;

public class Lesson06Exercise02
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        String[] namaPelajaran, nilaiPelajaran;
        String temp;
        int i, j, hasilBanding;

        System.out.printf("%nProgram mengurutkan nama siswa%n");
        System.out.printf("%nNama Siswa: ");
        String namaSiswa = scanner.nextLine();

        System.out.printf("%nJumlah Pelajaran: ");
        String strJmlhPel = scanner.nextLine();
        int intJmlhPel = Integer.parseInt(strJmlhPel);

        namaPelajaran = new String [intJmlhPel];
        nilaiPelajaran = new String [intJmlhPel];

        System.out.printf("%n");

        for (i = 0; i < intJmlhPel; i++)
        {
            System.out.printf("Nama: ");
            namaPelajaran[i] = scanner.nextLine();
            System.out.printf("Nilai: ");
            nilaiPelajaran[i] = scanner.nextLine();
        }

        for(i = 0; i < intJmlhPel; i++)
        {
            for (j = i + 1; j < intJmlhPel; j++)
            {
                hasilBanding = nilaiPelajaran[i].compareToIgnoreCase(nilaiPelajaran[j]);
                if (hasilBanding < 0)
                {
                    temp = nilaiPelajaran[i];
                    nilaiPelajaran[i] = nilaiPelajaran[j];
                    nilaiPelajaran[j] = temp;
                }
                System.out.printf("%d%n", hasilBanding);
            }
        }

        System.out.printf("%nInformasi nilai Siswa%nNama Siswa: %s%n", namaSiswa);
        System.out.printf("%nHasil ujian pelajaran siswa di urutkan berdasarkan nilai tertinggi:%n");
        System.out.printf("%nNo Pelajaran     Nilai");
        System.out.printf("%n======================%n");
            
        for(i = 0; i < intJmlhPel;i++)
        {
            System.out.printf(" %d %-15s %s%n", i+ 1, namaPelajaran[i], nilaiPelajaran[i]);
        }
        System.out.printf("======================%n");

    }
}