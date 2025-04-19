import java.util.*;
import java.util.stream.*;

class Book {
    String title;
    String author;
    String genre;
    double rating;

    public Book(String title, String author, String genre, double rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
    }
}

class BookRecommendation {
    String title;
    double rating;

    public BookRecommendation(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public String toString() {
        return title + " - " + rating;
    }
}

public class BookRecommendations {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Dune", "Frank Herbert", "Science Fiction", 4.5),
            new Book("Foundation", "Isaac Asimov", "Science Fiction", 4.3),
            new Book("Neuromancer", "William Gibson", "Science Fiction", 4.2),
            new Book("The Martian", "Andy Weir", "Science Fiction", 4.6),
            new Book("Snow Crash", "Neal Stephenson", "Science Fiction", 4.1),
            new Book("Hyperion", "Dan Simmons", "Science Fiction", 4.4),
            new Book("2001: A Space Odyssey", "Arthur C. Clarke", "Science Fiction", 4.0),
            new Book("The Left Hand of Darkness", "Ursula K. Le Guin", "Science Fiction", 4.3),
            new Book("Childhood's End", "Arthur C. Clarke", "Science Fiction", 4.2),
            new Book("Old Man's War", "John Scalzi", "Science Fiction", 4.1),
            new Book("Red Mars", "Kim Stanley Robinson", "Science Fiction", 4.0),
            new Book("Brave New World", "Aldous Huxley", "Dystopian", 4.2)
        );

        List<BookRecommendation> filtered = books.stream()
            .filter(b -> b.genre.equals("Science Fiction") && b.rating > 4.0)
            .map(b -> new BookRecommendation(b.title, b.rating))
            .sorted((a, b) -> Double.compare(b.rating, a.rating))
            .limit(10)
            .collect(Collectors.toList());

        int pageSize = 5;
        int pageCount = (int) Math.ceil((double) filtered.size() / pageSize);

        for (int page = 0; page < pageCount; page++) {
            System.out.println("\nPage " + (page + 1));
            filtered.stream()
                .skip(page * pageSize)
                .limit(pageSize)
                .forEach(System.out::println);
        }
    }
}
