package library;

public class Main {
    public static void main(String[] args) {
        // Создание библиотеки
        Library library = new Library();

        // Создание книг с использованием разных конструкторов
        Book book1 = new Book("1984", "Джордж Оруэлл", 1949, true);
        Book book2 = new Book("Преступление и наказание", "Федор Достоевский", 1866, true);
        Book book3 = new Book("Мастер и Маргарита", "Михаил Булгаков");
        Book book4 = new Book("Война и мир", "Лев Толстой", 1869, true);

        // Добавление книг в библиотеку
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Вывод всех доступных книг
        library.printAvailableBooks();

        // Заимствование книги и вывод доступных книг после этого
        System.out.println("\nБерем книгу \"1984\"...");
        book1.borrowBook();

        System.out.println("\nДоступные книги после изменения статуса:");
        library.printAvailableBooks();

        // Возврат книги и вывод доступных книг
        System.out.println("\nВозвращаем книгу \"1984\"...");
        book1.returnBook();

        System.out.println("\nДоступные книги после возврата:");
        library.printAvailableBooks();

        // Поиск книг по автору
        System.out.println("\nПоиск книг по автору 'Джордж Оруэлл':");
        library.findBooksByAuthor("Джордж Оруэлл");
    }
}