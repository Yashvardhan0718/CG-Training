class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie prev;
    Movie next;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}

class MovieManagementSystem {
    private Movie head;
    private Movie tail;

    public MovieManagementSystem() {
        head = null;
        tail = null;
    }

    public void addMovieAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    public void addMovieAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    public void addMovieAtPosition(String title, String director, int year, double rating, int position) {
        if (position <= 1 || head == null) {
            addMovieAtBeginning(title, director, year, rating);
            return;
        }

        Movie newMovie = new Movie(title, director, year, rating);
        Movie current = head;
        int index = 1;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current == null || current.next == null) {
            addMovieAtEnd(title, director, year, rating);
        } else {
            newMovie.next = current.next;
            newMovie.prev = current;
            current.next.prev = newMovie;
            current.next = newMovie;
        }
    }

    public void removeMovieByTitle(String title) {
        Movie current = head;

        while (current != null && !current.title.equalsIgnoreCase(title)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Movie not found.");
            return;
        }

        if (current == head) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        System.out.println("Movie \"" + title + "\" removed successfully.");
    }

    public void searchByDirector(String director) {
        Movie current = head;
        boolean found = false;
        while (current != null) {
            if (current.director.equalsIgnoreCase(director)) {
                displayMovie(current);
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("No movies found by director: " + director);
    }

    public void searchByRating(double rating) {
        Movie current = head;
        boolean found = false;
        while (current != null) {
            if (current.rating == rating) {
                displayMovie(current);
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("No movies found with rating: " + rating);
    }

    public void updateRatingByTitle(String title, double newRating) {
        Movie current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                current.rating = newRating;
                System.out.println("Rating updated for movie \"" + title + "\".");
                return;
            }
            current = current.next;
        }
        System.out.println("Movie not found.");
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("No movies in the list.");
            return;
        }

        System.out.println("Movies in forward order:");
        Movie current = head;
        while (current != null) {
            displayMovie(current);
            current = current.next;
        }
    }

    public void displayReverse() {
        if (tail == null) {
            System.out.println("No movies in the list.");
            return;
        }

        System.out.println("Movies in reverse order:");
        Movie current = tail;
        while (current != null) {
            displayMovie(current);
            current = current.prev;
        }
    }

    private void displayMovie(Movie movie) {
        System.out.println("Title: " + movie.title +
                           ", Director: " + movie.director +
                           ", Year: " + movie.year +
                           ", Rating: " + movie.rating);
    }
}

public class Main {
    public static void main(String[] args) {
        MovieManagementSystem mms = new MovieManagementSystem();

        mms.addMovieAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        mms.addMovieAtBeginning("The Godfather", "Francis Ford Coppola", 1972, 9.2);
        mms.addMovieAtPosition("Interstellar", "Christopher Nolan", 2014, 8.6, 2);

        mms.displayForward();
        mms.displayReverse();

        mms.searchByDirector("Christopher Nolan");
        mms.searchByRating(9.2);

        mms.updateRatingByTitle("Inception", 9.0);
        mms.removeMovieByTitle("The Godfather");

        mms.displayForward();
    }
}
