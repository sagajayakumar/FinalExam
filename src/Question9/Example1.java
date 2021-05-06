/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Jaya Kumar Saga
 */
public class Example1 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 9: Jaya Kumar Saga");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number for multiplication: ");
        int n1 = scan.nextInt();
        System.out.print("Enter second number for multiplication: ");
        int n2 = scan.nextInt();
        if (n1 == 0 || n2 == 0) {
            throw new NumberFormatException("Number can't be zero");
        } else {
            System.out.println("result: " + n1 * n2);
        }

    }
}
