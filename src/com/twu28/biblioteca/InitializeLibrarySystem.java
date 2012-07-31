package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/31/12
 * Time: 12:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class InitializeLibrarySystem {
    public void start(){
        Menu menu=new Menu();
        menu.addOption("show book");
        menu.addOption("show Movie");
        menu.addOption("reserve book");
        menu.addOption("login");
        menu.addOption("Check Library No");
        menu.addOption("exit");

        Library library=new Library();
        library.addBookToShelf(new Book("the jackal"));
        library.addBookToShelf(new Book("only time will tell"));
        library.addBookToShelf(new Book("sins of the father"));

        library.addMovieToShelf(new Movie("the dark night","christopher","9"));
        library.addMovieToShelf(new Movie("the dark night rises","christopher","8"));
        library.addMovieToShelf(new Movie("the usual suspects","bryan swinger", "11"));
        library.addMovieToShelf(new Movie("forest grump","robert", "8"));
        library.addMovieToShelf(new Movie("a few good men","rob reiner", "2"));
        library.addMovieToShelf(new Movie("rockey","john avildsen", "11"));

        library.addNewCustomer(new Customer("librarian","password"));
        library.addNewCustomer(new Customer("nitin","abc123"));
        library.addNewCustomer(new Customer("xyz","password"));
        LibrarySystem librarySystem=new LibrarySystem(menu,library);
        librarySystem.startLibrarySystem();
    }
}
