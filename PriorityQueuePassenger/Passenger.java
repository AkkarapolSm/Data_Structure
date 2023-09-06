package PriorityQueuePassenger;

import java.util.HashMap;
import java.util.Map;

public class Passenger implements Comparable<Passenger> {
    private String name;
    private String ticketType; // First, Business, Economy


    private static Map<String, Integer> ticketOrder = new HashMap<String, Integer>();

    static {
        ticketOrder.put("FIRST", 1);
        ticketOrder.put("BUSINESS", 2);
        ticketOrder.put("ECONOMY", 3);
    }

    @Override
    public String toString() {
        return "Passenger [name=" + name + ", ticketType=" + ticketType + "]";
    }


    public Passenger(String name, String ticketType) {
        this.name = name;
        this.ticketType = ticketType;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTicketType() {
        return ticketType;
    }
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }


    @Override
    public int compareTo(Passenger o) {
       
        return ticketOrder.get(this.getTicketType().toUpperCase(null))
                .compareTo(ticketOrder.get(o.getTicketType().toUpperCase()));
    }

    
}
