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

    ArrayList<Book> booksOnShelf = new ArrayList<Book>();
    public void addBook(Book book){
        booksOnShelf.add(book);

    }

    /*
     * Have a look at Object.toString(), this is the standard method to be overridden to return a String
     * representation of an object.
     *
     * Also, give booksOnShelf.toString() a try, Java collection classes come with nice String representations.
     *
     */
    public String bookAsString() {
        String booksAsString="";
        for(int i=0;i<booksOnShelf.size();i++)
            booksAsString+=booksOnShelf.get(i).getName()+"|";

        return booksAsString;
    }

    /*
     * When searching for a book, what should be the return type?
     */
    public String searchBook(String bookName) {
        for(int i=0;i<booksOnShelf.size();i++){
            if(bookName.equals( booksOnShelf.get(i).getName()))
            {
                if(booksOnShelf.get(i).getReservation()==false){
                    booksOnShelf.get(i).setReservation(true);
                    return booksOnShelf.get(i).getName();
                }
            }
        }
        return null;
    }
}
