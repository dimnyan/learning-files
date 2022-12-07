public class BookExecutor
{
    public static void main(String[] args)
    {
        Book book = new Book();
        System.out.printf("Detail book..%n");
        book.showDetail();

        book.setTitle("Senopati Pamungkas #1");
        book.setIsbn("02783497249");
        System.out.printf("%nDetail book after invocation..%n");
        book.showDetail();
    }
}