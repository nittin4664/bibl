package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/27/12
 * Time: 7:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class Shelf {

    /*
     * How about two shelves, one for books and one for movies?
     */
    ArrayList<Book> booksOnShelf = new ArrayList<Book>();
    ArrayList<Movie> moviesOnShelf = new ArrayList<Movie>();

    /*
     * Do we need those? They are redundant data.
     */
    ArrayList<String> bookAsString = new ArrayList<String>();
    ArrayList<String> movieAsString = new ArrayList<String>();

    public ArrayList<String> booksAsString(){

        return bookAsString;
    }
    public void addBook(Book book)
    {
        booksOnShelf.add(book);
        bookAsString.add(book.asString());
    }
    public void removeReferenceToBook(int position) {
        bookAsString.remove(position);
        booksOnShelf.remove(position);
    }
    public ArrayList<String> moviesAsStrings(){

        return movieAsString;
    }
    public void addMovie(Movie movie)
    {
        moviesOnShelf.add(movie);
        movieAsString.add(movie.asString());
    }

    public ArrayList<Book> booksOnShelf() {
        return booksOnShelf;
    }

    /*
     *
     */
    public String toString() {
        return "a string representation of this object";
    }

    public String toBookString() { return "foo"; }

    public String toMovieString() { return "bar"; }
}
