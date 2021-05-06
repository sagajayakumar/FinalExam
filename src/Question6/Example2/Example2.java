/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6.Example2;

import Question6.MultipleByZeroException;
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
     * @throws java.io.EOFException
     */
    public static void main(String[] args) throws FileNotFoundException, EOFException {
        // TODO code application logic here

        System.out.println("Answer for question 6: Jaya Kumar Saga");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an integer");
            int n1;
            int n2 = 5;
            n1 = sc.nextInt();
            if (n1 <= n2) {
                throw new BadRequestException("Need an integer value more then 5");
            }
            while (n1 > n2) {
                System.out.println("Entered loop");
                n1--;
            }

        } catch (BadRequestException e) {
            System.out.println(e);
        }

        try {
            Scanner scan = new Scanner(new File("TextInput.txt"));
            int i = 0;
            while (i == 0) {
                String s = scan.nextLine();
                if(!scan.hasNext()){
                    throw new EOFException("End of file exception");
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found exception");
        }
        catch(EOFException e){
            System.out.println(e);
        }
    }

}
