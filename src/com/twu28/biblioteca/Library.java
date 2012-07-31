package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/27/12
 * Time: 8:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class Library {
    static int aLibraryNo =1111111;
    BookShelf bookShelf =new BookShelf();
    MovieShelf movieShelf=new MovieShelf();
    ExistingCustomers existingCustomers=new ExistingCustomers();
    static String permissionGivenTo =null;


    public  void addBookToShelf(Book book){ //to add books to shelf
        bookShelf.addBook(book);
    }
    public  void addMovieToShelf(Movie movie){  //to add movies to the shelf
        if(Integer.parseInt(movie.getRating())>0&&Integer.parseInt(movie.getRating())<11)//check if the rating is within the limits
            movie.setRating(movie.getRating());
        else
            movie.setRating("N/A");

        movieShelf.addMovie(movie);//adding movie to the shelf
    }
    public  String lendBook(String bookName){  //function t lend book out to a customer
        String book= bookShelf.searchBook(bookName);
        if(book==null)
            return "book not found";
        else
            return "book "+book+"  has been reserved";
    }
    public void addNewCustomer(Customer customer){//function to add customers to customer list
        customer.setLibraryNo(autoGenerateLibraryNo());
        existingCustomers.addNewCustomer(customer);
    }
    public String autoGenerateLibraryNo(){ // function to auto generate library no
        String libraryNo;
        libraryNo=(Integer.toString(aLibraryNo)).substring(0,3)+"-"+(Integer.toString(aLibraryNo++)).substring(3);
        return libraryNo;
    }
    public  String customerLogin(String libraryNo,String password){//function to confirm login of a customer
        if(existingCustomers.isCustomerPresent(libraryNo,password)){
            permissionGivenTo =libraryNo;
            return permissionGivenTo +" successful login";
        }
        else
            return "try again";
    }

    public  String permissionTo(){ //function to get permission
        return permissionGivenTo;
    }


    public String booksAsString() {//function returning  books on shelf as a string
        return bookShelf.bookAsString();
    }

    public String moviesAsString() { //function returning movies on the shelf as string
        return movieShelf.movieAsStings();
    }

}
