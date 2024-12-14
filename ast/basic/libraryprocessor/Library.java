package ast.basic.libraryprocessor;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    // Статический блок инициализации для добавления нескольких книг
    static {
        System.out.println("Библиотека инициализирована.");
    }

    public Library() {
        this.books = new ArrayList<>();
    }

    // Метод для добавления книги в библиотеку
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга \"" + book.getTitle() + "\" добавлена в библиотеку.");
    }

    // Метод для вывода всех доступных книг
    public void printAvailableBooks() {
        System.out.println("Доступные книги:");
        for (Book book : books) {
            if (book.isAvailable()) {
                book.displayInfo();
            }
        }
    }

    // Метод для поиска книг по автору
    public void findBooksByAuthor(String author) {
        System.out.println("Книги автора " + author + ":");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                book.displayInfo();
            }
        }
    }
}