class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
    }
}

class TicketReservationSystem {
    private Ticket tail = null;

    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (tail == null) {
            tail = newTicket;
            tail.next = tail;
        } else {
            newTicket.next = tail.next;
            tail.next = newTicket;
            tail = newTicket;
        }
    }

    public void removeTicket(int ticketId) {
        if (tail == null) return;

        Ticket current = tail.next;
        Ticket prev = tail;
        boolean found = false;

        do {
            if (current.ticketId == ticketId) {
                found = true;
                break;
            }
            prev = current;
            current = current.next;
        } while (current != tail.next);

        if (!found) return;

        if (current == tail && current.next == tail) {
            tail = null;
        } else {
            if (current == tail) tail = prev;
            prev.next = current.next;
        }
    }

    public void displayTickets() {
        if (tail == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket current = tail.next;
        do {
            System.out.println("Ticket ID: " + current.ticketId +
                               ", Customer: " + current.customerName +
                               ", Movie: " + current.movieName +
                               ", Seat: " + current.seatNumber +
                               ", Time: " + current.bookingTime);
            current = current.next;
        } while (current != tail.next);
    }

    public void searchByCustomer(String customerName) {
        if (tail == null) {
            System.out.println("No tickets found.");
            return;
        }

        Ticket current = tail.next;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(customerName)) {
                System.out.println("Ticket ID: " + current.ticketId +
                                   ", Movie: " + current.movieName +
                                   ", Seat: " + current.seatNumber +
                                   ", Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != tail.next);

        if (!found) System.out.println("No tickets found for customer: " + customerName);
    }

    public void searchByMovie(String movieName) {
        if (tail == null) {
            System.out.println("No tickets found.");
            return;
        }

        Ticket current = tail.next;
        boolean found = false;
        do {
            if (current.movieName.equalsIgnoreCase(movieName)) {
                System.out.println("Ticket ID: " + current.ticketId +
                                   ", Customer: " + current.customerName +
                                   ", Seat: " + current.seatNumber +
                                   ", Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != tail.next);

        if (!found) System.out.println("No tickets found for movie: " + movieName);
    }

    public int totalTickets() {
        if (tail == null) return 0;

        int count = 0;
        Ticket current = tail.next;
        do {
            count++;
            current = current.next;
        } while (current != tail.next);
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        TicketReservationSystem trs = new TicketReservationSystem();

        trs.addTicket(101, "Alice", "Inception", "A1", "10:00 AM");
        trs.addTicket(102, "Bob", "Inception", "A2", "10:00 AM");
        trs.addTicket(103, "Charlie", "Interstellar", "B1", "1:00 PM");

        trs.displayTickets();

        trs.searchByCustomer("Alice");
        trs.searchByMovie("Inception");

        System.out.println("Total Tickets Booked: " + trs.totalTickets());

        trs.removeTicket(102);
        trs.displayTickets();
        System.out.println("Total Tickets Booked: " + trs.totalTickets());
    }
}
