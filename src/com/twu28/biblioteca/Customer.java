package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/29/12
 * Time: 7:48 AM
 * To change this template use File | Settings | File Templates.
 */

/*
 * Would you never want to get the name or the password of a customer?
 */
public class Customer {

    /*
     * How about visibility of the attributes? Think about encapsulation.
     */
    String libraryNo;
    String name;
    String password;
    public Customer(String name,String password){
      this.name=name;
      this.password=password;
    }

    /*
     * There are naming conventions for getters and setters. Please change the method name.
     */
    public  String libraryNoAsString()
    {
        return libraryNo;
    }
    public String passwordAsString()
    {
        return  password;
    }

    /*
     * Would you ever want to change the library number?
     */
    public void  setLibraryNo(String libraryNo){
        this.libraryNo = libraryNo;
    }
}
