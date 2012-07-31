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
    Menu menu;
    Library library;
    public  LibrarySystem(Menu menu,Library library){
     this.menu=menu;
    this.library=library;
    }
    public static void display(ArrayList<String> toDisplay) {
        for (int i = 0; i < toDisplay.size(); i++)
            System.out.println(toDisplay.get(i));
    }

    private static void display(String toDisplay) {
        System.out.println(toDisplay);
    }

    public void startLibrarySystem(){
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
                    display(library.moviesAsStings());
                    break;
                case 3:
                    display(library.lendBook("sins of the father"));
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
