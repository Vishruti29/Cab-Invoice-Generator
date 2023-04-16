package com.CabInvoice;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceGeneratorTest{
    @Test
    public void givenDistanceAndTime_ShouldReturnValidFare(){
        CabInvoiceGenerator cig = new CabInvoiceGenerator();
        double result = cig.calculateFare(50,20);
        Assertions.assertEquals(520,result);
        double check = cig.calculateFare(0,2);
        Assertions.assertEquals(5,check);
    }
    @Test
    public void testCalculateAggregateFare() {
        Ride[] rides = { new Ride(5, 10), new Ride(10, 20), new Ride(15, 30) };//60+120+180
        CabInvoiceGenerator cig = new CabInvoiceGenerator();
        double aggregateFare = cig.calculateAggregateFare(rides);
        Assertions.assertEquals(360,aggregateFare);//360
    }

}
