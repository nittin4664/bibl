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

    private ArrayList<Book> booksOnShelf = new ArrayList<Book>();
        

    public void addABook(Book book){
        booksOnShelf.add(book);
    }
    public String bookAsString() {
        return booksOnShelf.toString();
    }
    public Book searchBook(String bookName) {
        for(int i=0;i<booksOnShelf.size();i++){
            if(bookName.equals( booksOnShelf.get(i).toString()))            {
                return booksOnShelf.get(i);
            }
        }
        return null;
    }
}
