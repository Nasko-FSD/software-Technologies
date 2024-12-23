import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookLibrarySecondSolve {
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
            LocalDate bookReleaseDate = LocalDate.parse(tokens[3], DateTimeFormatter.ofPattern(format));
            Long bookISBN = Long.parseLong(tokens[4]);
            Double bookPrice = Double.parseDouble(tokens[5]);

            if (totalPrices.containsKey(bookAuthor) == false) {
                totalPrices.put(bookAuthor, bookPrice);
            } else {
                totalPrices.put(bookAuthor, totalPrices.get(bookAuthor) + bookPrice);
            }
        }
        totalPrices
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(b -> System.out.printf("%s -> %.2f%n", b.getKey(), b.getValue()));
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
    private String publisher;
    private LocalDate releaseDate;
    private Long ISBN;
    private Double price;

    Book(String title, String author, String publisher, LocalDate releaseDate, Long isbn, Double price) {
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