import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BookLibraryThirdSolve {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int totalBooks = Integer.parseInt(input.readLine());
        String format = "dd.MM.yyyy";
        Map<String, Double> booksInfo = new HashMap<>();

        for (int i = 0; i < totalBooks; i++) {
            String[] tokens = input.readLine().split(" ");
            String bookTitle = tokens[0];
            String bookAuthor = tokens[1];
            String bookPublisher = tokens[2];
            LocalDate bookReleaseDate = LocalDate.parse(tokens[3], DateTimeFormatter.ofPattern(format));
            Long bookISBN = Long.parseLong(tokens[4]);
            Double bookPrice = Double.parseDouble(tokens[5]);

            if (booksInfo.containsKey(bookAuthor) == false) {
                booksInfo.put(bookAuthor, bookPrice);
            } else {
                booksInfo.put(bookAuthor, booksInfo.get(bookAuthor) + bookPrice);
            }
        }
        List<Map.Entry<String, Double>> sortedList = new ArrayList<>(booksInfo.entrySet());

        sortedList.sort((e1, e2) -> {
            int compareByValue = e2.getValue().compareTo(e1.getValue()); //Descending by Value
            if (compareByValue == 0) {
                return e1.getKey().compareTo(e2.getKey()); //Lexicographically by Key
            }
            return compareByValue;
        });

        for (Map.Entry<String, Double> entry : sortedList) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
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