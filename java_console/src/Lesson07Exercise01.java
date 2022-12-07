import java.util.Scanner;

public class Lesson07Exercise01
{
    public static void main(String[] args)
    {
        StudentRegistration registration = new StudentRegistration();
        registration.readData();
        registration.sortingData();
        registration.showData();

        // Book book = new Book();
        // System.out.printf("Detail book..%n");
        // book.showDetail();

        // book.setTitle("Senopati Pamungkas #1");
        // book.setIsbn("02783497249");
        // System.out.printf("%nDetail book after invocation..%n");
        // book.showDetail();

    }
}