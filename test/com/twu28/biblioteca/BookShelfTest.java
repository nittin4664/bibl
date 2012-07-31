package com.twu28.biblioteca;

import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/30/12
 * Time: 6:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookShelfTest extends TestCase {

    public void testAsStringFor1book() throws Exception {
        BookShelf bookShelf=new BookShelf();
        bookShelf.addBook(new Book("sins of the father"));
     assertEquals("sins of the father|", bookShelf.bookAsString());
    }
    public void testAsStringFor2book() throws Exception {
        BookShelf bookShelf=new BookShelf();
        bookShelf.addBook(new Book("sins of the father"));
        bookShelf.addBook(new Book("the jackal"));
        assertEquals("sins of the father|the jackal|", bookShelf.bookAsString());
    }
    public void testSearchBookFormSingleBook(){
        BookShelf bookShelf=new BookShelf();
        bookShelf.addBook(new Book("sins of the father"));
        assertEquals("sins of the father",bookShelf.searchBook("sins of the father"));
    }
    public void testSearchBookFormMoreThenOneBook(){
        BookShelf bookShelf=new BookShelf();
        bookShelf.addBook(new Book("sins of the father"));
        bookShelf.addBook(new Book("only time will tell"));
        assertEquals("only time will tell",bookShelf.searchBook("only time will tell"));
    }


}
