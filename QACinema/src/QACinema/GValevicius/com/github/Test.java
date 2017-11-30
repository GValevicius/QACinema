package QACinema.GValevicius.com.github;

import java.time.DayOfWeek;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.addOrder(TicketType.STUDENT, "Justice League", DayOfWeek.WEDNESDAY);
        order.addOrder("Wonder", TicketType.STUDENT);
        order.addOrder(TicketType.CHILD, "Justice League", DayOfWeek.MONDAY);
        order.addOrder("Wonder", TicketType.CHILD);
        order.addOrder(TicketType.OAP, "Justice League", DayOfWeek.WEDNESDAY);
        order.addOrder("Wonder", TicketType.OAP);
        order.addOrder(TicketType.STANDARD, "Justice League", DayOfWeek.WEDNESDAY);
        order.addOrder("Wonder", TicketType.STANDARD);
        System.out.println(order);
    }
}
