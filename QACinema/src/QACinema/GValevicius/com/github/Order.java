package QACinema.GValevicius.com.github;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Ticket> list;

    public Order() {
        list = new ArrayList<>();
    }

    public void addOrder(TicketType ticketType, String movieName, DayOfWeek showDay) {
        switch (ticketType) {
            case STANDARD:
                list.add(new Standard(movieName, showDay));
                break;
            case STUDENT:
                list.add(new Student(movieName, showDay));
                break;
            case OAP:
                list.add(new OAP(movieName, showDay));
                break;
            case CHILD:
                list.add(new Child(movieName, showDay));
                break;
            default:
                break;
        }
    }


    public void addOrder(String movieName, TicketType ticketType) {
        switch (ticketType) {
            case STANDARD:
                list.add(new Standard(movieName));
                break;
            case STUDENT:
                list.add(new Student(movieName));
                break;
            case OAP:
                list.add(new OAP(movieName));
                break;
            case CHILD:
                list.add(new Child(movieName));
                break;
            default:
                break;
        }
    }

    @Override
    public String toString() {
        for (Ticket t : list) System.out.println(t);
        return "The total cost of tickets for this movie is \u00a3" + getTotal();
    }

    public double getTotal() {
        double total = 0;
        for (Ticket t : list) total += t.getTicketPrice();
        return total;
    }
}
