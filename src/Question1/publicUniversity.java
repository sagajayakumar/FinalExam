/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author Jaya Kumar Saga
 */
public class publicUniversity extends University implements Inperson, OnlineClass {

    private String noOfStudents;

    //constructor 
    public publicUniversity(String noOfStudents, String name, int departments) {
        super(name, departments);
        this.noOfStudents = noOfStudents;
    }

    @Override
    public String toString() {
        return super.toString() + " noOfStudents=" + noOfStudents;
    }

    /**
     *
     * @return 202A
     */
    @Override
    public String getRoom() {
        return "202A";
    }

    @Override
    public String getSession() {
        return "Zoom, Skype";
    }

}
