package QACinema.GValevicius.com.github;

import java.time.DayOfWeek;

public class Child extends Ticket {
    public Child(String movieName) {
        super(movieName);
    }

    public Child(String movieName, DayOfWeek showDate) {
        super(movieName, showDate);

    }

    @Override
    public double getTicketPrice() {
        return CHILD_TICKET_PRICE - super.discount();
    }

    @Override
    public String toString() {
        return "Child ticket\n" + super.toString()
                + "\nTicket price : " + CHILD_TICKET_PRICE + "\n";
    }
}
