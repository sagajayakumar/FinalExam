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
public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + " name=" + name;
    }

    public abstract String typeOfAnimal();
}
