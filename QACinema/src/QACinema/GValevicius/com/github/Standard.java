package QACinema.GValevicius.com.github;

import java.time.DayOfWeek;

public class Standard extends Ticket {
    public Standard(String movieName) {
        super(movieName);
    }

    public Standard(String movieName, DayOfWeek showDate) {
        super(movieName, showDate);
    }

    @Override
    public double getTicketPrice() {
        return STANDARD_TICKET_PRICE - super.discount();
    }

    @Override
    public String toString() {
        return "Standard ticket\n" + super.toString()
                + "\nTicket price : " + STANDARD_TICKET_PRICE + "\n";
    }
}
