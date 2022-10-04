public class Book {
    private final String nameBook;
    private int yearBook;
    private final Author author;


    public Book(String nameBook, int yearBook, Author author) {
        this.nameBook = nameBook;
        this.yearBook = yearBook;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getYearBook() {
        return yearBook;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;

    }

    @Override
    public String toString() {
        return getNameBook() + ", " + getYearBook() + ", " + getAuthor();

    }

    @Override
    public boolean equals(Object other) {
        if (this.hashCode() != other.hashCode() || getClass() != other.getClass()) return false;
        if (this == other) return true;

        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book newBook = (Book) other;
        return nameBook.equals(newBook.nameBook);
    }


    @Override
    public int hashCode() {
        return nameBook.hashCode();
    }

}

