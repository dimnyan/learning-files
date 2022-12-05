import java.util.Scanner;

public class Lesson05Exercise5
{
	public static void main(String args[])
	{
		char[] ascii = {0x221A, 0x00B2, 0x2502, 0x250C, 0x2500, 0x2510, 0x2518, 0x2514 };
		Scanner scanner = new Scanner(System.in);
		String nilaiA, nilaiB, nilaiC;
		int intA, intB, intC;
        double hasilSatu, hasilDua;
		
		System.out.printf("%nProgram persamaan kuadrat%n%n");
		System.out.printf("Rumus%n");
		System.out.printf("-----%n");
		System.out.printf("ax%c + bx + c = 0%n%n", ascii[1]);

		System.out.printf("Syarat%n");
		System.out.printf("------%n");
		System.out.printf("            _________%n");
		System.out.printf("      -b + %c b%c - 4ac%n", ascii[0], ascii[1]);
		System.out.printf("x1 = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4]);
		System.out.printf("          2a    %n");
        System.out.printf("            _________%n");
		System.out.printf("      -b - %c b%c - 4ac%n", ascii[0], ascii[1]);
		System.out.printf("x2 = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4]);
		System.out.printf("          2a    %n%n");

        System.out.printf("Isi nilai a, b dan c%n");
		System.out.printf("--------------------%n");

		do{
        	System.out.printf("a: ");
        	nilaiA = scanner.nextLine();
			intA = Integer.parseInt(nilaiA);

			if(intA == 0){
				System.out.printf("%na tidak boleh = 0%n%n");
			} else {

        		System.out.printf("b: ");
        		nilaiB = scanner.nextLine();
        		System.out.printf("c: ");
        		nilaiC = scanner.nextLine();


        		
        		intB = Integer.parseInt(nilaiB);
        		intC = Integer.parseInt(nilaiC);

				double validation = intB*intB - 4*intA*intC;


				if (validation < 0){
					System.out.printf("Persamaan tidak memiliki hasil karena b%c - 4ac < 0%n", ascii[1]);
					break;
				} else {
        			hasilSatu = (-intB + Math.sqrt(intB*intB - 4 * intA * intC)) / (2 * intA);
        			hasilDua = (-intB - Math.sqrt(intB*intB - 4 * intA * intC)) / (2 * intA);



        			System.out.printf("%n            _________   ");
        			System.out.printf("         _______________%n");
					System.out.printf("      -b + %c b%c - 4ac   ", ascii[0], ascii[1]);
					System.out.printf("   -%d + %c %d%c - 4 x %d x %d%n", intB, ascii[0],  intB, ascii[1], intA, intC);
					System.out.printf("x1 = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c   ", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4]);
					System.out.printf(" = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4],ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4]);
					System.out.printf("          2a       ");
					System.out.printf("             2 x %d    %n", intA);
        			System.out.printf("x1 = %f%n", hasilSatu);

        			System.out.printf("%n            _________   ");
        			System.out.printf("         _______________%n");
					System.out.printf("      -b - %c b%c - 4ac   ", ascii[0], ascii[1]);
					System.out.printf("   -%d - %c %d%c - 4 x %d x %d%n", intB, ascii[0],  intB, ascii[1], intA, intC);
					System.out.printf("x1 = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c   ", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4]);
					System.out.printf(" = %c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", ascii[4], ascii[4], ascii[4], ascii[4], ascii[4],ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4], ascii[4]);
					System.out.printf("          2a       ");
					System.out.printf("             2 x %d    %n", intA);
        			System.out.printf("x1 = %f%n", hasilDua);
					break;
				}
			}
			
		} while (true);
    }
}