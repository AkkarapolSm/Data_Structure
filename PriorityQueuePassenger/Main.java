package PriorityQueuePassenger;

import java.util.PriorityQueue;

public class Main {

    static PriorityQueue<Passenger> passenger = new PriorityQueue<Passenger>();
    public static void main(String[] args) {
        createData();
        pollData();
    }

    private static void createData() {
        passenger.offer(new Passenger("Peter", "ECONOMY"));
        passenger.offer(new Passenger("Linda", ""));
        passenger.offer(new Passenger("Cindy", ""));
        passenger.offer(new Passenger("Jenny", "FIRST"));
        passenger.offer(new Passenger("Clark", ""));
        passenger.offer(new Passenger("Bruce", ""));
        passenger.offer(new Passenger("Joney", ""));
        passenger.offer(new Passenger("Alex", ""));
        passenger.offer(new Passenger("Nick", ""));
        passenger.offer(new Passenger("Jack", ""));
        
    }

    private static void pollData() {
        int q = 0;
        while(!passenger.isEmpty()) {
            System.out.printf("%s -> %s%n", ++q, passenger.poll());
        }
    }


}
