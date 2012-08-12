package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/31/12
 * Time: 12:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class LibrarySystem {
    /*
     * Think visibility, this is not private enough.
     */
    private Menu menu;
    private Library library;
    public  LibrarySystem(Menu menu,Library library){
        this.menu=menu;
        this.library=library;
    }
    public void display(String toDisplay) {

        for (int i = 0; i < (toDisplay.toCharArray()).length; i++){
            if(toDisplay.toCharArray()[i]=='|')
                System.out.println("");
            else
                System.out.print((toDisplay.toCharArray())[i]);
        }
        System.out.println("");
    }

    public void startLibrarySystem(){
        while (true) {
            display("plz select a option");

            /*
             * Which object should know how to display the menu?
             */
            display(menu.toString());

            int opt;
            String bookName;
            Scanner inString = new Scanner(System.in);
            Scanner in = new Scanner(System.in);
            opt = in.nextInt();
            switch (menu.optionSelected(opt)) {
                case 1:
                    display(library.booksAsString());
                    break;
                case 2:
                    display(library.moviesAsString());
                    break;
                case 3:
                    display("enter the name of the book u wish to take home");
                    bookName = inString.nextLine();
                    Book book=library.lendBook(bookName);
                    if(book==null)
                    display("book not found");
                    else
                    display("book "+book.toString()+"  has been reserved");
                    break;
                case 4:
                    /*
                     * Hang on, my library number is 111-1117! Cannot get in :(
                     */
                    display(library.customerLogin("111-1112","abc123"));
                    break;
                case 5:
                    if(library.getPermissionGivenTo()!=null)
                        display(library.getPermissionGivenTo());
                    else
                        display("Talk to librarian");
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    display("plz try again");
            }
        }
    }

}
