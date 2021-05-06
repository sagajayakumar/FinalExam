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
public class UniversityDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 1: Jaya Kumar Saga");
        University pu = new publicUniversity("1231", "SIIT", 6);
        System.out.println("public university" + pu.toString());
        System.out.println("Online class on " + pu.getRoom());

        University privateUniversity = new privateUniversity("Samuels", "SMUT", 3);
        System.out.println("Private university" + privateUniversity.toString());
    }

}
