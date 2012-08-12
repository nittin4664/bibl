package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/30/12
 * Time: 6:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieShelf {
    private ArrayList<Movie> moviesOnShelf = new ArrayList<Movie>();

    public void addMovie(Movie movie){
        moviesOnShelf.add(movie);

    }
    @Override
    public String toString(){
        String movieShelfAsString = moviesOnShelf.toString();

         movieShelfAsString= movieShelfAsString.replace(", ","\n");
         movieShelfAsString= movieShelfAsString.replace("[","");
         movieShelfAsString= movieShelfAsString.replace("]","");

        return  movieShelfAsString;
    }
}
