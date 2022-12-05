import java.util.Scanner;

public class Variable2
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		String nama;
		
		System.out.printf("Nama: ");
		nama = scanner.nextLine();
		
		System.out.printf("Hello, %s", nama);
	}
}