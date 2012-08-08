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
    ArrayList<Movie> moviesOnShelf = new ArrayList<Movie>();


    public void addMovie(Movie movie)
    {
        moviesOnShelf.add(movie);

    }

    /*
     * Same as book shelf, think naming.
     */
    public String movieAsStings(){
        String moviesAsString="";
        for(int i=0;i<moviesOnShelf.size();i++)
            /*
             * Have a look at the StringBuilder class for concatenating String objects.
             */
            moviesAsString+=moviesOnShelf.get(i).asString()+"|";

        return moviesAsString;
    }
}
