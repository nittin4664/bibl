package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/27/12
 * Time: 10:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class Librarian {
    Shelf shelf;
    public Librarian(Shelf shelf){
        this.shelf =shelf;
    }
    public String searchBook(String bookName){
        ArrayList<Book> booksOnShelf;
        booksOnShelf =shelf.booksOnShelf();
        for(int i=0;i< booksOnShelf.size();i++){

           if(bookName.equals(booksOnShelf.get(i).asString()))
            {
                String referenceTOBook=booksOnShelf.get(i).asString();
                removeReferenceFromShelf(i);
                return referenceTOBook;
            }
        }
        return null;
    }
    public  void removeReferenceFromShelf(int position){
       shelf.removeReferenceToBook(position);
    }
}
