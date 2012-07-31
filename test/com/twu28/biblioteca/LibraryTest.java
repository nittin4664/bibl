package com.twu28.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/31/12
 * Time: 11:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryTest extends TestCase {
    @Test
    public void testMoviesAsStingsFor1Movie(){
        Library library=new Library();
        library.addMovieToShelf(new Movie("the dark night","christopher","9"));
        assertEquals("the dark night \t christopher \t 9|", library.moviesAsString());
    }
    @Test
    public void testMoviesAsStingsForMoreThen1Movie(){
        Library library=new Library();
        library.addMovieToShelf(new Movie("the dark night","christopher","9"));
        library.addMovieToShelf(new Movie("the dark night rises","christopher","8"));
        assertEquals("the dark night \t christopher \t 9|the dark night rises \t christopher \t 8|", library.moviesAsString());
    }
    @Test
    public void testBooksAsStingsFor1Book(){
        Library library=new Library();
        library.addBookToShelf(new Book("only time will tell"));
        assertEquals("only time will tell|", library.booksAsString());
    }
    @Test
    public void testBooksAsStingsForMoreThen1Book(){
        Library library=new Library();
        library.addBookToShelf(new Book("only time will tell"));
        library.addBookToShelf(new Book("sins of the father"));
        assertEquals("only time will tell|sins of the father|", library.booksAsString());
    }
    @Test
    public void testLendBookWhenShelfEmpty(){
     Library library=new Library();
       assertEquals("book not found",library.lendBook("only time will tell"));
    }

    @Test
    public void testLendBookWhenShelfNotEmptyButBookNotPresent(){
        Library library=new Library();
        library.addBookToShelf(new Book("only time will tell"));
        assertEquals("book not found",library.lendBook("sins of the father"));
    }



}
