/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

import java.util.ArrayList;

/**
 *
 * @author Jaya Kumar Saga
 */
public class CircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 5: Jaya Kumar Saga");

        ComparableCircle c1 = new ComparableCircle(5);

        ComparableCircle c2 = new ComparableCircle(3);

        if (c1.compareTo(c2) > 0) {
            System.out.println("The area of ​​the second circle is large.");
        } else if (c1.compareTo(c2) < 0) {
            System.out.println("The area of ​​the first circle is large.");
        } else {
            System.out.println("The area of ​​the two circles is the same");
        }

    }

}
