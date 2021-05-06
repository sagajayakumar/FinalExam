/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1.Example2;

/**
 *
 * @author Jaya Kumar Saga
 */
public class AnimalDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 1: Jaya Kumar Saga");
        Animal d = new Dog("Penny", "sam", 5);
        System.out.println(d.toString());

        Animal m = new Mammal(false, "frog");
        System.out.println("Mamal " + m.toString());
        System.out.println(m.typeOfAnimal());
    }

}
