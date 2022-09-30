package HW9;

class Book {
    private final String title;
    Autor autor;
    private int yearOfPublication;

    Book(String title, Autor autor, int yearOfPublication) {
        this.title = title;
        this.autor = autor;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
