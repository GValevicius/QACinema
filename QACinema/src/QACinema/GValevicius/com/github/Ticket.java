package QACinema.GValevicius.com.github;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class Ticket implements CinemaData {

    public String movieName;
    public DayOfWeek showDate;

    public Ticket(String movieName) {
        this.movieName = movieName;
        LocalDate date = LocalDate.now();
        this.showDate = date.getDayOfWeek();
    }

    public Ticket(String movieName, DayOfWeek showDate) {
        this.movieName = movieName;
        this.showDate = showDate;
    }

    public abstract double getTicketPrice();

    public double discount() {

        if (CinemaData.DISCOUNT_DAY == showDate)
            return DISCOUNT_PER_TICKET;
        return 0;
    }

    @Override
    public String toString() {
        return "Movie : " + movieName
                + "\nDate : "
                + showDate
                + "\nDiscount : "
                + discount();
    }
}
