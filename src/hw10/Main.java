//  Домашнее задание у Уроку 10 «Методы объектов»

package hw10;

import hw9.Autor;
import hw9.Book;

public class Main {
    public static void main(String[] args) {
        Autor iIvanov = new Autor("Иван", "Иванов");
        Autor pPetrov = new Autor("Пётр", "Петров");

        Book ivanovBook = new Book("Произведение Иванова", iIvanov, 2022);
        Book petrovBook = new Book("Произведение Петрова", pPetrov, 2022);

        System.out.println(ivanovBook + ".");
        System.out.println(petrovBook + ".");

        if (iIvanov.equals(pPetrov)) {
            System.out.println("Автор продублирован.");
        } else {
            System.out.println("Это разные авторы.");
        }

        if (ivanovBook.autor.equals(petrovBook.autor)) {
            System.out.println("Это произведения одного автора.");
        } else {
            System.out.println("У данных произведений разные авторы.");
        }
    }

}
