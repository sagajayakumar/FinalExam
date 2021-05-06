/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.Scanner;

/**
 *
 * @author Jaya Kumar Saga
 */
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 10: Jaya Kumar Saga");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to get sum of numbers from 1 to given number: ");
        int s = scan.nextInt();
        while (s == 0) {
            System.out.print("Please enter number greater than 0: ");
            s = scan.nextInt();
        }
        sumOfNumbers(s, s);
    }

    private static void sumOfNumbers(int givenNumber, int sum) {
        if (givenNumber == 1) {
            System.out.println("sum is: " + sum);
        } else {
            sum = sum + (givenNumber - 1);
            givenNumber = givenNumber - 1;
            sumOfNumbers(givenNumber, sum);
        }

    }

}
