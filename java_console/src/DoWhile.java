import java.util.Scanner;

public class DoWhile
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        String angka;
        int i = 0, counter;

        System.out.printf("Isi angka: ");
        angka = scanner.nextLine();
        counter = Integer.parseInt(angka);

        System.out.printf("sebelum do while%n");

        do {
            System.out.printf("i: %d%n", i+1);
            i++;
        }   while (i < counter);
            System.out.printf("setelah do while%n");
        
	}
}