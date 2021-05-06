/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Jaya Kumar Saga
 */
public class Example1 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer for question 6: Jaya Kumar Saga");
        try {
            System.out.print("Enter first number: ");
            int num1, num2;
            num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            num2 = sc.nextInt();
            if(num1 == 0 || num2 ==0){
                throw new MultipleByZeroException("Number can't be zero");
            }
            System.out.println( num1 * num2);
        } catch (MultipleByZeroException e) {
            System.out.println(e);
        }
        System.out.println("*****************");
        try {
            Scanner scan = new Scanner(new File("usersCallLog.txt"));
        } catch (FileNotFoundException ex) {
            System.out.println("File not found exception");
        }

    }

}
