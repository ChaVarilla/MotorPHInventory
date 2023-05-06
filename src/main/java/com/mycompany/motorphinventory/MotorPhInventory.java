/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.motorphinventory;


import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *
 * @author Cha
 */
public class MotorPhInventory {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        DisplayAllStocks display = new DisplayAllStocks();//create object of display
        AddStocks add = new AddStocks();
        SortStocks sort = new SortStocks();
        SearchStocks search = new SearchStocks();
        DeleteStocks deleted = new DeleteStocks();
        
        //add.AddingStocks();
        deleted.DeleteStocks();
        //search.SearchingStocks();
        //sort.SortingStocks();
        //display.printStack();//call function to print stack
        
        
            
            
            
          

    }
}
