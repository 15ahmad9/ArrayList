/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist1;

import java.util.ArrayList;

/**
 *
 * @author Ahmad Ghanem
 */
public class ArrayList1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // creating ArrayList of Integers (wrapper class of int) named arrList
        ArrayList<Integer>arrList = new ArrayList<> ();
        
        ////////ArrayList Methods
        
        arrList.add(80);
        arrList.add(90);
        arrList.add(100);
        
        //Size of ArrayList
        System.out.println("ArrList size is :" + arrList.size());
        
        //Printing ArrayList
        System.out.println("Original arrList :" + arrList);
        
        //Adding element in aspecific index of ArrayList
        arrList.add(0,70);
        System.out.println("arrList after adding 70 to index 0 " + arrList);
        
        //Accessing ArrayList element
        int element= arrList.get(1);
        System.out.println("Second element in arrList is : " + element);
     //  ((( ass2 )))      System.out.println( element * .458545 );
        //changing (REPLACING) ArrayList element
         arrList.set(0,60);
         System.out.println("arrList after replacing the first element " + arrList);
        
         //For removing ArrayList element
         arrList.remove(2);
          System.out.println("arrList after deleting the third element " + arrList);
        
        //Iterrating through an ArrayList
        for (int index=0; index<arrList.size(); index++)
        {
            System.out.println("Iterration " + (index+1) + "   " + arrList.get(index)) ;
        }    
        
    }
    
}
