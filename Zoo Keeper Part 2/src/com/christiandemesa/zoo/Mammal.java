package com.christiandemesa.zoo;

class Mammal {

    // Member variable is protected so the Gorilla class can inherit it
    protected int energyLevel;

    // Constructors
    public Mammal() {
        this.energyLevel = 10;
    }

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    // Energy level getter
    public int getEnergyLevel() {
        return energyLevel;
    }

    // Energy level setter
    public void setEnergyLevel() {
        if(energyLevel >= 0) {
            this.energyLevel = energyLevel;
        }
        else {
            System.out.printf("Please choose a non-negative number.");
        }
    }

    // Shows the mammal's energy level
    public int displayEnergy() {
        System.out.println(this.energyLevel);
        return this.energyLevel;
    }
    
}