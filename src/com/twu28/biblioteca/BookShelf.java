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
    @Override
    public String toString(){
        String booksAsStrings = booksOnShelf.toString();

        booksAsStrings=booksAsStrings.replace(", ","\n");
        booksAsStrings=booksAsStrings.replace("[","");
        booksAsStrings=booksAsStrings.replace("]","");
        
        return booksAsStrings;
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
