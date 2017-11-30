package QACinema.GValevicius.com.github;

import java.time.DayOfWeek;

public interface CinemaData {
    double STANDARD_TICKET_PRICE = 8;
    double OAP_TICKET_PRICE = 6;
    double STUDENT_TICKET_PRICE = 6;
    double CHILD_TICKET_PRICE = 4;
    DayOfWeek DISCOUNT_DAY = DayOfWeek.WEDNESDAY;
    double DISCOUNT_PER_TICKET = 2;
}

