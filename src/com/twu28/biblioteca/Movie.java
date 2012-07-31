package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/28/12
 * Time: 12:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class Movie {
    private  String name;
    private  String director;
    private  String rating;
     public Movie(String name, String director,String rating){
        this.name=name;
        this.director=director;
        this.rating=rating;
    }

    public void setRating(String rating){
        this.rating=rating;
    }

    public String asString(){
        return name+" \t "+director+" \t "+rating;
    }

    public String getRating() {
        return rating;
    }
}
