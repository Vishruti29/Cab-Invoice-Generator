package com.CabInvoice;

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
