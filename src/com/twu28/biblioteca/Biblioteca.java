package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/27/12
 * Time: 8:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class Biblioteca {

    public static void display(ArrayList<String> toDisplay) {
        for (int i = 0; i < toDisplay.size(); i++)
            System.out.println(toDisplay.get(i));
    }

    private static void display(String toDisplay) {
        System.out.println(toDisplay);
    }

    public static void main(String arg[]) {

        Menu menu = new Menu();
        menu.addOption("show book");
        menu.addOption("show Movie");
        menu.addOption("reserve book");
        menu.addOption("login");
        menu.addOption("Check Library No");
        menu.addOption("exit");

        Library library = new Library();
        library.addBookToShelf(new Book("book1"));
        library.addBookToShelf(new Book("book2"));
        library.addBookToShelf(new Book("book3"));

        library.addMovieToShelf(new Movie("movie1","direc1"), "0");
        library.addMovieToShelf(new Movie("movie2","direc2"), "1");
        library.addMovieToShelf(new Movie("movie3","direc3"), "11");
        library.addMovieToShelf(new Movie("movie4","direc4"), "8");
        library.addMovieToShelf(new Movie("movie5","direc5"), "2");
        library.addMovieToShelf(new Movie("movie6","direc6"), "11");

        library.addNewCustomer(new Customer("librarian","password"));
        library.addNewCustomer(new Customer("nitin","abc123"));
        library.addNewCustomer(new Customer("xyz","password"));

        while (true) {
            display("plz select a option");
            display(menu.optionList());
            int opt;
            Scanner in = new Scanner(System.in);
            opt = in.nextInt();
            switch (menu.optionSelected(opt)) {
                case 1:
                    display(library.booksAsStrings());
                    break;
                case 2:
                    display(library.moviesAsStrings());
                    break;
                case 3:
                    display(library.lendBook("book2"));
                    break;
                case 4:
                    display(library.customerLogin("111-1112","abc123"));
                    break;
                case 5:
                    if(library.permissionTo()!=null)
                        display(library.permissionTo());
                    else
                        display("Talk to librarian");
                    ;break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    display("plz try again");
            }
        }
    }
}
