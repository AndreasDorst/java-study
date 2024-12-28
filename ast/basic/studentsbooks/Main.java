package ast.basic.studentsbooks;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаем несколько студентов с книгами
        List<Student> students = List.of(
                new Student("Alice", List.of(
                        new Book("The Lord of the Rings", 1954, 1200),
                        new Book("The Hobbit", 1937, 300),
                        new Book("The Silmarillion", 1977, 437),
                        new Book("The Children of Húrin", 2007, 376),
                        new Book("Unfinished Tales", 1980, 480)
                )),
                new Student("Bob", List.of(
                        new Book("The Hitchhiker's Guide to the Galaxy", 1979, 214),
                        new Book("The Restaurant at the End of the Universe", 1980, 224),
                        new Book("Life, the Universe, and Everything", 1982, 216),
                        new Book("So Long, and Thanks for All the Fish", 1984, 192),
                        new Book("Mostly Harmless", 1992, 256)
                )),
                new Student("Charlie", List.of(
                        new Book("Dune", 1965, 658),
                        new Book("Dune Messiah", 1969, 304),
                        new Book("Children of Dune", 1976, 416),
                        new Book("God Emperor of Dune", 1981, 412),
                        new Book("Heretics of Dune", 1984, 400)
                ))
        );

        // Выполняем все операции в одном стриме
        students.stream()
            .peek(System.out::println) // Выводим информацию о каждом студенте на экран
            .flatMap(student -> student.getBooks().stream()) // Преобразуем поток студентов в поток книг,
            // развернув список книг каждого студента
            .sorted(Comparator.comparingInt(Book::getPages)) // Сортируем книги по количеству страниц
            .distinct() // Удаляем дубликаты книг
            .filter(book -> book.getYear() > 2000) // Оставляем только книги, выпущенные после 2000 года
            .limit(3) // Ограничиваем количество книг до трех
            .map(Book::getYear) // Извлекаем год выпуска каждой книги
            .findFirst() // Находим первый элемент (т.е. год выпуска первой книги) в полученном потоке
            .ifPresentOrElse(
                    year -> System.out.println("Год выпуска первой книги: " + year), // Если книга найдена, выводим год ее выпуска
                    () -> System.out.println("Книги не найдены")  // Если книга не найдена, выводим соответствующее сообщение
            );
    }
}
