package com.christiandemesa.zoo;

class Gorilla extends Mammal {

    // Constructor
    public Gorilla() {
        super();
    }

    // Decreases gorilla's energy level
    public void throwSomething() {
        if(energyLevel >= 5) {
            System.out.println("I think the gorilla just threw mud at you. Well... I think it's mud...");
            energyLevel -= 5;
            super.displayEnergy();
        }
        else {
            System.out.println("The gorilla doesn't have enough energy.");
            super.displayEnergy();
        }
    }

    // Increases gorilla's energy level
    public void eatBananas() {
        System.out.printf("The gorilla ate SIX FOOT, SEVEN FOOT, EIGHT FOOT BUNCH of bananas!\n");
        energyLevel += 5;
        super.displayEnergy();
    }

    // Decrease gorilla's energy level
    public void climb() {
        if(energyLevel >= 10) {
            System.out.printf("Is that gorilla climbing up the Empire State Building? And is it swatting down those planes?!\n");
            energyLevel -= 10;
            super.displayEnergy();
        }
        else {
            System.out.println("The gorilla doesn't have enough energy.\n");
            super.displayEnergy();
        }
    }

}