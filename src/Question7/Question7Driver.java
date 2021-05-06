/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jaya Kumar Saga
 */
public class Question7Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Answer for question 7: Jaya Kumar Saga");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index of array: ");
        int index = sc.nextInt();
        int arr[] = new int[99];
        for (int i = 0; i < 99; i++) {
            arr[i] = (int) (100 * Math.random());
        }
        if(index >99 || index<0){
            System.out.println("Out of bounds");
        }else{
            System.out.println("Value at given index is "+arr[index]);
        }
        
    }

}
