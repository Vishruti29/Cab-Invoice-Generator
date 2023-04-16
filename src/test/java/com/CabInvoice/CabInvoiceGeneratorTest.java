package com.CabInvoice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CabInvoiceGeneratorTest {
    private CabInvoiceGenerator cabInvoiceGenerator;

    @BeforeEach
    public void setUp() throws Exception {
        cabInvoiceGenerator = new CabInvoiceGenerator();
    }

    @Test
    public void givenDistanceAndTime_shouldReturnFare() {
        double distance = 2.0;
        int time = 5;
        double result = cabInvoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(25, result, 0);
    }

    @Test
    public void givenMultipleRides_shouldReturnAggregateFare() {
        Ride[] rides = { new Ride(2.0, 5),
                new Ride(3.0, 8),
                new Ride(5.0, 10) };
        double result = cabInvoiceGenerator.calculateAggregateFare(rides);
        Assertions.assertEquals(123.0, result, 0);
    }
}
