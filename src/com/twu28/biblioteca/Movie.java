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
        this.rating=ratingWithin1to10( rating);
    }
    @Override
    public String toString(){
       return name+" \t "+director+" \t "+rating;
    }
    public String ratingWithin1to10(String rating) {
        if(Integer.parseInt(rating)>0&&Integer.parseInt(rating)<11)//check if the rating is within the limits
            return rating;
        else
            return "N/A";
    }
}
