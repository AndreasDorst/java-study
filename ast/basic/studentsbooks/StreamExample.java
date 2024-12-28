package ast.basic.studentsbooks;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamExample {
    public static void main(String[] args) {
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

        // 3.1 Вывести в консоль каждого студента
        students.stream().forEach(System.out::println);

        // 3.2 Получить для каждого студента список книг
        students.stream()
                .map(Student::getBooks)
                .forEach(System.out::println);

        // 3.3 Получить книги
        students.stream()
                .flatMap(student -> student.getBooks().stream())
                .forEach(System.out::println);

        // 3.4 Отсортировать книги по количеству страниц
        students.stream()
                .flatMap(student -> student.getBooks().stream())
                .sorted(Comparator.comparingInt(Book::getPages))
                .forEach(System.out::println);

        // 3.5 Оставить только уникальные книги
        students.stream()
                .flatMap(student -> student.getBooks().stream())
                .distinct()
                .forEach(System.out::println);

        // 3.6 Отфильтровать книги, оставив только те, которые были выпущены после 2000 года
        students.stream()
                .flatMap(student -> student.getBooks().stream())
                .filter(book -> book.getYear() > 2000)
                .forEach(System.out::println);

        // 3.7 Ограничить стрим на 3 элементах
        students.stream()
                .flatMap(student -> student.getBooks().stream())
                .limit(3)
                .forEach(System.out::println);

        // 3.8 Получить из книг годы выпуска
        students.stream()
                .flatMap(student -> student.getBooks().stream())
                .map(Book::getYear)
                .forEach(System.out::println);

        // 3.9 Вернуть Optional от книги (короткое замыкание)
        Optional<Book> optionalBook = students.stream()
                .flatMap(student -> student.getBooks().stream())
                .filter(book -> book.getYear() > 2000)
                .findFirst();

        // 3.10 Вывести в консоль год выпуска найденной книги, либо запись о том, что такая книга отсутствует
        optionalBook.ifPresentOrElse(
                book -> System.out.println("Year: " + book.getYear()),
                () -> System.out.println("No book found after 2000")
        );
    }
}
