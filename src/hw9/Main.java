package hw9;

//  Домашние задания к Уроку 9 «Объекты и Классы»
class Main {
    public static void main(String[] args) {
        System.out.println();
        task1();
    }

    static void task1() {
        Autor ngChernyshevskiy = new Autor("Николай", "Чернышевский");
        Autor aSapkovskiy = new Autor("Анджей", "Сапковский");
        Book bookWhatToDo = new Book("Что делать?", ngChernyshevskiy, 1867);
        Book bookWiedzmin = new Book("Ведьмак", aSapkovskiy, 1986);
        bookWiedzmin.setYearOfPublication(1993);
        System.out.println("bookWhatToDo = " + bookWhatToDo);
        System.out.println("bookWiedzmin = " + bookWiedzmin);
    }
}