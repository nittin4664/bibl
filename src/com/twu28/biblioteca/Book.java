package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/27/12
 * Time: 7:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class Book {

    private  String name;
    private boolean reservation =false;

    public Book(String bookName){
        this.name = bookName;
    }
    @Override
    public String toString() {
        return name; 
    }
    public boolean getReservation() {
        return reservation;
    }
    public void setReservation(boolean reservation) {
        this.reservation=reservation;
    }
}
