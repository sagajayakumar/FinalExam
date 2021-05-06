/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3.Example2;

/**
 *
 * @author Jaya Kumar Saga
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 2: Jaya Kumar Saga");
        //converting int to double happens automatically
        double d = 12;
        System.out.println("double of 12 is " + d);

        //converting double to int
        int b = (int) 123.77;
        System.out.println("int value of 123.77 is " + b);

        //converting int to string
        String s = String.valueOf(d);
        System.out.println("String value of 12 is " + d);

        //converting string to int
        String i = "122";
        int t = Integer.parseInt(i);
        System.out.println("Int value of string 12 is " + t);
        
        Transducer tr = new Transducer( "Surya",2019);
        
        Fan f = new Fan("30","Philips", 2020);
        
        tr = f;
        f = (Fan) tr;
        System.out.println("Casting "+ f.toString());
    }
    
}
