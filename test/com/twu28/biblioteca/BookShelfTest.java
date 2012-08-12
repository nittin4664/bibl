package com.twu28.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/30/12
 * Time: 6:46 PM
 * To change this template use File | Settings | File Templates.
 */

/*
 * Extending TestCase and using testXYZ for each test method is old style JUnit.
 *
 * Please familiarise yourself with JUnit 4, where you use annotations instead of subclasses.
 *
 */
public class BookShelfTest  {
    @Test
    public void testAsStringFor0book() throws Exception {
        BookShelf bookShelf=new BookShelf();
        assertEquals("", bookShelf.toString());
    }
    @Test
    public void testAsStringFor1book() throws Exception {
        BookShelf bookShelf=new BookShelf();
        bookShelf.addABook(new Book("sins of the father"));
     assertEquals("sins of the father", bookShelf.toString());
    }

    /*
     * The test passes which is good. However, the String representation ends with '|' which does not look nice.
     */
    @Test
    public void testAsStringFor2book() throws Exception {
        BookShelf bookShelf=new BookShelf();
        bookShelf.addABook(new Book("sins of the father"));
        bookShelf.addABook(new Book("the jackal"));
        assertEquals("sins of the father\nthe jackal", bookShelf.toString());
    }

    /*
     * Nice, testing for null.
     */
    @Test
    public void testSearchBookWhenNoBook(){
        BookShelf bookShelf=new BookShelf();
        assertEquals(null,bookShelf.searchBook("sins of the father"));
    }
    @Test
    public void testSearchBookFormSingleBook(){
        BookShelf bookShelf=new BookShelf();
        bookShelf.addABook(new Book("sins of the father"));
        assertEquals("sins of the father",(bookShelf.searchBook("sins of the father")).toString());
    }
    @Test
    public void testSearchBookFormShelfWhenBookNotPresent(){
        BookShelf bookShelf=new BookShelf();
        bookShelf.addABook(new Book("sins of the father"));
        bookShelf.addABook(new Book("only time will tell"));
        assertEquals(null,bookShelf.searchBook("the jackal"));
    }
    @Test
    public void testSearchBookFormMoreThenOneBook(){
        BookShelf bookShelf=new BookShelf();
        bookShelf.addABook(new Book("sins of the father"));
        bookShelf.addABook(new Book("only time will tell"));
        assertEquals("only time will tell",(bookShelf.searchBook("only time will tell")).toString());
    }


}
