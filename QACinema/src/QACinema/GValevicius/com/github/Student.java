package QACinema.GValevicius.com.github;

import java.time.DayOfWeek;

public class Student extends Ticket {
    public Student(String movieName) {
        super(movieName);
    }

    public Student(String movieName, DayOfWeek showDate) {
        super(movieName, showDate);

    }

    @Override
    public double getTicketPrice() {
        return STUDENT_TICKET_PRICE - super.discount();
    }

    @Override
    public String toString() {
        return "Student ticket\n" + super.toString()
                + "\nTicket price : " + STUDENT_TICKET_PRICE + "\n";
    }
}
