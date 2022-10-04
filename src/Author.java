public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getSurname();
    }

    @Override
    public boolean equals(Object other) {
        if (this.hashCode() != other.hashCode() || getClass() != other.getClass()) return false;
        if (this == other) return true;

        if (this.getClass() != other.getClass()) {
            return false;
        }

        Author newAuthor = (Author) other;
        if (name.equals(newAuthor.name)) {
            return surname.equals(newAuthor.surname);
        } else return false;
    }


    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode();
    }
}

