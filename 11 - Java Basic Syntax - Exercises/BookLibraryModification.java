import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BookLibraryModification {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int totalBooks = Integer.parseInt(input.readLine());
        String format = "dd.MM.yyyy";
        Map<String, LocalDate> booksInfo = new HashMap<>();

        for (int i = 0; i < totalBooks; i++) {
            String[] tokens = input.readLine().split(" ");
            String bookTitle = tokens[0];
            LocalDate bookReleaseDate = LocalDate.parse(tokens[3], DateTimeFormatter.ofPattern(format));

            booksInfo.put(bookTitle, bookReleaseDate);

        }
        LocalDate checkDate = LocalDate.parse(input.readLine(), DateTimeFormatter.ofPattern(format));

        TreeMap<String, LocalDate> sortedOnes = new TreeMap<>();

        for (Map.Entry<String, LocalDate> entry : booksInfo.entrySet()) {
            if (entry.getValue().isAfter(checkDate)) {
                sortedOnes.put(entry.getKey(), entry.getValue());
            }
        }

        sortedOnes
                .entrySet()
                .stream()
                .sorted(
                        Map.Entry.<String, LocalDate>comparingByValue()
                                .thenComparing(Map.Entry.comparingByKey())
                )
                .forEach(entry -> System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue().format(DateTimeFormatter.ofPattern(format))));
    }
}

class Library {
    private String name;
    private List<Book> books;

    Library(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

class Book {
    private String title;
    private String author;
    private String Publisher;
    private LocalDate releaseDate;
    private Long ISBN;
    private Double price;

    Book(String title, String author, String publisher, LocalDate releaseDate, Long isbn, Double price) {
        this.title = title;
        this.author = author;
        Publisher = publisher;
        this.releaseDate = releaseDate;
        ISBN = isbn;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Long getISBN() {
        return ISBN;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}