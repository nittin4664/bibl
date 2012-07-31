package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/27/12
 * Time: 7:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class BookShelf {

    /*
     * How about two shelves, one for books and one for movies?
     */
    ArrayList<Book> booksOnShelf = new ArrayList<Book>();


    /*
     * Do we need those? They are redundant data.
     */


    public void addBook(Book book)
    {
        booksOnShelf.add(book);

    }
    public void removeReferenceToBook(int position) {

        booksOnShelf.remove(position);
    }


    public ArrayList<Book> booksOnShelf() {
        return booksOnShelf;
    }

    /*
     *
     */
    public String bookAsString() {
        String booksAsString="";
        for(int i=0;i<booksOnShelf.size();i++)
            booksAsString+=booksOnShelf.get(i).getName()+"|";

        return booksAsString;
    }

    public String searchBook(String bookName) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }
}
