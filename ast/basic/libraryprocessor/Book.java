package ast.basic.libraryprocessor;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    // Конструктор, принимающий все поля
    public Book(String title, String author, int year, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    // Конструктор, принимающий только название и автора, остальные поля по умолчанию
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = 0;           // По умолчанию год издания равен 0
        this.isAvailable = true; // По умолчанию книга доступна
    }

    // Метод для изменения статуса книги (если она доступна, то забираем)
    public void borrowBook() {
        if (this.isAvailable) {
            this.isAvailable = false;
            System.out.println("Вы взяли книгу: " + title);
        } else {
            System.out.println("Книга \"" + title + "\" уже на руках.");
        }
    }

    // Метод для возврата книги
    public void returnBook() {
        this.isAvailable = true;
        System.out.println("Вы вернули книгу: " + title);
    }

    // Метод для отображения информации о книге
    public void displayInfo() {
        System.out.println("Название: " + title + ", Автор: " + author + ", Год издания: " + year + ", Доступна: " + (isAvailable ? "Да" : "Нет"));
    }

    // Геттеры для работы с полями
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
