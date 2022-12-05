import java.util.Scanner;

public class ForBreakStatement
{
	public static void main(String[] args)
	{
		// Scanner scanner = new Scanner(System.in);
        // String strA,strB;
        // int intA, intB;

        // System.out.printf("Program menghitung a persen b%n");
        // System.out.printf("a: ");
        // strA = scanner.nextLine();
        // System.out.printf("b: ");
        // strB = scanner.nextLine();

        // intA = Integer.parseInt(strA);
        // intB = Integer.parseInt(strB);

        // System.out.printf("%n%d persen %d adalah%n= %d ", intA, intB, intA%intB);

        // VIDEO 22
        
        for (i = 1; true; i++) {
            if (i % 2 == 1) {
                numberOfOdd++;
                System.out.printf("%d", i);
            }
            if (numberOfOdd == limitNumber) {
                break;
            }
            System.out.printf("Setelah break...%n");
        }
        System.out.printf("Setelah for...%n");

    }
}