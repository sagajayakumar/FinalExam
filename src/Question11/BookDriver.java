/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

/**
 *
 * @author Jaya Kumar Sag
 */
public class BookDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 11: Jaya Kumar Saga");

        //creating three ojects for book class
        Book b1 = new Book("one gaint leap", 350);
        Book b2 = new Book("one gaint leap", 350);
        Book b3 = new Book("YOU", 200);

        System.out.println("---------- comparing using dot equals ------");
        //comparing b1 with b2 using dot equals method and printing the booelan
        //this will return false in case equals method is not implemented in the book class, as this uses .equals built in method
        //in case equals method is implemented then it will return true as this
        //consider the args passed to object are same or not
        System.out.println(b1.equals(b2));
        //comparing b2 with b3 using dot equals method and printing the booelan 
        System.out.println(b2.equals(b3));
        //comparing b1 with b3 using dot equals method and printing the booelan 
        System.out.println(b1.equals(b3));

        System.out.println("---------- comparing using double equals ------");
        //comparing b1 with b3 using double equals and printing the booelan 
        System.out.println(b1 == b2);
        //comparing b2 with b3 using double equals and printing the booelan 
        System.out.println(b2 == b3);
        //comparing b3 with b1 using double equals and printing the booelan 
        System.out.println(b3 == b1);

        System.out.println("---------- printing the hashcode values ------");
        //printing the hashcode for the b1 object 
        System.out.println(b1.hashCode());
        //printing the hashcode for the b2 object 
        System.out.println(b2.hashCode());
        //printing the hashcode for the b3 object 
        System.out.println(b3.hashCode());
    }

}
