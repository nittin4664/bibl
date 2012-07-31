package com.twu28.biblioteca;

import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/30/12
 * Time: 7:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieShelfTest extends TestCase {
    public void testMovieAsStingsFor1Movie() throws Exception {
        MovieShelf movieShelf=new MovieShelf();
        movieShelf.addMovie(new Movie("the dark night","christopher","9"));
        assertEquals("the dark night \t christopher \t 9|",movieShelf.movieAsStings());
    }
    public void testMovieAsStingsFor2Movies() throws Exception {
        MovieShelf movieShelf=new MovieShelf();
        movieShelf.addMovie(new Movie("the dark night","christopher","9"));
        movieShelf.addMovie(new Movie("the dark night rises","christopher","8"));
        assertEquals("the dark night \t christopher \t 9|the dark night rises \t christopher \t 8|",movieShelf.movieAsStings());
    }
}
