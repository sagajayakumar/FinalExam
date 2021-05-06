/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

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
        System.out.println("Answer for question 8: Jaya Kumar Saga");

        try {
            // TODO code application logic here
            Scanner sc = new Scanner(new File("TextInput1.txt"));
        } catch (FileNotFoundException ex) {
            System.out.println("File not found exception");
        }

    }

}
