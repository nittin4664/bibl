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
public class BookTest {

    @Test
    public  void shouldChangName()
    {
        Book book= new Book("Sins of the Father");
        assertEquals("Sins of the Father",book.getName());


    }
}
