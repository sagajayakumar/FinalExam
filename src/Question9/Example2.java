/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Jaya Kumar Saga
 */
public class Example2 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, EOFException {
        // TODO code application logic here
        System.out.println("Answer for question 9: Jaya Kumar Saga");
        Scanner scan = new Scanner(new File("TextInput.txt"));
        String s = scan.nextLine();
        System.out.println(s);
        if(!scan.hasNext())
        {
            throw new EOFException(s);
        }
    }
    
}
