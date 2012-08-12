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
    Menu menu;
    Library library;
    public  LibrarySystem(Menu menu,Library library){
        this.menu=menu;
        this.library=library;
    }
    public  void display(ArrayList<String> toDisplay) {
        for (int i = 0; i < toDisplay.size(); i++)
            System.out.println(toDisplay.get(i));
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
            display(menu.optionList());

            int opt;
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
                    /*
                     * Doh, this is a boring library. I can only borrow one book!
                     */
                    display(library.lendBook("sins of the father"));
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
