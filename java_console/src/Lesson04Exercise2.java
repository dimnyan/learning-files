import java.util.Scanner;

public class Lesson04Exercise2
{
	public static void main(String args[])
	{
		char[] ascii = {0x221A, 0x00B2, 0x2502, 0x250C, 0x2500, 0x2510, 0x2518, 0x2514 };
		Scanner scanner = new Scanner(System.in);
		String datar,tegak;
		int intDatar, intTegak;
		
		System.out.printf("%nProgram menghitung sisi miring segitiga siku-siku%n%n");
		
		System.out.printf("        /%c   %n",  ascii[2]);
		System.out.printf("       / %c   %n",  ascii[2]);
		System.out.printf("   c  /  %c  b%n",  ascii[2]);
		System.out.printf("     /   %c   %n", ascii[2]);
		System.out.printf("    /    %c   %n", ascii[2]);
		System.out.printf("    %c%c%c%c%c%c   %n", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[6]);
		System.out.printf("       a    %n");

		System.out.printf("     _______%n");
		System.out.printf("c = %ca%c + b%c%n", ascii[0], ascii[1], ascii[1]);
        System.out.printf("a = sisi datar%n", ascii[0], ascii[1], ascii[1]);
        System.out.printf("b = sisi tegak%n", ascii[0], ascii[1], ascii[1]);
        System.out.printf("c = sisi miring%n%n", ascii[0], ascii[1], ascii[1]);

		System.out.printf("Sisi datar: ");
		datar = scanner.nextLine();
		System.out.printf("Sisi tegak: ");
		tegak = scanner.nextLine();
		System.out.printf("Sisi miring%n");

		intDatar = Integer.parseInt(datar);
		intTegak = Integer.parseInt(tegak);
		
        System.out.printf("     _______%n");
		System.out.printf("c = %ca%c + b%c%n", ascii[0], ascii[1], ascii[1]);
        System.out.printf("     _______%n");
		System.out.printf("c = %c%d%c + %d%c%n", ascii[0], intDatar, ascii[1], intTegak, ascii[1]);

        double hasil = Math.sqrt(intDatar*intDatar + intTegak*intTegak);
		System.out.printf("c = %.2f%n", hasil);
		
	}
}