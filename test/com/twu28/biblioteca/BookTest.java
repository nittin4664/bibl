package com.twu28.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/30/12
 * Time: 5:46 PM
 * To change this template use File | Settings | File Templates.
 */

/*
 * These tests are less important. Constructors and setters only need to be tested when they apply some business
 * logic, such as validation.
 *
 */
public class BookTest {

    @Test
    public  void shouldChangName()
    {
        Book book= new Book("Sins of the Father");
        assertEquals("Sins of the Father",book.getName());

    }
    @Test
    public  void testSetName(){
        Book book= new Book("Sins of the Father");
        book.setName("only time will tell");
        assertEquals("only time will tell",book.getName());

    }
    @Test
    public  void testIsReserved(){
        Book book= new Book("Sins of the Father");
        assertEquals(false,book.getReservation());
    }
    @Test
    public  void testSetReservation(){
        Book book= new Book("Sins of the Father");
        book.setReservation(true);
        assertEquals(false,book.getReservation());
    }
}
