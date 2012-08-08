package com.twu28.biblioteca;

import junit.framework.TestCase;

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
public class BookShelfTest extends TestCase {
    public void testAsStringFor0book() throws Exception {
        BookShelf bookShelf=new BookShelf();
        assertEquals("", bookShelf.bookAsString());
    }
    public void testAsStringFor1book() throws Exception {
        BookShelf bookShelf=new BookShelf();
        bookShelf.addBook(new Book("sins of the father"));
     assertEquals("sins of the father|", bookShelf.bookAsString());
    }

    /*
     * The test passes which is good. However, the String representation ends with '|' which does not look nice.
     */
    public void testAsStringFor2book() throws Exception {
        BookShelf bookShelf=new BookShelf();
        bookShelf.addBook(new Book("sins of the father"));
        bookShelf.addBook(new Book("the jackal"));
        assertEquals("sins of the father|the jackal|", bookShelf.bookAsString());
    }

    /*
     * Nice, testing for null.
     */
    public void testSearchBookWhenNoBook(){
        BookShelf bookShelf=new BookShelf();
        assertEquals(null,bookShelf.searchBook("sins of the father"));
    }
    public void testSearchBookFormSingleBook(){
        BookShelf bookShelf=new BookShelf();
        bookShelf.addBook(new Book("sins of the father"));
        assertEquals("sins of the father",bookShelf.searchBook("sins of the father"));
    }
    public void testSearchBookFormShelfWhenBookNotPresent(){
        BookShelf bookShelf=new BookShelf();
        bookShelf.addBook(new Book("sins of the father"));
        bookShelf.addBook(new Book("only time will tell"));
        assertEquals(null,bookShelf.searchBook("the jackal"));
    }
    public void testSearchBookFormMoreThenOneBook(){
        BookShelf bookShelf=new BookShelf();
        bookShelf.addBook(new Book("sins of the father"));
        bookShelf.addBook(new Book("only time will tell"));
        assertEquals("only time will tell",bookShelf.searchBook("only time will tell"));
    }


}
