/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Jaya Kumar Saga
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Answer for question 2: Jaya Kumar Saga");
        //converting int to double happens automatically
        double a = 10;
        System.out.println("double of 10 is " + a);

        //converting double to int
        int b = (int) 10.5;
        System.out.println("int value of 10.5 is " + b);

        //converting int to string
        String d = String.valueOf(a);
        System.out.println("String value of 10 is " + d);

        //converting string to int
        String s = "12";
        int i = Integer.parseInt(s);
        System.out.println("Int value of string 12 is " + i);

        Doctor doc = new Doctor(12313);
        HeartSurgeon h = new HeartSurgeon("Samuel", 1231231);
        doc = h;
        h = (HeartSurgeon) doc;
        System.out.println("Casting " + h.toString());
        
        
    }

}
