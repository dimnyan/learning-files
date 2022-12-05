import java.util.Scanner;

public class Lesson04Exercise1
{
	public static void main(String args[])
	{
		char[] ascii = {0x221A, 0x00B2, 0x2502, 0x250C, 0x2500, 0x2510, 0x2518, 0x2514 };
		Scanner scanner = new Scanner(System.in);
		String panjang,lebar;
		int intLebar, intPanjang;
		
		System.out.printf("Program menghitung keliling dan luas persegi panjang%n%n");
		
		System.out.printf("    %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c   %n", ascii[3], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[5]);
		System.out.printf("    %c                                    %c   %n", ascii[2], ascii[2]);
		System.out.printf("    %c                                    %c   %n", ascii[2], ascii[2]);
		System.out.printf("    %c                                    %c    l%n", ascii[2], ascii[2]);
		System.out.printf("    %c                                    %c   %n", ascii[2], ascii[2]);
		System.out.printf("    %c                                    %c   %n", ascii[2], ascii[2]);
		System.out.printf("    %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c   %n", ascii[7], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[6]);
		System.out.printf("                       p                     %n");
		System.out.printf("Sisi panjang (p): ");
		panjang = scanner.nextLine();
		System.out.printf("Sisi panjang (p): ");
		lebar = scanner.nextLine();
		
		intPanjang = Integer.parseInt(panjang);
		intLebar = Integer.parseInt(lebar);
		
		System.out.printf("Keliling Persegi Panjang:%n");
		System.out.printf("= 2 x (p + l)%n");
		System.out.printf("= 2 x (%d + %d)%n", intLebar, intPanjang);
		System.out.printf("= %d%n", 2* (intPanjang + intLebar));
		
		System.out.printf("%nLuas Persegi Panjang:%n");
		System.out.printf("= p x l%n");
		System.out.printf("= %d x %d%n", intLebar, intPanjang);
		System.out.printf("= %d%n", intPanjang * intLebar);
		
		
	}
}