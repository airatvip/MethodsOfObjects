public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Антон", "Чехов");
        Author author2 = new Author("Федор", "Достоевский");
        Author newAuthor = new Author( "Федор", "Достоевский");
        Book book1 = new Book("Вишневый сад", 1904, author1);
        Book book2 = new Book("Преступление и наказание", 1866, author2);
        Book newBook = new Book ( "Преступление и наказание", 1869, newAuthor);

        int newYearBook = 1905;
        book1.setYearBook(newYearBook);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println(author2.equals(newAuthor));
        System.out.println(book2.equals(newBook));


    }
}