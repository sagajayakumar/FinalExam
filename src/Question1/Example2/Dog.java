/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1.Example2;

/**
 *
 * @author Jaya Kumar
 */
public class Dog extends Animal implements Amphibians {

    private String owner;
    private int age;

    public Dog(String name, String owner, int age) {
        super(name);
        this.owner = owner;
        this.age = age;
    }

    @Override
    public String toString() {
        return "owner=" + owner + ", age=" + age;
    }

    @Override
    public String typeOfAnimal() {
        return "land";
    }

}
