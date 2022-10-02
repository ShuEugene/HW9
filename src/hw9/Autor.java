package hw9;

import java.util.Objects;

public class Autor {
    private final String firstName, lastName;

    public Autor(String firstName, String lastName) {
        if (!firstName.equals("")) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("Имя автора не указано.");
        }
        if (!lastName.equals("")) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Фамилия автора не указана.");
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.firstName, this.lastName);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            throw new IllegalArgumentException("! Сопоставление с null'объектом.");
        }
        if (this == o) {
            return true;
        }
        if (this.hashCode() != o.hashCode()) {
            return false;
        }
        if (!(o instanceof Autor)) {
            throw new IllegalArgumentException("! Попытка сопоставить объекты разных типов.");
        }
        Autor autor = (Autor) o;
        return this.firstName.equals(autor.firstName) && this.lastName.equals(autor.lastName);
    }
}
