import java.util.Scanner;

public class Lesson04Exercise3
{
	public static void main(String args[])
	{
		char[] ascii = {0x221A, 0x00B2, 0x2502, 0x250C, 0x2500, 0x2510, 0x2518, 0x2514 };
		Scanner scanner = new Scanner(System.in);
		String nilaiA, nilaiB, nilaiC;
		int intA, intB, intC;
        double hasilSatu, hasilDua;
		
		System.out.printf("%nProgram persamaan kuadrat%n%n");
		System.out.printf("ax%c + bx + c = 0%n", ascii[1]);

		System.out.printf("            _________%n");
		System.out.printf("      -b + %c b%c - 4ac%n", ascii[0], ascii[1]);
		System.out.printf("x1 = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4]);
		System.out.printf("          2a    %n");
        System.out.printf("            _________%n");
		System.out.printf("      -b - %c b%c - 4ac%n", ascii[0], ascii[1]);
		System.out.printf("x2 = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4]);
		System.out.printf("          2a    %n%n");

        System.out.printf("Isi nilai a, b dan c%n");
        System.out.printf("a: ");
        nilaiA = scanner.nextLine();
        System.out.printf("b: ");
        nilaiB = scanner.nextLine();
        System.out.printf("c: ");
        nilaiC = scanner.nextLine();

        intA = Integer.parseInt(nilaiA);
        intB = Integer.parseInt(nilaiB);
        intC = Integer.parseInt(nilaiC);


        hasilSatu = -intB + Math.sqrt(intB*intB - 4 * intA * intC) / (2 * intA);
        hasilDua = -intB - Math.sqrt(intB*intB - 4 * intA * intC) / (2 * intA);
        

        
        System.out.printf("%n            _________%n");
		System.out.printf("      -b + %c b%c - 4ac%n", ascii[0], ascii[1]);
		System.out.printf("x1 = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4]);
		System.out.printf("          2a    %n");
        System.out.printf("x1 = %f%n", hasilSatu);

        System.out.printf("            _________%n");
		System.out.printf("      -b - %c b%c - 4ac%n", ascii[0], ascii[1]);
		System.out.printf("x2 = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4]);
		System.out.printf("          2a    %n%n");
        System.out.printf("x2 = %f", hasilDua);


    }
}