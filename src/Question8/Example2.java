/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

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
     * @throws java.io.EOFException
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws EOFException, FileNotFoundException
    {
        // TODO code application logic here
        System.out.println("Answer for question 8: Jaya Kumar Saga");
        Scanner scan = new Scanner(new File("TextInput.txt"));
        String s = scan.nextLine();
        if(!scan.hasNext())
        {
            throw new IndexOutOfBoundsException(s);
        }
    }
    
}
