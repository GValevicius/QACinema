package QACinema.GValevicius.com.github;

import java.time.DayOfWeek;

public class OAP extends Ticket {
    public OAP(String movieName) {
        super(movieName);
    }

    public OAP(String movieName, DayOfWeek showDate) {
        super(movieName, showDate);

    }

    @Override
    public double getTicketPrice() {
        return CinemaData.OAP_TICKET_PRICE - super.discount();
    }

    @Override
    public String toString() {
        return "OAP ticket\n" + super.toString()
                + "\nTicket price : " + OAP_TICKET_PRICE + "\n";
    }
}
