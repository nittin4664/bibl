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


    public  void addBookToShelf(Book book){
       bookShelf.addBook(book);
    }
    public  void addMovieToShelf(Movie movie){
        if(Integer.parseInt(movie.getRating())>0&&Integer.parseInt(movie.getRating())<11)
            movie.setRating(movie.getRating());
        else
            movie.setRating("N/A");

        movieShelf.addMovie(movie);
    }
    public  String lendBook(String bookName){
      String book= bookShelf.searchBook(bookName);
        if(book==null)
            return "book not found";
        else
           return "book "+book+"  has been reserved";
    }
    public void addNewCustomer(Customer customer){
      customer.setLibraryNo(autoGenerateLibraryNo());
      existingCustomers.addNewCustomer(customer);
    }
    public String autoGenerateLibraryNo(){
       String libraryNo;
       libraryNo=(Integer.toString(aLibraryNo)).substring(0,3)+"-"+(Integer.toString(aLibraryNo++)).substring(3);
        return libraryNo;
    }
    public  String customerLogin(String libraryNo,String password){
        if(existingCustomers.isCustomerPresent(libraryNo,password)){
            permissionGivenTo =libraryNo;
            return permissionGivenTo +" successful login";
        }
        else
            return "try again";
    }

    public  String permissionTo(){
        return permissionGivenTo;
    }


    public String booksAsStrings() {
       return bookShelf.bookAsString();
    }

    public  String moviesAsStings() {
        return movieShelf.movieAsStings();
    }

}
