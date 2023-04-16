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
}
