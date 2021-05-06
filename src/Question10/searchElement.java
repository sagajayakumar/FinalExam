/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.ArrayList;

/**
 *
 * @author Jaya Kumar Saga
 */
public class searchElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 10: Jaya Kumar Saga");
        ArrayList<String> A = new ArrayList<>();
        A.add("sam");
        A.add("Brain");
        A.add("Jack");
        A.add("Arya");
        A.add("Matt");
        String s = "Jack";
        int l = A.size()-1;
        serElement(A, 0,l , s);
    }
    private static void serElement(ArrayList arr, int sm, int l, String n) {
        if(l <1){
            System.out.println("Element is not present");
        }
       else if(arr.get(sm) == n){
            System.out.println("Element "+n+" is present at " +sm+ " index of array");
        }
       else if(arr.get(l)==n){
            System.out.println("Element "+n+" is present at " +l+ " index of array");
        }else{
            serElement(arr, sm+1, l-1, n);
       }
    }
    
}
