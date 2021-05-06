/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.io.File;
import java.util.Scanner;

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
        System.out.println("Answer for question 10: Jaya Kumar Saga");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number below which all even number will be printed: ");
        int s = scan.nextInt();
        printEven(s, 1);
    }

    private static void printEven(int maxNumber, int startingNumber) {

            if (startingNumber != maxNumber) {
                if (startingNumber % 2 == 0) {
                    System.out.println(startingNumber + " is even number");
                }
                printEven(maxNumber, startingNumber+1);
            }
    }
}
