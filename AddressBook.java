/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Taylor
 */

import java.util.*;
        
public class AddressBook {

    /**
     * @param args the command line arguments
     */
    private List<person> book = new ArrayList<person>();
    
    public static void main(String[] args) {
//        StdOut.println("What would you like to do?");
//        StdOut.println("1: Add a person");
//        StdOut.println("What would you like to do?");
        
        StdOut.print("Name: ");
        String newName = StdIn.readString();
        StdOut.print("Age: ");
        int newAge = StdIn.readInt();
        
        person testPerson = new person(newName, newAge);
        
        StdOut.println("You have created " + testPerson.getName() + " who is " + testPerson.getAge() + " years old!");
    }
    
}