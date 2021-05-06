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
public class Mammal extends Animal implements Amphibians, Aquatic {

    private boolean canFly;

    public Mammal(boolean canFly, String name) {
        super(name);
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return " canFly=" + canFly;
    }

    @Override
    public String typeOfAnimal() {
        return "both water and land";
    }

}
