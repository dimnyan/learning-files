import java.util.Scanner;

public class OperatorPersen
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        String strA,strB;
        int intA, intB;

        System.out.printf("Program menghitung a persen b%n");
        System.out.printf("a: ");
        strA = scanner.nextLine();
        System.out.printf("b: ");
        strB = scanner.nextLine();

        intA = Integer.parseInt(strA);
        intB = Integer.parseInt(strB);

        System.out.printf("%n%d persen %d adalah%n= %d ", intA, intB, intA%intB);
        
    }
}