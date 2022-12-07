public class Book
{
    private String title;
    private String isbn;

    public Book()
    {
        System.out.printf("Book constructor invoke...%n");
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getTitle ()
    {
        return this.title;
    }

    public void setIsbn (String isbn)
    {
        this.isbn = isbn;
    }

    public String getIsbn ()
    {
        return this.isbn;
    }

    public void showDetail ()
    {
        System.out.printf("{title: %s, isbn: %s}%n", title, isbn);
    }
}