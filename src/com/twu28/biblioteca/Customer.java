package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/29/12
 * Time: 7:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class Customer {
    String libraryNo;
    String name;
    String password;
    public Customer(String name,String password){
      this.name=name;
      this.password=password;
    }
    public  String libraryNoAsString()
    {
        return libraryNo;
    }
    public String passwordAsString()
    {
        return  password;
    }
    public void  setLibraryNo(String libraryNo){
        this.libraryNo = libraryNo;
    }
}
