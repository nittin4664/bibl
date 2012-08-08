package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: NITIN
 * Date: 7/29/12
 * Time: 8:01 AM
 * To change this template use File | Settings | File Templates.
 */

/*
 * BookShelf and MovieShelf are very good class names which express the intent of the classes.
 *
 * Could you find a better name for this class?
 *
 */
public class ExistingCustomers {
    ArrayList<Customer> customersList=new ArrayList<Customer>();
    public void addNewCustomer(Customer customer){
        customersList.add(customer);

    }
    public boolean isCustomerPresent(String libraryNo,String password){
      for(int i=0;i<customersList.size();i++){
          if(libraryNo.equals((customersList.get(i)).libraryNoAsString())&&password.equals((customersList.get(i)).passwordAsString()) )
              return true;
      }
        return false;
    }
}
