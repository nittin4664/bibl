package com.twu28.biblioteca;

import java.util.ArrayList;


/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/27/12
 * Time: 12:36 PM
 * To change this template use File | Settings | File Templates.
 */

/*
 * Please test this class.
 *
 * The way to add options i
 */
public class Menu {
    ArrayList<String> optionList=new ArrayList<String>();
    static  int count=1;
    public void addOption(String option)
    {
       optionList.add((count++)+" "+option);

    }
    public  ArrayList<String> optionList(){
        return optionList;
    }

    public boolean isOptionAvailable(int option){
        if(option>0&&option<(optionList.size()+1))
        return true;
        else
        return false;
    }
    public int optionSelected(int option){
        if(isOptionAvailable(option))
        {
            System.out.println("option selected is " +optionList.get(option-1));
            return option;
        }
        else
        {
            System.out.println("wrong option selected");
            return 0;
        }
    }
}
