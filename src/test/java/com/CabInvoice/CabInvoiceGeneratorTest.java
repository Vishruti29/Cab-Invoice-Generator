package com.CabInvoice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CabInvoiceGeneratorTest {
    private CabInvoiceGenerator cabInvoiceGenerator;

    @BeforeEach
    public void setUp() {
        cabInvoiceGenerator = new CabInvoiceGenerator();
    }

    @Test
    public void givenDistanceAndTime_shouldReturnFare() {
        double distance = 2.0;
        int time = 5;
        double result = cabInvoiceGenerator.calculateFare(distance, time);
        assertEquals(25, result, 0);
    }

    @Test
    public void givenMultipleRides_shouldReturnInvoiceSummary() {
        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0.1, 1),
                new Ride(10.0, 20)
        };
        Invoice invoice = cabInvoiceGenerator.calculateTotalFare(rides);
        assertEquals(150,cabInvoiceGenerator.calculateAggregateFare(rides));//25+5(2<min_fare)+120
        assertEquals(3, invoice.getNumberOfRides());
        assertEquals(150, invoice.getTotalFare(), 0);
        assertEquals(50, invoice.getAverageFarePerRide(), 0.01);
    }
}
