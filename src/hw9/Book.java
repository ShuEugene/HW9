package hw9;

import java.util.Objects;

public class Book {
    private final String title;
    public Autor autor;
    private int yearOfPublication;

    public Book(String title, Autor autor, int yearOfPublication) {
        if (!title.equals("")) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Название не указано.");
        }
        if (autor != null) {
            this.autor = autor;
        } else {
            throw new IllegalArgumentException("Автор не указан.");
        }
        if (yearOfPublication > 0) {
            this.yearOfPublication = yearOfPublication;
        } else {
            throw new IllegalArgumentException("Год указан некорректно.");
        }
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
        if (yearOfPublication > 0) {
            this.yearOfPublication = yearOfPublication;
        } else {
            throw new IllegalArgumentException("Год указан некорректно.");
        }
    }

    @Override
    public String toString() {
        return "Наименование: \"" + this.title
                + "\"; автор: " + this.autor
                + "; год " + this.yearOfPublication;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, autor, yearOfPublication);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            throw new IllegalArgumentException("! Сопоставление с null'объектом.");
        }
        if (this == o) return true;
        if (this.hashCode() != o.hashCode()) {
            return false;
        }
        if (!(o instanceof Book)) {
            throw new IllegalArgumentException("! Попытка сопоставить данные объектов разных типов.");
        }
        Book book = (Book) o;
        return this.title.equals(book.title)
                && this.autor.equals(book.autor)
                && this.yearOfPublication == book.yearOfPublication;
    }
}
