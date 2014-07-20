/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Taylor
 */

//Person SuperClass.  Contains all of the universal person information
public class person {
    private String name;
    private int age;
    
    //Person contructor
    person(String newName, int newAge) {
        name =  newName;
        age = newAge;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    
}

class coWorker extends person {
    private String job;
    
    //coWorker constructor
    public coWorker (String newName, int newAge, String newJob) {
        super(newName, newAge); //Calls the person constructor
        job = newJob;
    }
    
    public String getJob() {
        return job;
    }
}
