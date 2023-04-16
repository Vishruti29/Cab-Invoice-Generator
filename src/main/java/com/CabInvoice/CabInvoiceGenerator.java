package com.CabInvoice;
class Ride {
    public double distance;
    public int time;

    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }
}
public class CabInvoiceGenerator {
    public static final double COSTPerKM = 10.0;
    public static final double COSTPerMIN = 1.0;
    public static final double MIN_FARE = 5;

    public Invoice calculateTotalFare(Ride[] rides) {
        double totalFare = 0.0;
        int totalMinutes = 0;
        int totalDistance = 0;
        for (Ride ride : rides) {
            totalDistance += ride.distance;
            totalMinutes += ride.time;
            totalFare += calculateFare(ride.distance, ride.time);
        }
        double averageFarePerRide = totalFare / rides.length;
        return new Invoice(rides.length, totalFare, averageFarePerRide);
    }

    // UC-1 method to check the total fare for the journey
    public double calculateFare(double distance, int time) {
        double totalFare = (distance * COSTPerKM) + (time * COSTPerMIN);
        if (totalFare < 5) {
            return MIN_FARE;
        }
        return totalFare;
    }

    // UC-2 method to check the total fare for multiple rides
    public double calculateAggregateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += calculateFare(ride.distance, ride.time);
        }
        return totalFare;
    }
}
// UC-3 for Enhanced Invoice => 1) Total Number of Rides 2) Total fare 3) avg fare per Ride
class Invoice {
    private final int numberOfRides;
    private final double totalFare;
    private final double averageFarePerRide;
    public Invoice(int numberOfRides, double totalFare, double averageFarePerRide) {
        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
        this.averageFarePerRide = averageFarePerRide;
    }
    public int getNumberOfRides() {
        return numberOfRides;
    }
    public double getTotalFare() {
        return totalFare;
    }
    public double getAverageFarePerRide() {
        return averageFarePerRide;
    }
}
