import java.util.Scanner;

public class SwitchCase
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        String numberDay;

        System.out.printf("Number of Day [1 - 7]: ");
        numberDay = scanner.nextLine();

        switch (numberDay)
        {
            case 1:
                System.out.printf("1st day is Sunday%n");
                break;
            case 2:
                System.out.printf("2st day is Monday%n");
                break;
            default :
                System.out.printf("your input isnt recognized%n");
                break;
        }
	}
}