import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class BookLibrary {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int totalBooks = Integer.parseInt(input.readLine());
        String format = "dd.MM.yyyy";
        Map<String, Double> totalPrices = new HashMap<>();

        for (int i = 0; i < totalBooks; i++) {
            String[] tokens = input.readLine().split(" ");
            String bookTitle = tokens[0];
            String bookAuthor = tokens[1];
            String bookPublisher = tokens[2];
            LocalDate bookReleaseDate = LocalDate
                    .parse(tokens[3], DateTimeFormatter.ofPattern(format));
            long bookISBN = Long.parseLong(tokens[4]);
            double bookPrice = Double.parseDouble(tokens[5]);

            totalPrices.put(bookAuthor, totalPrices.getOrDefault(bookAuthor, 0.0) + bookPrice);
        }
            totalPrices
                    .entrySet()
                    .stream()
                    .sorted(Map.Entry.<String, Double>comparingByValue(Comparator.reverseOrder())
                    .thenComparing(Map.Entry.comparingByKey()))
                            .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
}

class Library {
    private String name;
    private ArrayList<Book> books;

    Library(String name, ArrayList<Book> books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}

class Book {
    private String title;
    private String author;
    private String publisher;
    private LocalDate releaseDate;
    private long ISBN;
    private double price;

    Book(String title, String author, String publisher, LocalDate releaseDate, long isbn, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
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
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}